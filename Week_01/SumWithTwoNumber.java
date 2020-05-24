package leetcode;

/**
 * 给出两个非空的链表用来表示俩个非负整数，其中，他们的
 * 位数是按照逆序的方式存储的，并且他们的节点只能存储一位
 * 数字，如果我们将这两个数相加，则返回一个新的链表来表示他们的
 * 和，您可以假设除了数字0之外，这两个数字都不会1以0开头
 *
 * 输入（2->4->3)+(5->6->4)
 * 输出 7->0->8
 * 原因 342+465
 */
public class SumWithTwoNumber {

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(4);



        ListNode l2=new ListNode(5);
        l2.next=new ListNode(4);
        l2.next.next=new ListNode(8);

        ListNode l3=addTwoNumbers(l1,l2);
        while (l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){

        ListNode dummyHead=new ListNode(0);
        ListNode p=l1,q=l2,curr=dummyHead;
        int carry=0;
        while (p!=null||q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;

        }
        if (carry>0){
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }

    }
}
