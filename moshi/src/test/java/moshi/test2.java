package moshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class test2 {
	public test2(){}
  public static void main(String[] args) {
//	  String str="abcdefghdccbbddaa";
//	  String str2="abcd";
//	  char[] ch = str.toCharArray();
//	  System.out.println("ch[10],strtochararray: "+ch[10]);
//	  System.out.println(str.length());
//	String[] wh = str.split("a");
//	System.out.println(wh.toString());
//	  System.out.println(str.compareTo("aaa"));
//	  System.out.println( str.startsWith("abcd")
//	 + ""+str.endsWith("ddaa"));
	  str();
	 
  }
  public static  void str(){
	  String str="ab.cdefaah.hbba.caade.";
	  String[] ch = str.split("\\.");
	  for(int i=0;i<ch.length;i++){
		  System.err.println(i+" is "+ch[i]);
	  }
	  
  }

  public static void maps(){
	  Random ran=new Random();
		int i= ran.nextInt(10)+20;
		  
		 List li=new ArrayList();
		Map map=new HashMap<String, Integer>();
		map.put("c", 3);
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 1);
		map.put("b", 4);
		map.put("a", 1);
		
		 map.replace("c", 100);
		 map.remove("a",10);
		
		  Iterator ir = map.entrySet().iterator();
	   while(ir.hasNext()){
		 Entry<String, Integer> entry = (Map.Entry<String, Integer>)ir.next();
	   System.out.println(entry.getKey()+entry.getValue());
	   }
	  
	}
  
}
