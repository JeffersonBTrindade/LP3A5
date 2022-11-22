package lp3a5.tarefas.prodCons;

public class Main {

	public static void main(String[] args) {
		BoundedBuffer<String> buffer = new BoundedBuffer<String>(2);

		// bounded buffer must be empty when first created
		System.out.println("Is buffer empty? " + buffer.isEmpty());

		buffer.put("abc");
		buffer.put("def");

		// buffer should be full after putting two elements
		System.out.println("Is buffer full? " + buffer.isFull());

		String value = buffer.take();
		System.out.println("element taken from buffer : " + value);

		value = buffer.take();
		System.out.println("another element taken from buffer : " + value);

		// buffer should be empty, after taking out all elements
		System.out.println("Is buffer empty again? " + buffer.isEmpty());

		// now an attempt to take another element should block
		buffer.take();
		System.out.println("This line will not print because main thread is blocked");
	}
}
