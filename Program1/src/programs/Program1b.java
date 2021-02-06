package programs;

import java.util.Hashtable;
import java.util.Map;

public class Program1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hb = new Hashtable<Integer,String>();
		hb.put(0, "Snehaja");
		hb.put(1, "Aishwarya");
		hb.put(2, "Gayatri");
		for(Map.Entry m:hb.entrySet()){
			 System.out.println(m.getKey()+" "+m.getValue());
			} 
	}

}
