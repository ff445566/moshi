package moshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class tets {
	
	public static void main(String[] args) {
		
	 List list=new ArrayList<Object>();
	 list.add("b");
	 list.add("a");list.add("a");
	 list.add("a");list.add("d");list.add("c");
	 list.add("c");
	 
	 System.out.println(list.toString());
	  
	  System.out.println(E(list).toString());
	  Object[] arr = list.toArray();
	  System.out.println(arr[1]);
	}
	// 去除相同元素
	public static List A(List list){
		  for(int i=0;i<list.size();i++){
			  for(int j=list.size()-1;j>i;j--){
				  if(list.get(i).equals(list.get(j))){
					  list.remove(j);
				  }
			  }
  
		  }
		return list;
		
	}
	
	public static List B(List list){
		Set set=new HashSet<Object>();
		List list2=new ArrayList<Object>();
	Iterator<String>	iterator= list.iterator();
	while(iterator.hasNext()){
		String str = iterator.next();
		if(set.add(str)){
			list2.add(str);
		}
	}
	//set.addAll(set);
	
	list.clear();
	list.addAll(list2);
		return list;
		
	}
	
	public static List C(List list){
		List list2=new ArrayList<Object>();
		for (int i = 0; i < list.size(); i++) {
			if(!list2.contains(list.get(i))){
				list2.add(i);
			}			
		}
		return list;	
	}
	//  统计相同图元素
	public static <E> List D(List list){
		List list2=new ArrayList<Object>();
		Map map=new HashMap<String, Integer>(); 
		for (int i = 0; i < list.size(); i++) {
			if( map.containsKey(list.get(i))){
				String key=(String) list.get(i);
				int value=(Integer) map.get(key);
				map.put(key, ++value);
			}
			else
				 
				map.put(list.get(i), 1);
		}
		// 遍历hashmap
//	Iterator iter=map.entrySet().iterator();
//	while(iter.hasNext()){
//		 Entry<String, Integer> entry = (Map.Entry<String, Integer>)iter.next();
//		String key=entry.getKey();
//	    int value=entry.getValue();
//	}
		
		list.clear();
		list.add(map);
		return list;	
	}
	public static List E(List list){
		List list2=new ArrayList();
		list2.add("11");
		list2.add("22");
		list2.add("33");
		list.addAll(1,list2);
		return list;
		
	}

}
