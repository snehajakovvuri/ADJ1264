import java.rmi.*;

public interface Armstrong extends Remote {

	public int Arm(int n) throws RemoteException;
}