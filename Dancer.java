public class Dancer extends Person{
    private String groupName;

    public void dancing(){
        System.out.println("It's time to be a dancer!");
    }
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    @Override
    public String toString() {
        return "name: " + getName() + ", designation: " + getDesignation() +
                ", group name is "+ groupName;
    }


}
