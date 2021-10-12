package edu.najah.it.capp.asd.service;

//import edu.najah.it.capp.asd.intf.Protocol;

public class Telnet implements Protocol {

    private static Protocol instance;


    Telnet() {
        System.out.println("Creating a new Telnet insatnce");
    }

    public static Protocol getInsatnce() {
        if(instance == null) {
            instance = new Telnet();
        }
        return instance;
    }
    @Override
    public boolean release() {
        instance = null;
        return true;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message from TELNET :: " + message);

    }

}
