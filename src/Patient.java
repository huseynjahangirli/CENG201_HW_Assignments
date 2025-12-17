public class Patient {

    int id; // ID for patient
    String name; // Patients full names
    int severity; // Severity level of the illness (1-10)
    int age; // Patients ages

    // Constructor to patient details
    public Patient(int id, String name, int severity, int age) {
        this.id = id; // Set patient ID
        this.name = name; // Set name
        this.severity = severity; // Set severity level
        this.age = age; // Set age
    }
}