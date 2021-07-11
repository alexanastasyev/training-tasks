package remove_nth_node_from_end_of_list;

/*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.

    https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            listSize++;
        }
        int removeIndex = listSize - n;
        if (removeIndex == 0) {
            head = head.next;
        }
        currentNode = head;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentIndex == removeIndex - 1) {
                if (currentNode.next.next != null) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                }
                break;
            } else {
                currentNode = currentNode.next;
                currentIndex++;
            }
        }
        return head;
    }
}
