public class TreatmentQueue {

    private Node head;
    private Node tail;

    // Inner class for the queue nodes
    private class Node {
        TreatmentRequest request;
        Node next;

        public Node(TreatmentRequest request) {
            this.request = request;
            this.next = null;
        }
    }

    // Method to add a request to the back (Enqueue)
    public void enqueue(TreatmentRequest t) {
        Node newNode = new Node(t);

        // If queue is empty, head and tail are the same
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            // Add to the end and update tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to remove request from the front (Dequeue)
    public TreatmentRequest dequeue() {
        // If queue is empty, return null
        if (head == null) {
            return null;
        }

        // Get the data from the front
        TreatmentRequest temp = head.request;

        // Move head to the next node
        head = head.next;

        // If queue becomes empty, tail must be null too
        if (head == null) {
            tail = null;
        }

        return temp; // Return the removed request
    }

    // Method to print the queue content
    public void printQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = head;
        System.out.println("---Current Queue");
        while (current != null) {
            // Manually printing fields since we don't have toString
            System.out.println("Patient ID: " + current.request.patientId + ", Time: " + current.request.arrivalTime);
            current = current.next;
        }
    }
}