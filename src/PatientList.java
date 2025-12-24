// This class was created to keep a list of patients in a linked list format.
public class PatientList {

    private Node head; // Head node the linked list

    private class Node {
        Patient patient;
        Node next;

        public Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }
    // This method is for adding a new patient to the patient list.
    public void addPatient(Patient p) {
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
    // This method was created to remove a patient from the patient list using their identification number.
    public void removePatient(int id) {
        if (head == null) {
            System.out.println("Patient list is empty");
            return;
        }
        if (head.patient.id == id) { // If the patient to remove is the head
            head = head.next;
            System.out.println(id + " has been removed");
            return;
        }
        Node current = head;

        while (current.next != null && current.next.patient.id != id) { // Search for the patient
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
    // It was created to locate the patient using their identification information.
    public Patient findPatient(int id) {
        Node current = head;

        while (current != null) {
            if (current.patient.id == id) {
                return current.patient; // Found the patient
            }
            current = current.next; // Not found
        }
        return null;
    }
    // Method the print all patients
    public void printList() {
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
    // Method For Task 4 Sorting
    public void sortBySeverity() {
        if (head == null) return; // Check if list is empty
        if (head.next == null) return;
        boolean check;

        do { // Simple bubble sort logic
            check = false;
            Node temp = head; // Start from beginning

            while (temp.next != null) {

                if (temp.patient.severity < temp.next.patient.severity) { // if severity is small, swap it
                    Patient p = temp.patient;
                    temp.patient = temp.next.patient;
                    temp.next.patient = p;

                    check = true;
                }
                temp = temp.next; // Go to next node
            }
        } while (check);

        System.out.println("Sorted by severity.");
    }
}