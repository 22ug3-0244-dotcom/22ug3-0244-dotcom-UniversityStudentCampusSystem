public class ActionStack {

    private static class StackNode {

        String action;
        StackNode next;

        StackNode(String action) {
            this.action = action;
            this.next = null;
        }
    }

    private StackNode top;

    public ActionStack() {
        top = null;
    }

    // Add action to stack
    public void push(String action) {

        StackNode newNode = new StackNode(action);

        newNode.next = top;
        top = newNode;
    }

    // Remove most recent action
    public String pop() {

        if (top == null) {
            return null;
        }

        String action = top.action;
        top = top.next;

        return action;
    }

    // View most recent action
    public String peek() {

        if (top == null) {
            return null;
        }

        return top.action;
    }

    // Display recent actions
    public void display() {

        if (top == null) {
            System.out.println("No recent actions.");
            return;
        }

        System.out.println("\n===== RECENT ACTIONS =====");

        StackNode current = top;

        while (current != null) {

            System.out.println("- " + current.action);

            current = current.next;
        }

        System.out.println("===========================\n");
    }
}