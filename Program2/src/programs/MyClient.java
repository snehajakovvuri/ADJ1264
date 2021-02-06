package programs;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			Socket s=new Socket("localhost",9800);
			
			DataInputStream din=new DataInputStream(s.getInputStream());
			PrintStream pw=new PrintStream(s.getOutputStream());
			
			pw.println("Hi I am client");
			
			System.out.println("Server:"+din.readLine());
			
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}