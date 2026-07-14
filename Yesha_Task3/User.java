package org.example;

public class User {
    private String uid;
    private String pin;

    public User(String uid, String pin)
    {
        this.uid=uid;
        this.pin=pin;
    }
    public boolean login(String id,String pin)
    {
        return this.uid.equals(id) && this.pin.equals(pin);
    }
}
