import java.rmi.*;
import java.util.*;
public class RmiClient {
	public static void main(String args[]) throws Exception{
			int n,result;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value:");
			n = sc.nextInt();
			Armstrong a = (Armstrong)Naming.lookup("rmi://localhost:1099/ArmstrongServer");
			result = a.Arm(n);
			if(result==n){
				System.out.println("The given number is Armstrong number");
			}
			else {
				System.out.println("The given number is not Armstrong number");
			}
	}
}