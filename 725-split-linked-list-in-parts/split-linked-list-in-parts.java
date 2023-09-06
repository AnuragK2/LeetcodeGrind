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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res=new ListNode[k];
        if(head==null){
            return res;
        }
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int n=len/k;
        int extran=len%k;
        int index=0;
        curr=head;
        while(curr!=null){
            ListNode tmp=curr;
            int diff=extran<=0?0:1;
            for(int i=0;i<n+diff-1;i++){
                curr=curr.next;
            }
            ListNode temp=curr.next;
            curr.next=null;
            curr=temp;
            res[index++]=tmp;
            extran--;
        }
        return res;
    }
}