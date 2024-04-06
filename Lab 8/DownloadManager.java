import java.io.*;
import java.net.*;
import java.util.concurrent.*;

class DownloadTask implements Runnable {
    private String url;
    private String fileName;
    private int startByte;
    private int endByte;

    public DownloadTask(String url, String fileName, int startByte, int endByte) {
        this.url = url;
        this.fileName = fileName;
        this.startByte = startByte;
        this.endByte = endByte;
    }

    @Override
    public void run() {
        try {
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("Range", "bytes=" + startByte + "-" + endByte);
            try (InputStream in = connection.getInputStream();
                 RandomAccessFile out = new RandomAccessFile(fileName, "rw")) {
                out.seek(startByte);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("Downloaded: " + fileName + " (" + (endByte - startByte + 1) + " bytes)");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class DownloadManager {
    private static final int NUM_THREADS = 4; // Number of concurrent download threads

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        String url = "https://github.com/DeepthiDayanand/DeepthiDayanand.github.io.git"; // URL of the file to download
        String fileName = "Example file"; // Name of the downloaded file
        int fileSize = 10000000; // Size of the file in bytes (for example purposes)
        int chunkSize = fileSize / NUM_THREADS;
        
        for (int i = 0; i < NUM_THREADS; i++) {
            int startByte = i * chunkSize;
            int endByte = (i == NUM_THREADS - 1) ? fileSize - 1 : (i + 1) * chunkSize - 1;
            Runnable task = new DownloadTask(url, fileName, startByte, endByte);
            executor.execute(task);
        }

        executor.shutdown();
    }
}
