package threadfool.op.chapter1;

import static java.lang.StringTemplate.STR;

public class StringTemplateExample {

	public static void main(String[] args) {
		String name = "Raf";
		int score = 9001;

		String msg = STR."User \{name} scored \{score} points!";
		System.out.println(msg);
	}
}
