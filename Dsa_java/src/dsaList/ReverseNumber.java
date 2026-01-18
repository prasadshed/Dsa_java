package dsaList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseNumber {

	public static void main(String[] args) {
		List s=new LinkedList<Integer>();
		s.add(23);
		s.add(56);
		s.add(78);
		s.add(90);
		Collections.reverse(s);
		for (Object object : s) {
			System.out.println(object);
		}
		Collections.sort(s);
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
