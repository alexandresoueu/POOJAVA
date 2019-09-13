package ClassTwo;

public class ClassTwo {

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("      C1 OBJECT     ");
        System.out.println("====================");

        Pen c1 = new Pen();
        c1.model = "Bic";
        c1.color = "Black";
        //c1.tip = 1.5f;
        c1.load = 80;
        c1.cover();

        c1.status();
        c1.scribble();

    }

}
