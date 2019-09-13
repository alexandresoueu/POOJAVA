package ClassTwo;

public class Pen {
    //ATTRIBUTES
    public String model;
    public String color;
    private float tip;
    protected int load;
    private boolean covered;

    //METHODS

    public void status() {
        System.out.println("Model is " + this.model);
        System.out.println("The color pen is " + this.color);
        System.out.println("Tip size is " + this.tip);
        System.out.println("load is " + this.load);
        System.out.println("Is Covered? " + this.covered);
    }

    private void write() {

    }

    public void scribble() {
        if(this.covered == true) {
            System.out.println("ERROR. Can't scribble!");
        }
        else {
            System.out.println("I'm SCRIBBLING!");
        }

    }

    public void cover() {
        this.covered = true;
    }

    public void uncover() {
        this.covered = false;
    }
}
