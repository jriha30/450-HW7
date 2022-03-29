import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String[] args)
    {
        System.out.println("Starting Server");
        try
        {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("Client responded with: " + str);
            ss.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }
}