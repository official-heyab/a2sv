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
    public ListNode middleNode(ListNode head) {
        int length = getLen(head);
        int middleLength = length / 2;
        ListNode x = head;
        while (middleLength != 0) {
            x = x.next;
            middleLength--;
        }
        return x;
    }

    public int getLen(ListNode x){
        int length = 0;
        while (x != null) {
            length++;
            x = x.next;
        }
        return length;
    }
}