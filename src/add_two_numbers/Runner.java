package add_two_numbers;

public class Runner {
    public static void main(String[] args) {
        ListNode first1 = new ListNode(3, null);
        ListNode first2 = new ListNode(4, first1);
        ListNode first3 = new ListNode(2, first2);

        ListNode second1 = new ListNode(4, null);
        ListNode second2 = new ListNode(6, second1);
        ListNode second3 = new ListNode(5, second2);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(first3, second3);

        do {
            System.out.print(result.val + " ");
            result = result.next;
        } while (result != null);
    }
}
