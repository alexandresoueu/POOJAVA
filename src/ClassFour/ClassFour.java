package ClassFour;

public class ClassFour {
    public static void main(String[] args) {

        PenFour p1 = new PenFour("TEC",1.0f, "Yellow",false);
//        p1.setModel("BIC");
//        // p1.model = "bic"; Working because model has public access.
//
//        p1.setTip(1.2f);
//        // p1.tip = 1.3f; Don't work, because tip has private access.
//
//        System.out.println("I have a PEN "+ p1.getModel() + " and your size TIP is " + p1.getTip());

        PenFour p2 = new PenFour("NOK", 1.5f, "Black", true);

        System.out.println("===== P1 =====");
        p1.Status();

        System.out.println("===== P2 =====");
        p2.Status();
    }
}
