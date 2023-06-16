package Day8;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
        {
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        //fast=fast.next;
        // while(slow!= fast)
        // {
           
        //     if(fast==null || fast.next==null)
        //     {
        //         return false;
        //     }
        //     slow=slow.next;
        //     fast=fast.next.next;
        //    // return false;
           
        // }
        // return true;
        while(slow!=null)
        {
           if(fast==null || fast.next==null)
            {
                return false;
           } 
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               return true;
           }

        }
        return false;
        
        
    }
}
