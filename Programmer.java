public class Programmer extends Person{
    private String companyName;
    public void coding(){
        System.out.println("It's time to be a programmer!");
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", designation: " + getDesignation() +
                ", company name is "+ companyName;
    }
}
