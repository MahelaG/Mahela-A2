public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();

    }
    public void partThree() {
        // Implementation for part three
        // Create a new Ride object
        Employee operator = new Employee("Mahala", 24, "Male", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 12, operator, 1);

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
        // Create a new Ride object
        Employee operator = new Employee("Sham", 35, "Female", "E002", "Operator");
        Ride thunderstorm = new Ride("Thunderstorm", 10, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Tomy", 12, "Male", "V006", "Regular");
        Visitor visitor2 = new Visitor("Sherry", 14, "Female", "V007", "Regular");
        Visitor visitor3 = new Visitor("Ken", 13, "Male", "V008", "Regular");
        Visitor visitor4 = new Visitor("Danial", 15, "Male", "V009", "Regular");
        Visitor visitor5 = new Visitor("Anni", 16, "Female", "V010", "Regular");

        // Add visitors to the collection
        thunderstorm.addVisitorToRideHistory(visitor1);
        thunderstorm.addVisitorToRideHistory(visitor2);
        thunderstorm.addVisitorToRideHistory(visitor3);
        thunderstorm.addVisitorToRideHistory(visitor4);
        thunderstorm.addVisitorToRideHistory(visitor5);

        // Check if a visitor is in the collection
        thunderstorm.isVisitorInRideHistory(visitor3);

        // Print the number of visitors in the collection
        thunderstorm.getNumberOfVisitorsInRideHistory();

        // Print all visitors in the collection
        thunderstorm.printRideHistory();
    }

    public void partFourB() {
        // Implementation for part four B
        // Create a new Ride object
        Employee operator = new Employee("Lisa", 40, "Female", "E003", "Operator");
        Ride ferrisWheel = new Ride("Ferris Wheel", 8, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Kim", 12, "Male", "V011", "Regular");
        Visitor visitor2 = new Visitor("Saf", 14, "Male", "V012", "Regular");
        Visitor visitor3 = new Visitor("Rose", 13, "Female", "V013", "Regular");
        Visitor visitor4 = new Visitor("Jemmie", 15, "Female", "V014", "Regular");
        Visitor visitor5 = new Visitor("Branch", 11, "Male", "V015", "Regular");

        // Add visitors to the collection
        ferrisWheel.addVisitorToRideHistory(visitor1);
        ferrisWheel.addVisitorToRideHistory(visitor2);
        ferrisWheel.addVisitorToRideHistory(visitor3);
        ferrisWheel.addVisitorToRideHistory(visitor4);
        ferrisWheel.addVisitorToRideHistory(visitor5);

        // Print all visitors in the collection
        System.out.println("Before sorting:");
        ferrisWheel.printRideHistory();

        // Sort the collection
        ferrisWheel.sortRideHistory();

        // Print all visitors in the collection again to show that the collection has been sorted
        System.out.println("After sorting:");
        ferrisWheel.printRideHistory();
    }

    public void partFive() {
        // Implementation for part five
        // Create a new Ride object
        Employee operator = new Employee("Randi", 27, "Male", "E004", "Operator");
        Ride rollerCoaster = new Ride("Taipan", 12, operator, 3);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("May", 14, "Female", "V016", "Regular");
        Visitor visitor2 = new Visitor("Ran", 16, "Male", "V017", "Regular");
        Visitor visitor3 = new Visitor("Jerry", 15, "Male", "V018", "Regular");
        Visitor visitor4 = new Visitor("Jan", 13, "Female", "V019", "Regular");
        Visitor visitor5 = new Visitor("Nicki", 17, "Female", "V020", "Regular");
        Visitor visitor6 = new Visitor("Kim", 12, "Male", "V021", "Regular");
        Visitor visitor7 = new Visitor("Mel", 16, "Female", "V022", "Regular");
        Visitor visitor8 = new Visitor("Sam", 15, "Male", "V023", "Regular");
        Visitor visitor9 = new Visitor("Abby", 14, "Female", "V024", "Regular");
        Visitor visitor10 = new Visitor("Sammy", 18, "Male", "V025", "Regular");

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // Print all visitors in the queue
        rollerCoaster.printQueue();

        // Run one cycle
        rollerCoaster.runOneCycle();

        // Print all visitors in the queue after one cycle is run
        rollerCoaster.printQueue();

        // Print all visitors in the collection
        rollerCoaster.printRideHistory();
    }

    public void partSix() {
        // Implementation for part six
        // Create a new Ride object
        Employee operator = new Employee("Richard", 30, "Male", "E004", "Operator");
        Ride rollerCoaster = new Ride("Twin Dragon", 12, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Alice", 15, "Female", "V001", "Regular");
        Visitor visitor2 = new Visitor("Toby", 16, "Male", "V002", "Regular");
        Visitor visitor3 = new Visitor("Willy", 17, "Male", "V003", "Regular");
        Visitor visitor4 = new Visitor("Lila", 16, "Female", "V004", "Regular");
        Visitor visitor5 = new Visitor("Nora", 15, "Female", "V005", "Regular");

        // Add visitors to the ride history
        rollerCoaster.addVisitorToRideHistory(visitor1);
        rollerCoaster.addVisitorToRideHistory(visitor2);
        rollerCoaster.addVisitorToRideHistory(visitor3);
        rollerCoaster.addVisitorToRideHistory(visitor4);
        rollerCoaster.addVisitorToRideHistory(visitor5);

        // Export the Visitor history to a file
        rollerCoaster.writeRideHistoryToFile("rideHistory.csv");
    }

    public void partSeven() {
        // Implementation for part seven
    }
}
