package InterfaceAndAbstract;

public interface mathInterface {
	default void print() {
		System.out.println("We are inside the interface. Default methods are allowed");
	}

	void sum(int a, int b);
	abstract void sum1(int a, int b);
}
