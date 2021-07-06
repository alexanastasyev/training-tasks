package add_two_numbers;

/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode();
        ListNode headNode = currentNode;
        ListNode nextNode = new ListNode();

        int units = (l1.val + l2.val) % 10;
        int decades = (l1.val + l2.val) / 10;
        currentNode.val = units;
        l1 = l1.next;
        l2 = l2.next;
        if (l1 != null || l2 != null || decades != 0) {
            currentNode.next = nextNode;
        }

        while (l1 != null || l2 != null || decades != 0) {
            currentNode = nextNode;
            nextNode = new ListNode();

            int num1 = 0;
            if (l1 != null) {
                num1 = l1.val;
            }
            int num2 = 0;
            if (l2 != null) {
                num2 = l2.val;
            }

            currentNode.val = (decades + num1 + num2) % 10;
            decades = (decades + num1 + num2) / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if (l1 != null || l2 != null || decades != 0) {
                currentNode.next = nextNode;
            }
        }
        return headNode;
    }
}
