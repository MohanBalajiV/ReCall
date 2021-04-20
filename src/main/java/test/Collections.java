package test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.asserts.SoftAssert;

import com.graphbuilder.struc.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for easy access and iteration
		List<String> al= new ArrayList<String>();
		al.add("balaji");
		al.add("mohan");
		al.add("balaji");
		
		System.out.println(al);
		
		//for easy insertion and deletion
		java.util.LinkedList<String> ll=new java.util.LinkedList<String>();
		ll.add("balaji");
		ll.add("mohan");
		ll.add("balaji");
		ll.addFirst("asdf");
		ll.removeLast();
		System.out.println(ll);
		
		//unordered, unsorted,no duplicates
		Set<String> hs= new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("aaa");
		System.out.println(hs);
		
		//ordered, unsorted,no duplicates
		LinkedHashSet<String>ls=new LinkedHashSet<String>();
		ls.add("111");
		ls.add("222");
		ls.add("333");
		ls.add("111");
		System.out.println(ls);
		
		//sorted,no duplicates
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("nnn");
		ts.add("sss");
		ts.add("aaa");
		System.out.println(ts);
		
		//unordered,one null key,multiplenull values		
		HashMap<String,String> name=new HashMap<String,String>();
		name.put("a","mohan");
		name.put("a","balaji");
		name.put("a","a");
		name.put("","");
		name.put("", "b");
		System.out.println(name);
		
		//insertionorder,no duplicates
		LinkedHashMap<String,String> lhm= new LinkedHashMap<String,String>();
		lhm.put("colour","orange,green");
		lhm.put("car","BMW,Benz");
		lhm.put("bike","pulsar,duke");
		lhm.put("car","Audi");
		System.out.println(lhm);
		
		//sorted,noduplicates
		TreeMap<String,String> tm= new TreeMap<String,String>();
		tm.put("colour","orange,green");
		tm.put("car","BMW,Benz");
		tm.put("bike","pulsar,duke");
		
		System.out.println(tm);
		
		
		
	}

}
