package ClassSeven;

public class ClassSeven {
    public static void main(String[] args) {
        Fighter bubba[] = new Fighter [5];

        bubba[0] = new Fighter("Bobby", "Brazilian", 22,1.80f , 96.70f, 7, 0, 3);

        bubba[4] = new Fighter("James", "Fiji", 17,1.98f , 119.70f, 20, 0, 0);

        bubba[0].introduce();
        bubba[4].status();
    }
}
