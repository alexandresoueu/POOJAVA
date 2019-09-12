package ClassTwo;

public class ClassTwo {

    public static void main(String[] args) {
        Pen c1 = new Pen();
        c1.color = "Black";
        c1.tip = 0.5f;
        c1.cover();

        c1.status();
        c1.scribble();


        Pen c2 = new Pen();
        c2.model = "Bic";
        c2.color = "Red";
        c2.tip = 1.0f;
        c2.load = 90;
        c2.uncover();

        c2.status();
        c2.scribble();
    }
}
