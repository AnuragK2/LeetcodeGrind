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
    static ListNode reverse(ListNode ptr){
        ListNode pre=null;
        ListNode nex=null;
        while(ptr!=null){
            nex=ptr.next;
            ptr.next=pre;
            pre=ptr;
            ptr=nex;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {

        // ArrayList<Integer> arr=new ArrayList<>();
        // while(head!=null){
        //     arr.add(head.val);
        //     head=head.next;
        // }
        // for(int i=0;i<arr.size()/2;i++){
        //     if(arr.get(i)!=arr.get(arr.size()-i-1))
        //     return false;   
        // }
        // return true;

        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while(slow!=null){
            if(dummy.val!=slow.val)
            return false;
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
}