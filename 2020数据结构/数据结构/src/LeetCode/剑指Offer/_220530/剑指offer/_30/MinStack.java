package LeetCode.剑指Offer._220530.剑指offer._30;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: yqy
 * @Date: 2022/05/30/21:16
 * @Description:
 * 定义栈的数据结构，请在该类型中
 * 实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    public MinStack() {
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);

    }

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    /**
     * 直接返回栈 AAA 的栈顶元素即可
     * @return
     */
    public int top() {
        return stack.peek();
    }

    /**
     * 直接返回栈 BBB 的栈顶元素即可
     * @return
     */
    public int min() {
        return minStack.peek();
    }
}
