import java.util.LinkedList;
import java.util.Queue;


public class Ride implements RideInterface {
    private String rideName;
    private int minAge;
    private Employee operator;
    private Queue<Visitor> visitorQueue = new LinkedList<>();
    private LinkedList<String> rideHistory = new LinkedList<>();



    public Ride(String rideName, int minAge, Employee operator){
        this.setRideName(rideName);
        this.setMinAge(minAge);
        this.setOperator(operator);
    }


    public String Details() {
        return "Rider, rider name: " + getRideName() + ", min age: " + getMinAge() + ", operator: " + getOperator();
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public void assignOperator(Employee operator) {
        this.operator = operator;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor.getAge() >= minAge) {
            visitorQueue.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("Visitor " + visitor.getName() + " is too young for the ride.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("Visitor " + visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue for " + rideName + ":");
        for (Visitor visitor : visitorQueue) {
            System.out.println(visitor.Details());
        }
    }

    @Override
    public void runOneCycle() {
        if (!visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
            String historyEntry = "Visitor " + visitor.getName() + " enjoyed the ride " + rideName;
            rideHistory.add(historyEntry);
            System.out.println(historyEntry);
        } else {
            System.out.println("No visitors in the queue for the ride.");
        }
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        for (String entry : rideHistory) {
            System.out.println(entry);
        }
    }
}
