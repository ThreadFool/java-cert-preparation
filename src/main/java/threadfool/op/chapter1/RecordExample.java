package threadfool.op.chapter1;

public class RecordExample {

	record User(String name, int age) {}

	public static void main(String[] args) {
		Object obj = new User("Raf", 26);

		if (obj instanceof User(String name, int age)) {
			System.out.println(name + " ma " + age + " lat");
		}
	}
}
