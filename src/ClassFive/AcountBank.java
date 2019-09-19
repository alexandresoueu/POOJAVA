package ClassFive;

public class AcountBank {
    //ATTRIBUTES
    public int acountNumber;
    protected String type;
    private String client;
    private float balance;
    private boolean status;


    // SPECIAL METHOD

    public AcountBank() {
        this.setBalance(0);
        this.setStatus(false);
    }

    public void CurrentState() {
        System.out.println("====================");
        System.out.println("*** STATE OBJECT ***");
        System.out.println("====================");

        System.out.println("Account: " + this.getAcountNumber());
        System.out.println("Type: " + this.getType());
        System.out.println("Client: " + this.getClient());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.isStatus());
    }

    // Personalized METHOD

    public void openAcount(String t) {
        this.setType(t);
        this.setStatus(true);

        if(t == "CA") {
            this.setBalance(50);
        } else if(t == "SA") {
            this.setBalance(150);
        } else {
            System.out.println("Anything wrong!");
        }

        System.out.println("Your account was create. ");
    }

    public void closeAcount() {
        if(this.getBalance() > 0) {
            System.out.println("Can't you close the account. Because your account have a money yet.");
        } else if (this.getBalance() < 0) {
            System.out.println("Can't you close account. Because your account balance is negative.");
        } else {
            setStatus(false);
            System.out.println("Your account was close. :[");
        }
    }

    public void deposit(float m) {
        if(this.isStatus() == true) {
            this.setBalance(getBalance() + m);
            System.out.println("Deposit realized with success!");
        } else {
            System.out.println("Can't you deposit.");
        }
    }

    public void withDraw(float m) {
        if(this.isStatus()) {
            if(getBalance() > m) {
                this.setBalance(getBalance() - m);
                System.out.println("With draw realized at account " + this.getClient());
            } else {
                System.out.println("You don't have balance to with draw this value.");
            }
        } else {
            System.out.println("Account is closed.");
        }
    }

    public void payMonthly() {
        int v = 0;

        if(this.getType() == "CA") {
            v = 12;
        } else if(this.getType() == "SA") {
            v = 20;
        }

        if(this.isStatus()) {
            if(this.getBalance() > v) {
                this.setBalance(this.getBalance() - v);
                System.out.println("Your Monthly was paid by " + this.getClient());
            } else {
                System.out.println("Insufficient balance to pay your monthly.");
            }
        } else {
            System.out.println("Account is closed.");
        }

    }

    //GETTERS AND SETTERS

    public void setAcountNumber(int n) { this.acountNumber = n; }

    public Integer getAcountNumber() {
        return this.acountNumber;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }

    public void setClient(String c) {
        this.client = c;
    }

    public String getClient() {
        return this.client;
    }

    public void setBalance(float b) {
        this.balance = b;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean isStatus() { return this.status; }


}
