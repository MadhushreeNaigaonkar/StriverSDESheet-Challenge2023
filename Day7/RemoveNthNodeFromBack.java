package Day7;

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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        //if Single element list, thus returning empty list
        if(head.next == null)
            return null;

        ListNode ptr = head;
        ListNode ptr2 = head;

        int len = 0;

        //finding the lenght of the list
        while(ptr != null)
        {
            len++;
            ptr = ptr.next;
        }

        //required index
        int index = len - n;
        ptr = head;

        boolean start = false;

        while(true)
        {
            if(index == 0)
            {
                // if head element
                if(ptr == head)
                {
                    ptr2 = ptr2.next;
                    ptr.next = null;
                    head = ptr2;
                    break;
                }

                else
                {
                    ptr2.next = ptr.next;
                    ptr.next = null;
                    break;
                }
            }

            index--;

            //for letting the second pointer start late
            if(start)
                ptr2 = ptr2.next;

            start = true;

            ptr = ptr.next;
        }    

        return head;    
    }
}
