public class DischargeStackTest {

    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack(); // Create the stack

        System.out.println("---Pushing 5 Discharge Records"); // Add 5 discharge records

        stack.push(new DischargeRecord(201));
        stack.push(new DischargeRecord(202));
        stack.push(new DischargeRecord(203));
        stack.push(new DischargeRecord(204));
        stack.push(new DischargeRecord(205));

        stack.printStack();

        System.out.println("---Popping 2 Records"); // 2 records

        DischargeRecord r1 = stack.pop();
        if (r1 != null) {
            System.out.println("Popped Record ID: " + r1.patientId);
        }

        DischargeRecord r2 = stack.pop();
        if (r2 != null) {
            System.out.println("Popped Record ID: " + r2.patientId);
        }

        System.out.println("---Remaining Stack"); // Print the remaining stack
        stack.printStack();
    }
}