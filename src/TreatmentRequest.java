public class TreatmentRequest {

    // The ID of the patient
    int patientId;

    // Arrival time in milliseconds
    long arrivalTime;

    // Constructor to create a new request
    public TreatmentRequest(int patientId) {
        this.patientId = patientId;

        // Get current time from system
        this.arrivalTime = System.currentTimeMillis();
    }
}
