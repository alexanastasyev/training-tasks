package remove_nth_node_from_end_of_list;

public class Runner {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Before:");
        printList(node1);

        new Solution().removeNthFromEnd(node1, 2);

        System.out.println("\nAfter:");
        printList(node1);
    }

    private static void printList(ListNode head) {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.val + "->");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.val);
    }
}
