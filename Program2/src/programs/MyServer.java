package programs;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class MyServer {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket =new ServerSocket(9800);
			System.out.println("Server is ready for clients");
			Socket client=serverSocket.accept();
			
			DataInputStream din=new DataInputStream(client.getInputStream());
			PrintStream pw=new PrintStream(client.getOutputStream());
			pw.println("Hello Snehaja");
			
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}