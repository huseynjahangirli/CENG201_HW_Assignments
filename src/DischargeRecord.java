public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int id) { // Constructor to set up the record
        this.patientId = id;
        this.dischargeTime = System.currentTimeMillis();
    }
}