import java.io.*;
import java.util.*;

// Class to represent a music track
class MusicTrack implements Serializable {
    private String title;
    private String artist;
    private String album;
    private int duration; // Duration in seconds

    // Constructor
    public MusicTrack(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

// Class to manage the music library
class MusicLibraryManager implements Serializable {
    private List<MusicTrack> musicTracks;

    // Constructor
    public MusicLibraryManager() {
        this.musicTracks = new ArrayList<>();
    }

    // Method to add a music track
    public void addMusicTrack(MusicTrack track) {
        musicTracks.add(track);
    }

    // Method to remove a music track
    public void removeMusicTrack(String title) {
        musicTracks.removeIf(track -> track.getTitle().equalsIgnoreCase(title));
    }

    // Method to update a music track
    public void updateMusicTrack(String title, String artist, String album, int duration) {
        for (MusicTrack track : musicTracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                track.setArtist(artist);
                track.setAlbum(album);
                track.setDuration(duration);
            }
        }
    }

    // Method to view music tracks
    public void viewMusicTracks() {
        for (MusicTrack track : musicTracks) {
            System.out.println("Title: " + track.getTitle() + ", Artist: " + track.getArtist() + ", Album: " + track.getAlbum() + ", Duration: " + track.getDuration() + " seconds");
        }
    }

    // Serialization method
    public void serializeMusicLibrary(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(musicTracks);
            System.out.println("Music library serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization method
    public void deserializeMusicLibrary(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            musicTracks = (List<MusicTrack>) inputStream.readObject();
            System.out.println("Music library deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Main class to demonstrate the music library management system
public class MusicLibrarySystem {
    public static void main(String[] args) {
        // Create a music library manager
        MusicLibraryManager musicLibraryManager = new MusicLibraryManager();

        // Adding sample music tracks
        MusicTrack track1 = new MusicTrack("Song 1", "Artist 1", "Album 1", 240);
        MusicTrack track2 = new MusicTrack("Song 2", "Artist 2", "Album 2", 180);

        musicLibraryManager.addMusicTrack(track1);
        musicLibraryManager.addMusicTrack(track2);

        // View music tracks
        System.out.println("Music Tracks:");
        musicLibraryManager.viewMusicTracks();

        // Serialization
        musicLibraryManager.serializeMusicLibrary("musicLibrary.ser");

        // Deserialization
        MusicLibraryManager deserializedLibrary = new MusicLibraryManager();
        deserializedLibrary.deserializeMusicLibrary("musicLibrary.ser");

        // View deserialized music tracks
        System.out.println("Deserialized Music Tracks:");
        deserializedLibrary.viewMusicTracks();
    }
}
