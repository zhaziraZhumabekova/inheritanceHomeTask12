public class Main {
    public static void main(String[] args) {
        Programmer program = new Programmer("Zhazira", "student", "zhaziGroup");
        System.out.println(program);
        program.learn();
        program.walk();
        program.eat();
        program.coding();
        System.out.println();


        Dancer dancer = new Dancer("notMe", "k-pop", "Z-DANCE");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("notMe", "vocal", "boyBand");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();

    }
}