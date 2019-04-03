/*
*������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
*˼·���ڳ�ջ��ʱʱ��stack2��Ϊ�յ�ʱ�򣬳�ջ
*��Ϊ�գ�stack��ջ����stack1
*/

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
         int result; 
        if(stack2.empty()){ 
            while(!stack1.empty())
            { 
                stack2.push(stack1.pop());  
            } 
        } 
        result = stack2.pop(); 
        return result;
    }
}