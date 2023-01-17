public class Person {
    private String name;
    private String designation;

    public void learn() {
        System.out.println(name + ", the power in self-learning");
    }
    public void walk(){
        System.out.print("If you are tired, walk a lot!");
    }
    public void eat(){
        System.out.println(" Or eat something tasty, yummy) ");
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
