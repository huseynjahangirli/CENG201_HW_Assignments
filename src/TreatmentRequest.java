public class TreatmentRequest {

    int patientId;
    long arrivalTime;
    boolean isEmergency; // New boolean for task 4 priority

    public TreatmentRequest(int id) { // Old constructor (for task 2), It is normal
        this.patientId = id;
        this.arrivalTime = System.currentTimeMillis();
        this.isEmergency = false;
    }

    public TreatmentRequest(int id, boolean urgent) { // New constructor (for task 4), we use this when we have emergency
        this.patientId = id;
        this.arrivalTime = System.currentTimeMillis();
        this.isEmergency = urgent;
    }
}