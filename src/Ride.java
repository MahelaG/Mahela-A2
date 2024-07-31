public class Ride {
    private String rideName;
    private int minAge;
    private Employee operator;


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
}
