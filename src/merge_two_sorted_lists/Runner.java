package merge_two_sorted_lists;

public class Runner {
    public static void main(String[] args) {
        ListNode node1_3 = new ListNode(4);
        ListNode node1_2 = new ListNode(2, node1_3);
        ListNode node1_1 = new ListNode(1, node1_2);

        ListNode node2_3 = new ListNode(4);
        ListNode node2_2 = new ListNode(3, node2_3);
        ListNode node2_1 = new ListNode(1, node2_2);

        System.out.println("First list:");
        printLinkedList(node1_1);

        System.out.println("\nSecond list:");
        printLinkedList(node2_1);

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(node1_1, node2_1);

        System.out.println("\nResult:");
        printLinkedList(result);
    }

    private static void printLinkedList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println("");
    }
}
