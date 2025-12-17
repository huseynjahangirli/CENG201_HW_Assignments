public class PatientList {

    private Node head; // Head node the linked list

    private class Node {
        Patient patient;
        Node next;

        public Node(Patient patient) {
            this.patient = patient;
            this.next = null; // Next is null
        }
    }
    public void addPatient(Patient p) { // Method to add new patient to the end
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removePatient(int id) { // Method to remove patient by ID
        if (head == null) { // If list is empty
            System.out.println("Patient list is empty");
            return;
        }
        if (head.patient.id == id) { // If the patient to remove is the head
            head = head.next; // Move head to the next node
            System.out.println(id + " has been removed");
            return;
        }
        Node current = head;
        // Search for the patient
        while (current.next != null && current.next.patient.id != id) {
            current = current.next;
        }
        if (current.next == null) { // If we didn't find the ID
            System.out.println("Patient not found: " + id);
        }
        else  { // Remove the ID
            current.next = current.next.next;
            System.out.println(id + " has been removed");
        }
    }
    public Patient findPatient(int id) { // Method to find and return patient
        Node current = head;
        // Traverse the list
        while (current != null) {
            if (current.patient.id == id) {
                return current.patient; // Found the patient
            }
            current = current.next; // Not found
        }
        return null;
    }
    public void printList() { // Method the print all patients
        Node current = head;
        if (current == null) {
            System.out.println("Patient list is empty");
            return;
        }
        System.out.println("Patient list is : ");
        while (current != null) { // Loop the list and print details
            System.out.println("ID: " + current.patient.id + ", Name: " + current.patient.name + ", Severity: " + current.patient.severity + ", Age: " + current.patient.age);
            current = current.next;
        }
    }
}
