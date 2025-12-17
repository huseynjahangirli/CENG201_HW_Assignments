public class PatientListTest {
    public static void main(String[] args) { // Main method for the test class

        PatientList patientList = new PatientList(); // Create a new PatientList object

        // Add 5 patients to list for testing
        patientList.addPatient(new Patient(10, "Mehmet Yılmaz", 5, 33));
        patientList.addPatient(new Patient(11, "Cevdet Yıldırım", 3, 25));
        patientList.addPatient(new Patient(12, "Mustafa Bakırcı", 7, 41));
        patientList.addPatient(new Patient(13, "Veysel Çalışkan", 4, 21));
        patientList.addPatient(new Patient(14, "Harun Çakır", 2, 45));

        // Print just list
        System.out.println("---Initial List");
        patientList.printList();

        // Remove a patient with ID
        System.out.println("---Removing Patient (ID: 12)");
        patientList.removePatient(12);

        // Search for a patient with ID
        System.out.println("---Searching For Patient (ID: 13)");
        Patient p = patientList.findPatient(13);

        if (p != null) {
            System.out.println("---Patient Found: " + p.name);
        }
        else {
            System.out.println("---Patient Not Found");
        }
        System.out.println("---Final List"); // Print the final PatientList
        patientList.printList();
    }
}
