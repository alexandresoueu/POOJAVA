package ClassSix;

public class RemoteControl implements Controller {
    //Attributes
    private int volume;
    private boolean on;
    private boolean touching;

    public RemoteControl() {
    }

    //Special Method
    public void constructor() {
        this.volume = 50;
        this.on = true;
        this.touching = false;

    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = getVolume() + v;
    }

    private boolean getOn() {
        return this.on;
    }

    private void setOn(boolean o) {
        this.on = o;
    }

    private boolean getTouching() {
        return this.touching;
    }

    private void setTouching(boolean t) {
        this.setTouching(t);
    }

    //Methods Abstracts
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Is on? " + this.getOn());
        System.out.println("Is Touching? " + this.getOn());

        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("|");
        }
        System.out.println("Volume: " + this.getVolume());
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing the Menu.");
    }

    @Override
    public void turnUp() {
        if (this.getOn() == true) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void turnDown() {
        if (this.getOn() == false) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void turnOnMute() {
        if (this.getOn() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void turnOffMute() {
        if (this.getOn() == false && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getOn() && !(this.getTouching())) {
            this.setTouching(true);
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && this.getTouching()) {
            this.setTouching(false);
        }
    }
}
