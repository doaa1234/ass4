package edu.najah.it.capp.asd.service;

import java.util.HashMap;
import java.util.Map;

public class ProtocolFactory {
    public static Map connections = new HashMap<String, Protocol>();

    public static Protocol getInstance(String connectionType) {
        if (connections.containsKey(connectionType)) {
            System.out.println("Connection is already created!.");
            return (Protocol) connections.get(connectionType);
        } else {
            if (connections.size() >= 3) {
                System.out.println("Can't create more than 3 connection!!");
                return null;
            }

            if (connectionType.equalsIgnoreCase("Ssh")) {

                // Ssh ssh = new Ssh();
                connections.put(connectionType, Ssh.getInsatnce());
                return Ssh.getInsatnce();
            } if (connectionType.equalsIgnoreCase("TFTP")) {
                //TFTP tftp=new TFTP();
                connections.put(connectionType, TFTP.getInsatnce());
                return TFTP.getInsatnce();
            }  if (connectionType.equalsIgnoreCase("Telnet")) {
                // Telnet telnet=new Telnet();
                connections.put(connectionType, Telnet.getInsatnce());
                return Telnet.getInsatnce();
            } if (connectionType.equalsIgnoreCase("Ftp")) {
               /* Protocol ftp = new Ftp();
                connections.put(connectionType, ftp);
                return ftp;//Create a new instance
                //Ftp ftp=new Ftp();

                */
                connections.put(connectionType, Ftp.getInsatnce());
                return Ftp.getInsatnce();
            }  if (connectionType.equalsIgnoreCase("Scp")) {
                //Scp scp=new Scp();
                connections.put(connectionType, Scp.getInsatnce());
                return Scp.getInsatnce();
            }

            return null;
        }


    }


}
