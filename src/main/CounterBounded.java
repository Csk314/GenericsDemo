package main;

public class CounterBounded<T extends Number> {
	// T extends Number
	// we bounded the type to be Number types only

	// You can also extend interfaces,(Imp extends for interface also not
	// implements)
	// it can extend a class and interface also
	// (eg.<T extends Number & Serializable>)
	// Remember Class name should be first and then followed by interfaces , t
	// also you can extend only one class but multiple interfaces
	T t;

	CounterBounded(T t) {
		this.t = t;
	}

	public void print() {
		System.out.println(t);
	}
}
