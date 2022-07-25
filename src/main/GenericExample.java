package main;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	// Generics in methods
	private static <T> void printer(T t) {
		System.out.println(t);
	}

	private static <T, U> void printer2(T t, U u) {
		System.out.println(t);
		System.out.println(u);
	}

	// we can also have a return type (eg. T)
	private static <T, U> T printer3(T t, U u) {
		System.out.println(t);
		System.out.println(u);
		return t;
	}

	// Wild cards in Generics
	private static void printlist(List<?> list) {
		System.out.println(list);
	}

	// We can also bound generic methods with Wildcards
	private static void printlistBounded(List<? extends String> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {

		IntegerCounter intCounter = new IntegerCounter(1);
		intCounter.print();

		DoubleCounter doubleCounter = new DoubleCounter(1.0);
		doubleCounter.print();

		Counter<Integer> iCounter = new Counter<>(1);
		iCounter.print();

		Counter<Double> dCounter = new Counter<>(3.0);
		dCounter.print();

		// Counter<int> iCounter = new Counter<>(1);
		// cannot use primitive types ,
		// we can use classes like String,etc

		CounterBounded<Integer> cB = new CounterBounded<>(1);
		cB.print();
		// CounterBounded<String> cB2 = new CounterBounded<>(1);
		// Bound mismatch: The type String is not a valid substitute for the bounded
		// parameter
		// <T extends Number> of the type CounterBounded<T>

		// cALLING GENERIC METHODS

		printer("Hello");
		printer(1);
		printer2("ABC", 3.5);

		List<Integer> newIntList = new ArrayList<>();
		newIntList.add(55);
		newIntList.add(60);
		newIntList.add(70);
		printlist(newIntList);
		// printlistBounded(newIntList);
		// Gives error as it is bounded to STring

		// Gives error (private static void printlist(List<Object> list) ===>)even
		// though Integer is subclass of Object
		// List<Integer> is not subclass of List<Object>
		// Hence we have to change the Object to wildcard character ?
		// Like
		// private static void printlist(List<?> list)

		List<String> newStringList = new ArrayList<>();
		newStringList.add("hello");
		newStringList.add("bounded");
		newStringList.add("wildcard generic method");
		printlistBounded(newStringList);

	}
}
