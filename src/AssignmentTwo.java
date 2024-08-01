public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();

    }
    public void partThree() {
        // Implementation for part three
        // Create a new Ride object
        Employee operator = new Employee("Mahala", 24, "Male", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 12, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Suzan", 14, "Female", "V001", "Regular");
        Visitor visitor2 = new Visitor("Sadaru", 16, "Male", "V002", "Regular");
        Visitor visitor3 = new Visitor("Prabu", 15, "Male", "V003", "Regular");
        Visitor visitor4 = new Visitor("Renuka", 13, "Female", "V004", "Regular");
        Visitor visitor5 = new Visitor("Gian", 17, "Male", "V005", "Regular");

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue(visitor3);

        // Print all visitors in the queue
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        // Implementation for part four A
    }

    public void partFourB() {
        // Implementation for part four B
    }

    public void partFive() {
        // Implementation for part five
    }

    public void partSix() {
        // Implementation for part six
    }

    public void partSeven() {
        // Implementation for part seven
    }
}
