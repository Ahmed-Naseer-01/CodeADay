// 2130. Maximum Twin Sum of a Linked List

// In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

// For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
// The twin sum is defined as the sum of a node and its twin.

// Given the head of a linked list with even length, return the maximum twin sum of the linked list.
// example :
// Input: head = [4,2,2,3]
// Output: 7
// Explanation:
// The nodes with twins present in this linked list are:
// - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
// - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
// Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxval = 0;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nextNode, prevNode = null;
        while(slow!=null)
        {
            nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }
        ListNode TempNode = head;
        while(prevNode != null)
        {
            
            maxval= Math.max(maxval, TempNode.val + prevNode.val);
            prevNode = prevNode.next;
            TempNode = TempNode.next;
        }
        return maxval;
    }
}
