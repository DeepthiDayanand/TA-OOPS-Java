import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class WordFrequencyTask implements Runnable {
    private String[] words;
    private Map<String, Integer> wordFrequencyMap;

    public WordFrequencyTask(String[] words, Map<String, Integer> wordFrequencyMap) {
        this.words = words;
        this.wordFrequencyMap = wordFrequencyMap;
    }

    @Override
    public void run() {
        for (String word : words) {
            synchronized (wordFrequencyMap) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
    }
}

public class WordFrequencyCounter {
    private static final int NUM_THREADS = 4; // Number of concurrent threads

    public static void main(String[] args) {
        // Read the text file
        String fileName = "sample.txt"; // Replace with the path to your text file
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder textBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
            String text = textBuilder.toString();

            // Split the text into chunks
            String[] words = text.split("\\s+");

            // Create thread pool
            ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

            // Split words into chunks and create tasks for each chunk
            int chunkSize = words.length / NUM_THREADS;
            for (int i = 0; i < NUM_THREADS; i++) {
                int start = i * chunkSize;
                int end = (i == NUM_THREADS - 1) ? words.length : (i + 1) * chunkSize;
                String[] chunk = new String[end - start];
                System.arraycopy(words, start, chunk, 0, end - start);
                Runnable task = new WordFrequencyTask(chunk, wordFrequencyMap);
                executor.execute(task);
            }

            // Shut down the executor
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            // Output word frequency count
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
