import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr){
        if(arr.length != 0){
            ListNode head = new ListNode(arr[0]);
            ListNode curr = head;
            for(int i = 1; i < arr.length; i++){
                curr.next = new ListNode(arr[i]);
                curr = curr.next;
            }

            this.val = head.val;
            this.next = head.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
