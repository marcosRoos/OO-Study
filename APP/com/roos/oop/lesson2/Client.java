package com.roos.oop.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private String name;
    private Adress adress;
    private List<Contact> contacts;

    public Client() {
        this.adress = new Adress();
        registerNewClient();
    }

    public Client(String name, Adress adress, List<Contact> contacts) {
        this.name = name;
        this.adress = adress;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void registerNewClient() {
        String stringFromScanner;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================  New Client  ==================");
        System.out.print("Insert name: ");
        this.name = scanner.nextLine();
        System.out.println("_Adress data_");
        System.out.print("Adress: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setAdress(stringFromScanner);
        System.out.print("Number: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setNumber(stringFromScanner);
        System.out.print("Complement: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setComplement(stringFromScanner);
        System.out.print("Neighborhood: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setNeighborhood(stringFromScanner);
        System.out.print("City: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setCity(stringFromScanner);
        System.out.print("State: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setState(stringFromScanner);
        System.out.print("Country: ");
        scanner = new Scanner(System.in);
        stringFromScanner = scanner.nextLine();
        this.adress.setCountry(stringFromScanner);
        
        boolean keepSavingContacts = true;
        List<Contact> newContacts = new ArrayList<>();
        int option;
        while (keepSavingContacts) {
            System.out.print("\n _New Contact Type [1=phone/2=email]: ");
            scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\n type [1=cellphone/2=fix]: ");
                    scanner = new Scanner(System.in);
                    option = scanner.nextInt();
                    System.out.print("\n Number: ");
                    scanner = new Scanner(System.in);
                    String number = scanner.nextLine();
                    Contact newContact = new Phone(number, option==1 ? ContactTypes.cellphone : option==2 ? ContactTypes.fix : ContactTypes.error);
                    newContacts.add(newContact);
                    break;
                case 2:
                    System.out.print("\n Email: ");
                    scanner = new Scanner(System.in);
                    String email = scanner.nextLine();
                    Contact newEmail = new Email(email);
                    newContacts.add(newEmail);
                    break;
                default:
                    break;
            }
            
            System.out.print("\n_Register new contact [y/n]? ");
            scanner = new Scanner(System.in);
            String repeatAnswer = scanner.nextLine();
            keepSavingContacts = repeatAnswer.equals("y");            
        }
        contacts = newContacts;

        System.out.println("\n\nNew client aquired!\n" + this.getName() + "\n === Adress === ");
        System.out.println( adress.getAdress() + "\n" + adress.getNumber() + "\n" + adress.getComplement()
        + "\n" + adress.getNeighborhood() + "\n" + adress.getCity() + "\n" + adress.getState() + "\n" + adress.getCountry() );
        System.out.println(" === Contacts === \n");
        for( int i=0; i<contacts.size(); i++ ) {
            System.out.println((contacts.get(i) instanceof Phone) 
            ? "type: " + contacts.get(i).getType() + "\nPhone: " + contacts.get(i).getValue()
            : "type: Email\nemail: " + contacts.get(i).getValue()  );
        }
    }

}
