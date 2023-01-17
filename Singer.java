public class Singer extends Person{
    private String bandName;
    public void singing(){
        System.out.println("It's time to be a sindger!");
    }
    public void playGuitar(){
        System.out.println("You can do it");
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public String toString() {
        return "name: " + getName() + ", designation: " + getDesignation() +
                ", band name is "+ bandName;
    }

}
