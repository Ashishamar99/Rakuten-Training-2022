package com.tata.streams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3); list.add(-1);
		
		Stream<Integer> stream = list.stream();
		Stream filtered = stream.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				// TODO Auto-generated method stub
				return arg0 > 0;
			}
		});
		List<Integer> finalList = (List<Integer>) filtered.collect(Collectors.toList());
		System.out.println(finalList);
	}
}
