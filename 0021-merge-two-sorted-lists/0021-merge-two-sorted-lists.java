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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode temp = list1;
        ListNode temp2 =list2;
        ListNode dummy = ans;
        
        while(temp!=null && temp2!=null){
            if (temp.val>temp2.val){
                dummy.next = temp2;
                temp2 = temp2.next;
            }else if (temp2.val>=temp.val){
                dummy.next=temp;
                temp=temp.next;
            }
            dummy = dummy.next;
        }if(temp==null){
            dummy.next=temp2;
        }else if (temp2==null){
            dummy.next =temp;
        }
        return ans.next;
    }
}