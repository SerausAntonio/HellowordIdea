package com.w2a;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	   System.out.println("Hello world");
	   ArrayList<String> list = new ArrayList<String>();
	   list.add("Antonio Seraus");
	   System.out.println(list.get(0));

	   List<String> options = Arrays.asList(new String[] { "A", "B", "C", "D" });
	   System.out.println(options.size());
	   for (String option: options){
	       System.out.println(option);
       }
       Hashtable<String,String> table = new Hashtable<String,String>();
	   table.put("Name","Antonio");
	   table.put("City","Amsterdam");
	   System.out.println(table.get("Name") + " " + table.get("City"));

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101," ajay");
		ht.put(101,"Vijay");
		ht.put(102,"Ravi");
		ht.put(103,"Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		Car c = new Car("Bmw","1200");
		c.printAttributes();

	}
}


