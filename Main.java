package edu.najah.it.capp.asd.service;



//import edu.najah.it.capp.asd.constants.ConnectionType;
//import edu.najah.it.capp.asd.intf.Protocol;
import edu.najah.it.capp.asd.service.Connection;

public class Main {

    public static void main(String[] args) {

       // Protocol ssh = Connection.getInstance(ConnectionType.SSH);
       // Protocol ssh2 = Connection.getInstance(ConnectionType.SSH);
      //  Protocol telnet = Connection.getInstance(ConnectionType.TELNET);
     //   Protocol scp = Connection.getInstance(ConnectionType.SCP);
       // Protocol ftp = Connection.getInstance(ConnectionType.FTP);
       // Protocol scp =ProtocolFactory.getInstance(ConnectionType.SCP);
        Protocol telnet =ProtocolFactory.getInstance(ConnectionType.TELNET);

        Protocol ssh =ProtocolFactory.getInstance(ConnectionType.SSH);
        Protocol ftp =ProtocolFactory.getInstance(ConnectionType.FTP);
        Protocol ftp2=ProtocolFactory.getInstance(ConnectionType.FTP);


        if(ftp == ftp2) {
            System.out.println(" ftp is equal to ftp2");
        }




       /* ssh.send(" testing ssh ");
        telnet.send("Testing telnet ");
        scp.send("Testing scp");
        */
        ftp = ProtocolFactory.getInstance(ConnectionType.FTP);


     //   ssh.send(" testing ssh ");
      //  telnet.send("Testing telnet ");
      //  scp.send("Testing scp");


        System.out.println(Connection.getCurrentConnections());
        Connection.release(ConnectionType.SSH);
        System.out.println(Connection.getCurrentConnections());

      //  ftp = Connection.getInstance(ConnectionType.FTP);
        System.out.println(Connection.getCurrentConnections());


        //  ssh = Connection.getInstance(ConnectionType.SSH);
       // ftp = Connection.getInstance(ConnectionType.FTP);
       // ftp = Connection.getInstance(ConnectionType.FTP);

       // ftp = Connection.getInstance(ConnectionType.FTP);
        ftp.send("Testing FTP");



    }

}
