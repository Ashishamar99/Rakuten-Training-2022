package com.tata.streams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3); list.add(-1);list.add(5);
		
		List<Integer> positivenums = list.stream().filter(num -> num>0).collect(Collectors.toList());
		System.out.println(positivenums);
	}
}
