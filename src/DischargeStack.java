public class DischargeStack {

    private Node top;

    private class Node { // Inner class for stack node
        DischargeRecord record;
        Node next;

        public Node(DischargeRecord record) {
            this.record = record;
            this.next = null;
        }
    }

    public void push(DischargeRecord record) { // Method to add record to the top (Push)
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
    }

    public DischargeRecord pop() { // Method to remove the top record (Pop)
        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }
        DischargeRecord temp = top.record; // Save the top data
        top = top.next;
        return temp;
    }

    public DischargeRecord peek() { // Method to check the top record without removing (Peek)
        if (top == null) {
            return null;
        }
        return top.record;
    }

    public void printStack() { // Method to print all discharge records
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("---Discharge History (Stack)");
        Node current = top;
        while (current != null) {
            System.out.println("Patient ID: " + current.record.patientId + ", Time: " + current.record.dischargeTime);
            current = current.next;
        }
    }
}