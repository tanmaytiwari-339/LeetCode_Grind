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
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode x1 = l1;
        ListNode x2 = l2;
        
        int carry = 0;
        ListNode head = null;
        while(x1!=null || x2!=null){
            int sum = carry;
            if(x1!=null){
                sum = sum + x1.val;
                x1=x1.next;
            }if(x2!=null){
                sum = sum + x2.val;
                x2 = x2.next;
            }
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            newNode.next = head;
            head = newNode;  
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }
        return reverse(head);        
    }
    
    public ListNode  reverse(ListNode head){
        ListNode prev=null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nex = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry=0;
        ListNode head = null;
        ListNode temp = head;
        while(p1!=null && p2!=null){
            int x = carry + p1.val + p2.val;
            carry = x/10;
            if(head==null){
                ListNode node = new ListNode(x%10);
                head = node;
                temp=head;
            }else{
                ListNode node = new ListNode(x%10);
                temp.next = node;
                temp = temp.next;
            }
            p1=p1.next;
            p2=p2.next;  
        }

        while(p1!=null){
            int x = carry + p1.val;
            carry = x/10;
            ListNode node = new ListNode(x%10);
            temp.next = node;
            temp = temp.next;
            p1=p1.next;
        }
        while(p2!=null){
            int x = carry + p2.val;
            carry = x/10;
            ListNode node = new ListNode(x%10);
            temp.next = node;
            temp = temp.next;
            p2=p2.next;
        }
        if(carry!=0){
            ListNode node = new ListNode(carry);
            temp.next = node;
        }
        return head;
    }

}