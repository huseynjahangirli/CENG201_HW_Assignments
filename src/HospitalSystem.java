import java.util.HashMap;

public class HospitalSystem {

    // Components from previous tasks
    PatientList pList;
    TreatmentQueue normalQ; // Normal requests (We use two queues)
    TreatmentQueue emergencyQ; // Priority requests (Task 4 requirement)
    DischargeStack stack;

    HashMap<Integer, Patient> patientMap;

    // All data structures are created within the constructor.
    public HospitalSystem() {
        pList = new PatientList();
        normalQ = new TreatmentQueue();
        emergencyQ = new TreatmentQueue();
        stack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    // 1. A new patient record has been created.
    public void addPatient(Patient p) {
        pList.addPatient(p);
        patientMap.put(p.id, p);
        System.out.println("Registered: " + p.name + " (ID: " + p.id + ")");
    }

    // 2. Priority Treatment Request Added.
    public void addTreatmentRequest(int id, boolean isUrgent) {

        if (patientMap.containsKey(id)) { // Check if patient exists in a system
            TreatmentRequest tRequest = new TreatmentRequest(id, isUrgent);

            if (isUrgent) {
                System.out.println("(URGENT) Adding ID " + id + " to Emergency Queue.");
                emergencyQ.enqueue(tRequest);
            } else {
                System.out.println("(Normal) Adding ID " + id + " to Normal Queue.");
                normalQ.enqueue(tRequest);
            }
        } else {
            System.out.println("Patient ID: " + id + " not found!");
        }
    }

    // 3. Emergency Priority.
    public void processTreatment() {
        TreatmentRequest tRequest = null;

        tRequest = emergencyQ.dequeue(); // Always check Emergency Queue First

        if (tRequest == null) { // If no emergency, check Normal Queue
            tRequest = normalQ.dequeue();
        }

        if (tRequest != null) { // If we found a patient, treat and discharge
            System.out.println("Treating Patient ID: " + tRequest.patientId);

            DischargeRecord rec = new DischargeRecord(tRequest.patientId); // Create discharge record and push to Stack
            stack.push(rec);
        }
        else {
            System.out.println("No patients waiting to be treated.");
        }
    }

    // 4. Manual Discharge required for test scenario.
    public void addDischarge(int patientId) {
        DischargeRecord rec = new DischargeRecord(patientId);
        stack.push(rec);
        System.out.println("Discharge Record added for ID: " + patientId);
    }

    // 5. Patients were sorted. (Task 4 Sorting)
    public void sortPatients() {
        System.out.println("Sorting patients by severity:");
        pList.sortBySeverity();
    }

    // 6. System Status Printed.
    public void printSystemState() {
        System.out.println("\nHOSPITAL SYSTEM DASHBOARD");

        System.out.println("\nPatients:");
        pList.printList();

        System.out.println("\nEmergency Queue:");
        emergencyQ.printQueue();

        System.out.println("\nNormal Queue:");
        normalQ.printQueue();

        System.out.println("\nDischarge History - Stack");
        stack.printStack();
    }
}