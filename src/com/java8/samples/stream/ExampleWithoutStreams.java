package com.java8.samples.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleWithoutStreams {

	public static void main(String[] args) {

		int[] nos = { 4, 1,1, 3, 0 };
		int min = nos[0];
		for (int i = 1; i < nos.length; i++) {
			if (min > nos[i]) {
				min = nos[i];
			}
		}
		System.out.println(min);
		// System.out.println(IntStream.of(nos).min().getAsInt());

		int[] copy = Arrays.copyOf(nos, nos.length);
		Arrays.sort(copy);
		for (int i = 0; i < 3; i++) {
			System.out.println(copy[i]);
		}
		IntStream.of(nos) //
		.distinct()
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		Stream<Integer> m = Stream.of(1);
		System.out.println(m);
	}
}
