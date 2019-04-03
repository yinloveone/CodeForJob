/*
*用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*思路：在出栈的时时候，stack2不为空的时候，出栈
*若为空，stack出栈存入stack1
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