public class HospitalSystemTest {
    public static void main(String[] args) {

        System.out.println("HOSPITAL SYSTEM");

        // 1. Create the system
        HospitalSystem hospital = new HospitalSystem();

        // STEP 1: Add 10 patients to the system
        System.out.println("Registering 10 Patients");

        hospital.addPatient(new Patient(101, "Ali Vural", 8, 30));
        hospital.addPatient(new Patient(102, "Ahmet Yilmaz", 7, 25));
        hospital.addPatient(new Patient(103, "Veli Korkmaz", 2, 40));
        hospital.addPatient(new Patient(104, "Fatma Celik", 8, 70));
        hospital.addPatient(new Patient(105, "Mehmet Oz", 5, 50));
        hospital.addPatient(new Patient(106, "Zeynep Kus", 1, 22));
        hospital.addPatient(new Patient(107, "Can Uzun", 7, 35));
        hospital.addPatient(new Patient(108, "Elif Ak", 4, 29));
        hospital.addPatient(new Patient(109, "Burak Guc", 6, 45));
        hospital.addPatient(new Patient(110, "Seda Bal", 2, 19));

        // STEP 2: Add 5 Normal and 3 Priority requests
        System.out.println("\n--- Step 2: Adding Treatment Requests (5 Normal, 3 Priority) ---");

        // 3 Priority Requests (Urgent)
        hospital.addTreatmentRequest(102, true);
        hospital.addTreatmentRequest(104, true);
        hospital.addTreatmentRequest(107, true);

        // 5 Normal Requests
        hospital.addTreatmentRequest(101, false);
        hospital.addTreatmentRequest(103, false);
        hospital.addTreatmentRequest(105, false);
        hospital.addTreatmentRequest(108, false);
        hospital.addTreatmentRequest(109, false);

        // Check the queues before processing
        System.out.println("\n(Current Status: 3 people in Emergency Queue, 5 in Normal Queue)");

        // STEP 3: Add 2 discharge records
        System.out.println("\n--- Step 3: Adding 2 Manual Discharge Records ---");
        hospital.addDischarge(106);
        hospital.addDischarge(110);

        // STEP 4: Process 4 treatment requests
        System.out.println("\n--- Step 4: Processing 4 Requests (Priority First) ---");

        // Emergency Queue first.
        // We have 3 Priority requests.
        hospital.processTreatment(); // 1. (Urgent)
        hospital.processTreatment(); // 2. (Urgent)
        hospital.processTreatment(); // 3. (Urgent)
        hospital.processTreatment(); // 4. (First Normal)

        // STEP 5: Print the final system state
        System.out.println("\n--- Step 5: Final System State ---");
        hospital.printSystemState();
    }
}