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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        List<Integer> criticals=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)) criticals.add(i);
            else if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)) criticals.add(i);
        }
        if(criticals.size()<=1) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<criticals.size()-1;i++){
            min=Math.min(min,(criticals.get(i+1)-criticals.get(i)));
        }
        max=criticals.get(criticals.size()-1)-criticals.get(0);
        return new int[]{min,max};
    }
}