package com.test.framework.classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapIntro {
	  public static void main(String[] args) {
		
		  /*
		   *Map interface is a part of Java Collection Framework,but it doesn't inherit Collection Interface
		   *If we want to create group of object with key and value pair then we use Map Interface
		   *duplicate keys are not allowed, value can be duplicate
		   *only one null key is allowed */
		  
		  Map<Integer, String> hMap= new HashMap<>();
		  hMap.put(1, "Nrs");
		  hMap.put(3, "anne");
		  hMap.put(5, "close");
		  hMap.put(2, "raam");
		  hMap.put(4, "sita");
		  hMap.put(7, "balaji");
		  hMap.put(0, "ok");
		  hMap.put(6, "fox");
		  
		 hMap.forEach((k,v)->System.out.println(k +"->"+v));
		  
	}

}
