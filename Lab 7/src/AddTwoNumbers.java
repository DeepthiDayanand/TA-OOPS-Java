import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    // Helper method to print the result linked list
    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Method to handle user input and create linked lists
    public ListNode[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for list 1 (space-separated):");
        String[] nums1Str = scanner.nextLine().trim().split(" ");
        System.out.println("Enter elements for list 2 (space-separated):");
        String[] nums2Str = scanner.nextLine().trim().split(" ");

        ListNode l1 = createList(nums1Str);
        ListNode l2 = createList(nums2Str);

        return new ListNode[]{l1, l2};
    }

    // Helper method to create a linked list from an array of integers represented as strings
    public ListNode createList(String[] numsStr) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (String numStr : numsStr) {
            int num = Integer.parseInt(numStr);
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode[] lists = solution.getUserInput();
        ListNode result = solution.addTwoNumbers(lists[0], lists[1]);
        System.out.print("Result: ");
        solution.printList(result);
    }
}
