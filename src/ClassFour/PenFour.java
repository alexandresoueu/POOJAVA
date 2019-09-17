package ClassFour;

public class PenFour {
    private String model;
    private float tip;
    private String color;
    private boolean covered;

    public PenFour(String m, String c, float t) { // this is constructor method
        this.setModel(m);
        this.setTip(t);
        this.color = c;
        this.cover();
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public float getTip() {
        return this.tip;
    }

    public void setTip(float t) {
        this.tip = t;
    }

    public void cover() {
        this.covered = true;
    }

    public void uncover() {
        this.covered = false;
    }

    public void Status() {
        System.out.println("====================");
        System.out.println("        OBJECT      ");
        System.out.println("====================");
        System.out.println("Model PEN: " + this.getModel());
        System.out.println("Size of TIP: " + this.getTip());
        System.out.println("Color is: " + this.color);
        System.out.println("Is this covered? " + this.covered);
    }

}
