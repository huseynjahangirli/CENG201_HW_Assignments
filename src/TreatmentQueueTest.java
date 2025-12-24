// Test class for Task 2
public class TreatmentQueueTest {
    public static void main(String[] args) {

        // Queue example was created.
        TreatmentQueue newQueue = new TreatmentQueue();

        System.out.println("Enqueueing Patients (Adding 1 to 8)");

        newQueue.enqueue(new TreatmentRequest(1));
        newQueue.enqueue(new TreatmentRequest(2));
        newQueue.enqueue(new TreatmentRequest(3));
        newQueue.enqueue(new TreatmentRequest(4));
        newQueue.enqueue(new TreatmentRequest(5));
        newQueue.enqueue(new TreatmentRequest(6));
        newQueue.enqueue(new TreatmentRequest(7));
        newQueue.enqueue(new TreatmentRequest(8));

        // Show queue before deleting
        newQueue.printQueue();

        // Removing first 3 patients
        System.out.println("Processing Patients (Dequeue 3 times)");
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();

        // Show remaining queue
        System.out.println("Remaining Queue");
        newQueue.printQueue();
    }
}