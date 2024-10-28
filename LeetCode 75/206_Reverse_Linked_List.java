// 206. Reverse Linked List
// Given the head of a singly linked list, reverse the list, and return the reversed list.

// example:

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]


// Solution:

// i solved it by recursion method

class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
        
        
    }
}
