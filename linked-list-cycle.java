public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> mp = new HashSet();
        while(head != null){
            if(mp.contains(head)){
                return true;
            }
            mp.add(head);
            head = head.next;
        }
        return false;
    }
}
