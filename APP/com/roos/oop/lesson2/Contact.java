package com.roos.oop.lesson2;

public abstract class Contact {
    
    private String value;
    private ContactTypes type;

    public Contact(String value, ContactTypes type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ContactTypes getType() {
        return type;
    }

    public void setType(ContactTypes type) {
        this.type = type;
    }
    
}
