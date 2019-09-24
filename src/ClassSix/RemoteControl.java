package ClassSix;

public class RemoteControl implements Controller {
    //Attributes
    private int volume;
    private boolean on;
    private boolean playing;

    //Special Method
    public RemoteControl() {
        this.volume = 50;
        this.on = true;
        this.playing = false;

    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getOn() {
        return on;
    }

    private void setOn(boolean o) {
        this.on = o;
    }

    private boolean getPlaying() {
        return this.playing;
    }

    private void setPlaying(boolean t) {
        this.playing = t;
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
        System.out.println("===== MENU =====");
        System.out.println("Is on? " + this.getOn());
        System.out.println("Is playing? " + this.getPlaying());
        System.out.println("Volume: " + this.getVolume());

        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" | ");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing the Menu...");
    }

    @Override
    public void turnUp() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Can't you turn up ...");
        }
    }

    @Override
    public void turnDown() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Can't you turn down...");
        }
    }

    @Override
    public void turnOnMute() {
        if (this.getOn() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Can't you turn on mute....");
        }
    }

    @Override
    public void turnOffMute() {
        if (this.getOn() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Can't you turn off mute...");
        }
    }

    @Override
    public void play() {
        if (this.getOn() && !(this.getPlaying())) {
            this.setPlaying(true);
        } else {
            System.out.println("Can't you play now...");
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && this.getPlaying()) {
            this.setPlaying(false);
        } else {
            System.out.println("Can't you pause now ...");
        }
    }
}
