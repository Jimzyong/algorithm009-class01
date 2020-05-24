package leetcode;

//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表
public class MergeListNode {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return  l2;
        }
        if(l2==null){
            return  l1;
        }
        if(l2.val>l1.val){
            l1=l1.next;
            mergeTwoLists(l1,l2);
            return l1;
        }else{
            l2=l2.next;
            mergeTwoLists(l1,l2);
            return l2;
        }


    }
}


class  ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
