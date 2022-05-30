package LeetCode.剑指Offer._220530.剑指offer._09;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yqy
 * @Date: 2022/05/30/21:00
 * @Description:
 */
public class CQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()){
            if (inStack.isEmpty()){
                return -1;
            }
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
