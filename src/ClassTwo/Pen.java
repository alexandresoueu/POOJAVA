package ClassTwo;

public class Pen {
    //ATTRIBUTES
    String model;
    String color;
    float tip;
    int load;
    boolean covered;

    //METHODS

    void status() {
        System.out.println("Model is " + this.model);
        System.out.println("The color pen is " + this.color);
        System.out.println("Tip size is " + this.tip);
        System.out.println("load is " + this.load);
        System.out.println("Is Covered? " + this.covered);
    }

    void scribble() {
        if(this.covered == true) {
            System.out.println("ERROR. Can't scribble!");
        }
        else {
            System.out.println("I'm SCRIBBLING!");
        }

    }

    void cover() {
        this.covered = true;
    }

    void uncover() {
        this.covered = false;
    }
}
