import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;

public class Ride implements RideInterface {
    private String rideName;
    private int minAge;
    private Employee operator;
    private Queue<Visitor> visitorQueue;
    private List<Visitor> rideHistory;



    public Ride(String rideName, int minAge, Employee operator){
        this.setRideName(rideName);
        this.setMinAge(minAge);
        this.setOperator(operator);
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new ArrayList<>();
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
//            String historyEntry = "Visitor " + visitor.getName() + " enjoyed the ride " + rideName;
            rideHistory.add(visitor);
            System.out.println("Running one cycle with visitor: " + visitor.getName());
        } else {
            System.out.println("No visitors in the queue for the ride.");
        }
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
    public void addVisitorToRideHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history.");
    }

    public boolean isVisitorInRideHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println(visitor.getName() + (found ? " is" : " is not") + " in the ride history.");
        return found;
    }

    public int getNumberOfVisitorsInRideHistory() {
        int count = rideHistory.size();
        System.out.println("Number of visitors in ride history: " + count);
        return count;
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }
}
