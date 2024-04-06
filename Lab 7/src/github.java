import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class for a repository item
abstract class RepositoryItem {
    protected int id;
    protected String name;
    protected String description;
    protected String programmingLanguage;
    protected int stars;

    public RepositoryItem(int id, String name, String description, String programmingLanguage, int stars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.programmingLanguage = programmingLanguage;
        this.stars = stars;
    }

    // Abstract method to display item details
    public abstract void display();
}

// Concrete class for a code repository, inheriting from RepositoryItem
class Repository extends RepositoryItem {
    public Repository(int id, String name, String description, String programmingLanguage, int stars) {
        super(id, name, description, programmingLanguage, stars);
    }

    // Override method to display repository details
    @Override
    public void display() {
        System.out.println("Repository ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Number of Stars: " + stars);
    }
}

// Concrete class for the code catalog
class CodeCatalog {
    private List<RepositoryItem> repositories;

    public CodeCatalog() {
        repositories = new ArrayList<>();
    }

    // Method to add a repository to the catalog
    public void addRepository(RepositoryItem repository) {
        repositories.add(repository);
    }

    // Method to display all repositories in the catalog
    public void displayAllRepositories() {
        System.out.println("All Repositories:");
        for (RepositoryItem repository : repositories) {
            repository.display();
            System.out.println(); // Empty line for separation
        }
    }
}

public class github {
    public static void main(String[] args) {
        // Create a code catalog
        CodeCatalog catalog = new CodeCatalog();
        Scanner scanner = new Scanner(System.in);

        // Input repository details from the user
        System.out.println("Enter Repository ID, Project Name, Description, Programming Language, Number of Stars (comma-separated):");
        String input = scanner.nextLine();

        // Split the input string by comma
        String[] parts = input.split(",");
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        String description = parts[2].trim();
        String language = parts[3].trim();
        int stars = Integer.parseInt(parts[4].trim());

        // Create and add the repository to the catalog
        RepositoryItem repository = new Repository(id, name, description, language, stars);
        catalog.addRepository(repository);

        // Display all repositories in the catalog
        catalog.displayAllRepositories();

        scanner.close();
    }
}
