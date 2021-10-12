package edu.najah.it.capp.asd.service;

//import edu.najah.it.capp.asd.intf.Protocol;

public class Ssh implements Protocol {

    private static Protocol instance;


    Ssh() {
        System.out.println("Creating a new SSH insatnce");
    }

    public static Protocol getInsatnce() {
        if(instance == null) {
            instance = new Ssh();
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
        System.out.println("Sending message from SSH :: " + message);

    }

}