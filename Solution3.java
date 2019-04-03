/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
* 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
*思路：遍历的时候将其存入栈里面
*
*/
import java.util.Stack;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListNode temp = listNode;
        while(temp != null ){
            stack.push(temp.val);
            temp=temp.next;
            
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

}