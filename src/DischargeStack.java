public class DischargeStack {

    private StackNode stackTop;

    private class StackNode { // Hold data
        DischargeRecord data;
        StackNode next;

        public StackNode(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isStackEmpty() { // The method to check if stack is empty
        return stackTop == null;
    }

    public void push(DischargeRecord record) { // Add the top (LIFO logic)
        StackNode newNode = new StackNode(record);
        if (isStackEmpty()) { // If stack is empty, this is first element
            stackTop = newNode;
        }
        else {
            newNode.next = stackTop;
            stackTop = newNode;
        }
    }

    public DischargeRecord pop() { // Removing the top element
        if (isStackEmpty()) {
            System.out.println("Warning: The stack is empty, cannot pop.");
            return null;
        }
        DischargeRecord itemToReturn = stackTop.data; // Save data to return it later
        stackTop = stackTop.next;
        return itemToReturn;
    }

    public DischargeRecord peek() { // Just look at the top without removing
        if (isStackEmpty()) {
            return null;
        }
        return stackTop.data;
    }

    public void printStack() { // Show in the stack
        if (isStackEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("---Discharge History");
        for (StackNode current = stackTop; current != null; current = current.next) { // Use for loop to traverse
            System.out.println("Patient ID: " + current.data.patientId +
                    " | Time: " + current.data.dischargeTime);
        }
    }
}