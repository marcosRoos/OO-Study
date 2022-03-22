import com.roos.oop.lesson1.Account;
import com.roos.oop.lesson1.Lamp;

class App {
    
    public static void main(String[] args) {
        boolean originalState = false;

        Lamp lamp = new Lamp(originalState);
        System.out.println("A new lamp was created, and it is " + (originalState ? "on" : "off") + ".");
        lamp.test();

        Account account = new Account( "0123 4567 8909 0123" , 2000);
        account.test();

    }

    
}