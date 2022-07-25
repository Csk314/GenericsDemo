package main;

public class Counter<T> {
	// define the type ideally <T> is used for type
	// but u can use anything like ABC
	T t;

	Counter(T t) {
		this.t = t;
	}

	public void print() {
		System.out.println(t);
	}
}
