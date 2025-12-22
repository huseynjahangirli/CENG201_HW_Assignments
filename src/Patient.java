public class Patient {

    int id;
    String name;
    int severity; // Severity level of the illness (1-10)
    int age;

    public Patient(int id, String name, int severity, int age) { // Constructor to patient details
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
}