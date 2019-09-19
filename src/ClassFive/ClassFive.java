package ClassFive;

public class ClassFive {
    public static void main(String[] args) {
        AcountBank clientOne = new AcountBank();
        clientOne.setAcountNumber(12345);
        clientOne.setClient("The One Man");

        clientOne.openAcount("SA");
        clientOne.deposit(200);
        System.out.println("Account Client ONE");

        clientOne.payMonthly();
        clientOne.CurrentState();

        AcountBank girlAccount = new AcountBank();
        girlAccount.setAcountNumber(67890);
        girlAccount.setType("CA");
        girlAccount.setClient("The Girl");
        girlAccount.setBalance(1000.09f);
        girlAccount.setStatus(true);

        girlAccount.withDraw(500.09f);
        System.out.println("Account Client TWO");

        girlAccount.CurrentState();


        System.out.println("\nAccount Client THREE");
        AcountBank nemo = new AcountBank();
        nemo.setAcountNumber(3245);
        nemo.setType("SA");

        nemo.CurrentState();
        nemo.closeAcount();
    }

}
