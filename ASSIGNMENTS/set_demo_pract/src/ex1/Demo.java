package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>(); // doesn't order them, random
		hs.add("heyy");
		hs.add("java");
		hs.add("jee");
		hs.add("jme");
		hs.add("sql");
		hs.add("hibernate");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("jee");
		hs.add("mysql");
		System.out.println("hs - "+hs);
		
		Set<String> lhs = new LinkedHashSet<>(); //keeps order of entry
		lhs.add("heyy");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("jme");
		lhs.add("sql");
		lhs.add("hibernate");
		lhs.add(null);
		lhs.add(null);
		lhs.add("java");
		lhs.add("jee");
		lhs.add("mysql");
		System.out.println("lhs - "+lhs);
		
		
		Set<String> ts = new TreeSet<>(); //ascending
		//Set<String> ts = new TreeSet<>(Collections.reverseOrder()); //descending
		ts.add("heyy");
		ts.add("java");
		ts.add("jee");
		ts.add("jme");
		ts.add("sql");
		ts.add("hibernate");
//		ts.add(null);
//		ts.add(null);
		ts.add("java");
		ts.add("jee");
		ts.add("mysql");
		System.out.println("ts = "+ts);
		//System.out.println(ts.);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("heyy"));
		System.out.println(ts.contains("hello"));
		ts.remove("hibernate");
		System.out.println(ts);
		
		System.out.println(" ");
		System.out.println("addAll: ");
		
		hs.addAll(lhs);
		System.out.println("hs:" + hs);
		hs.retainAll(lhs);
		System.out.println("lhs: " + lhs);
		lhs.retainAll(hs);
		System.out.println("hs: " + hs);
		System.out.println("lhs: " + lhs);
		
		// ts.addAll(lhs); // can't add because lhs has null
		lhs.addAll(ts);
		
		Set<String> hs2 = new HashSet<>();
		hs2.add("big");
		hs2.add("project");
		hs2.add("code");
		hs2.add("big");
		
		System.out.println("hs2: " + hs2);
		
		//addAll
		
		hs.addAll(hs2);
		System.out.println("hs2 added to hs: " + hs);
		System.out.println("hs2: " + hs2);
		
		System.out.println(" ");
		System.out.println("retainAll:");
		
		// retainAll
		
		Set<String> hs3 = new LinkedHashSet<>();
		hs3.add("small");
		hs3.add("task");
		hs3.add("tasks");
		hs3.add("big");
		System.out.println("hs3: " + hs3);
		
		hs.addAll(hs3);
		System.out.println("hs3 added to hs: " + hs);
		
		hs.retainAll(hs2);
		System.out.println("hs after retaining hs2: " + hs);
		
		System.out.println(" ");
		System.out.println("removeAll:");
		
		// removeAll....
		
		hs.removeAll(hs3);
		System.out.println("hs after remove hs3: " + hs);
		hs.removeAll(hs2);
		System.out.println("hs after remove hs2: " + hs);
		
		hs2.add("big");
		hs2.add("project");
		hs2.add("code");
		hs2.add("big");
		
		hs3.add("small");
		hs3.add("task");
		hs3.add("tasks");
		hs3.add("big");
		
		hs.addAll(hs2);
		System.out.println("hs after add hs3: " + hs);
		hs.addAll(hs3);
		System.out.println("hs after add hs3: " + hs);
		hs.removeAll(hs);
		System.out.println("hs after remove hs: " + hs);
		
		System.out.println(" ");
		
		for(String s:ts) {
			System.out.println(s.toUpperCase());
		}
	}

}
