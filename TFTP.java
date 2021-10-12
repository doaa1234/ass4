package edu.najah.it.capp.asd.service;

//import edu.najah.it.capp.asd.intf.Protocol;

public class TFTP implements Protocol {

    private static Protocol instance;
    public static Protocol getInsatnce() {
        if(instance == null) {
            instance = new Ssh();
        }
        return instance;
    }

    @Override
    public boolean release() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void send(String message) {
        // TODO Auto-generated method stub

    }

}
