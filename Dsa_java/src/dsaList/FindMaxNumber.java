package dsaList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

public class FindMaxNumber {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(12);
		a.add(34);
		a.add(2);
		a.add(78);
		Collections.sort(a);       ///by using collections sorting
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}

}
