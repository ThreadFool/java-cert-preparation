package threadfool.op.chapter1;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionsExample {

	public static void main(String[] args) {
		SequencedCollection<String> list = new ArrayList<>();

		list.addFirst("first");
		list.addLast("last");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
