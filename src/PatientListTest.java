public class PatientListTest {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();

        patientList.addPatient(new Patient(10, "Mehmet Yılmaz", 5, 33));
        patientList.addPatient(new Patient(11, "Cevdet Yıldırım", 3, 25));
        patientList.addPatient(new Patient(12, "Mustafa Bakırcı", 7, 41));
        patientList.addPatient(new Patient(13, "Veysel Çalışkan", 4, 21));
        patientList.addPatient(new Patient(14, "Harun Çakır", 2, 45));

        System.out.println("---Initial List");
        patientList.printList();

        System.out.println("---Removing Patient (ID: 12)");
        patientList.removePatient(12);

        System.out.println("---Searching For Patient (ID: 13)");
        Patient p = patientList.findPatient(13);

        if (p != null) {
            System.out.println("---Patient Found: " + p.name);
        }
        else {
            System.out.println("---Patient Not Found");
        }
        System.out.println("---Final List");
        patientList.printList();
    }
}
