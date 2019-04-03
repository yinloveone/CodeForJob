/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
* ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList
*˼·��������ʱ�������ջ����
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