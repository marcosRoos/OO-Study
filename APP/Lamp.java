import java.util.Scanner;

public class Lamp {
    private boolean originalState;
    private boolean isOn;

    public Lamp(boolean state) {
        this.isOn = this.originalState = state;
    }

    public void toggle() {
        this.isOn = !this.isOn;
    }

    public boolean getisOn() {
        return this.isOn;
    }

    public void testar() {
        System.out.println("\n\nStarting tests..");
        System.out.println("Beggining state of the lamp: " + (getisOn() ? "on" : "off"));
        System.out.print("How much times ou want to toggle: ");
        Scanner scanner = new Scanner(System.in);
        int toggleIterations = scanner.nextInt();
        for (int i = 0; i < toggleIterations; i++) {
            System.out.println("Clicking interruptor..");
            toggle();
            System.out.println("State of the lamp now: "
                    + (getisOn() ? "on" : "off")
                    + (((i % 2 == 0 && getisOn() != originalState)
                            || (i % 2 != 0 && getisOn() == originalState)) ? "[OK!]" : "[ERROR!]"));
        }
        System.out.println("End of tests..\n\n");
    }
}
