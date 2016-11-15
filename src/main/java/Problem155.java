import java.util.Stack;

/**
 * @author anobis
 */
public class Problem155 {
    public static void main(String[] args) {
        
    }

    public static class MinStack {
        private final Stack<Integer> mainStack;
        private final Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            mainStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            mainStack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            int tmp = mainStack.pop();
            if (tmp == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
