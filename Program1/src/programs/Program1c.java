package programs;
import java.util.*;  
public class Program1c{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Snehaja");  //Put elements in Map  
   map.put(2,"Amulya");    
   map.put(3,"Yojitha");   
   map.put(4,"Spandana");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  