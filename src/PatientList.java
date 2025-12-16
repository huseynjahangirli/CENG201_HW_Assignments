public class PatientList {

    private Node head;

    private class Node {
        Patient patient;
        Node next;

        public Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }
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
    public void removePatient(int id) {
        if (head == null) {
            System.out.println("Patient list is empty");
            return;
        }
        if (head.patient.id == id) {
            head = head.next;
            System.out.println(id + " has been removed");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.patient.id != id) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Patient not found: " + id);
        }
        else  {
            current.next = current.next.next;
            System.out.println(id + " has been removed");
        }
    }
    public Patient findPatient(int id) {
        Node current = head;
        while (current != null) {
            if (current.patient.id == id) {
                return current.patient;
            }
            current = current.next;
        }
        return null;
    }
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("Patient list is empty");
            return;
        }
        System.out.println("Patient list is : ");
        while (current != null) {
            System.out.println("ID: " + current.patient.id + ", Name: " + current.patient.name + ", Severity: " + current.patient.severity + ", Age: " + current.patient.age);
            current = current.next;
        }
    }
}
