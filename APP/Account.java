import java.util.Scanner;

public class Account {
    private String cod;
    private float balance;
    private boolean isOverdraft;
    private float limit;

    static final String onOverdraftMessage = "You are on overdraft.";
    static final String offOverdraftMessage = "Overdraft is not being used.";
    static final String noBalanceEnoughMessage = "Your balance is insufficient for this withdraw.";
    static final String whitdrawSucessfulMessage = "whitdraw sucessful.";
    static final String depositSucessfulMessage = "Deposit sucessful.";
    static final String currencySymbol = "$";
    
    public Account(String cod, float limit) {
        this.cod = cod;
        this.limit = limit;
        System.out.println("Created account number " + cod + " with " + currencySymbol + String.format("%.2f", limit) + " limit");
    }

    public String stringfyBalance(String symbol) {

        return symbol + String.format("%.2f", balance);
    }

    public boolean withdraw(float valor) {
        if( valor < (balance + limit) ) {
            balance -= valor;
            isOverdraft = balance < 0;
            System.out.println(whitdrawSucessfulMessage + "\nCunrrent balance: " + stringfyBalance(currencySymbol) + ".\n" + (isOverdraft ? onOverdraftMessage : ""));
            return true;
        } else {
            System.out.println(noBalanceEnoughMessage);
            return false;
        }
    }

    public void deposit(float valor) {
        this.balance += valor;
        System.out.println(depositSucessfulMessage + "\nCurrent balance: " + stringfyBalance(currencySymbol));
    }

    public float checkBalance() {
        System.out.println("Current balance: " + stringfyBalance(currencySymbol));
        return balance;
    }

    public boolean checkIfIsOverdraftActive() {
        System.out.println( isOverdraft ? onOverdraftMessage : offOverdraftMessage );
        return isOverdraft;
    }

    public void test() {
        System.out.println("Starting tests..");
        System.out.println("Starting with a balance of " + stringfyBalance(currencySymbol));
        boolean keepGoing = true;
        int option;
        float value = 0;
        Scanner scanner = new Scanner(System.in);
        while(keepGoing) {
            
            System.out.println("\n\n\n ==========================================================================================================================");
            checkBalance();
            checkIfIsOverdraftActive();
            System.out.println("Options :");
            System.out.println("1 = Withdraw");
            System.out.println("2 = Deposit");
            System.out.println("3 = Quit");
            System.out.println("==========================================================================================================================");
            option = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch(option) {
                case 1: 
                    System.out.print("How much you want to withdraw? ");
                    value = scanner.nextFloat();
                    withdraw(value);
                break;
                case 2:
                    System.out.print("How much you want to deposit? ");
                    value = scanner.nextFloat();
                    deposit(value);
                break;
                case 3:
                    keepGoing = false;
                break;
                default:
                    System.out.println("Error: The entered value is not a valid option");
                break;
            }
            scanner = new Scanner(System.in);
        }

    }

}
