import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsFinder {

    public static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2) {
        // HashSet to store unique elements of arr1
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // ArrayList to store common elements
        ArrayList<Integer> commonElements = new ArrayList<>();
        // Iterate through arr2 and check if elements exist in the HashSet
        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
                // Remove the element from the set to avoid duplicates in the result
                set.remove(num);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array 1
        System.out.println("Enter elements of array 1 separated by spaces:");
        String[] input1 = scanner.nextLine().split("\\s+");
        int[] arr1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        // Input array 2
        System.out.println("Enter elements of array 2 separated by spaces:");
        String[] input2 = scanner.nextLine().split("\\s+");
        int[] arr2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        // Find common elements
        ArrayList<Integer> result = findCommonElements(arr1, arr2);
        System.out.println("Common elements: " + result);

        scanner.close();
    }
}
