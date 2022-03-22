class App {
    
    public static void main(String[] args) {
        boolean originalState = false;

        Lamp lamp = new Lamp(originalState);
        System.out.println("A new lamp was created, and it is " + (originalState ? "on" : "off") + ".");
        lamp.testar();

    }

    
}