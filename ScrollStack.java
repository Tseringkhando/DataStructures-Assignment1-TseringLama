// Coding Challenge 3: The Stack of Ancient Texts
// Class representing a stack of scrolls
public class ScrollStack {
    private String[] stack;
    private int top;

    public ScrollStack() {
        stack = new String[10];
        top = -1; // Stack is initially empty
    }

    // Push a new scroll onto the stack
    public void pushScroll(String scroll) {
        if (top < stack.length - 1) {
            stack[++top] = scroll;
        } else {
            System.out.println("Stack is full.");
        }
    }

    // Pop the top scroll off the stack
    public void popScroll() {
        if (top >= 0) {
            stack[top--] = null;
        } else {
            System.out.println("Stack is empty.");
        }
    }

    // Peek/ display at the top scroll without removing it
    public String peekScroll() {
        if (top >= 0) {
            return stack[top];
        } else {
            return "Stack is empty.";
        }
    }

    // Check if a specific scroll exists in the stack
    public boolean containsScroll(String scroll) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].equals(scroll)) {
                return true;
            }
        }
        return false;
    }
}
