import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math;
public class RmiServer extends UnicastRemoteObject implements Armstrong {
	public RmiServer() throws RemoteException {
		super();
	}
	public int Arm(int n) throws RemoteException {
		int sum =0,x=n;
		while(n != 0) 
		{
			sum = sum + (int)Math.pow((n % 10),3);
			n = n / 10;
		}
		if(x == sum) {
			return x;
		}
		else {
			return 0;
		}
	}
	public static void main(String args[]) throws Exception{
			RmiServer r = new RmiServer();
			System.out.println("Rmi server is running");
			Naming.rebind("ArmstrongServer",r);
	}
}