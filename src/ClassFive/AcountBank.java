package ClassFive;

public class AcountBank {
    //ATTRIBUTES
    public int acountNumber;
    protected String type;
    private String client;
    private int balance;
    private boolean status;

   // SPECIAL METHODS
   public AcountBank() {
       balance = 0;
       status = false;
   }

   //METHODS
   public void openAcount() {

   }

   public void closeAcount() {

   }

   public void deposit() {

   }

   public void withDraw() {

   }

   public void payMonthly() {

   }

   public Integer getAcountNumber() {
       return acountNumber;
   }

   public void setAcountNumber() {
       this.acountNumber = acountNumber;
   }

   public String getType() {
       return type;
   }

   public void setType() {
       this.type = type;
   }

   public String getClient() {
       return client;
   }

   public void setClient() {
       this.client = client;
   }

   public Integer getBalance() {
       return balance;
   }

   public void setBalance() {
       this.balance = balance;
   }

   public boolean getStatus() {
       return status;
   }

   public void setStatus() {
       this.status = status;
   }
}
