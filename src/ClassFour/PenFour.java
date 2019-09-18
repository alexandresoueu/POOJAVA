package ClassFour;

public class PenFour {
    private String model;
    private float tip;
    private String color;
    private boolean covered;

    public PenFour(String m, float t, String c, boolean x) {
        this.setModel(m);
        this.setTip(t);
        this.setColor(c);
        this.setCovered(x);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public void Status() {
        System.out.println("===== OBJECT =====");
        System.out.println("Model is: " + this.getModel());
        System.out.println("Tip is: " + this.getTip());
        System.out.println("Color is: " + this.getColor());
        System.out.println("Is covered: " + this.isCovered());
    }
}
