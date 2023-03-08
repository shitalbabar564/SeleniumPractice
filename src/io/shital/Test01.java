package io.shital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.testng.Assert;

public class Test01 {
	// @Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println("name count:" + count);

	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// streams-> collection of strings
		// 1.there is no life for intermidiate operation if there is no terminal
		// operation after filter().count()like
		// 2.terminal operation will execute only if int opertn filter() returns true
		// 3.we can create stream by Stream.of("SAS","SASAS");
		// 4.how to use filter in stream api
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("Count:" + c);
		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("Terminal:" + d);
		// print all the names of the arayList
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println("first value only:" + s));

	}

	// @Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("don");
		names.add("women");

		// 1 print names which have last letter as a with upper case
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// 2 print names which have first letter as a with upper case and sorted
		List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// merge two lists using streams
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s->System.out.println("new list:"+s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect() {
		List<String> ls= Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1);
		//print unique no from this array
		//values.stream().distinct().forEach(s->System.out.println(s));
		//sort the array and after sorting give me the 3rd index value
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("third index value:"+li.get(2));

	}

}
