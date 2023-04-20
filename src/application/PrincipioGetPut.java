package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PrincipioGetPut {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.134, 5.444);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	
	}

	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for (Number numberList : source) {
			target.add(numberList);
			/*
			 *for (int i = 0; i < source.size(); i++) {
			 *	target.add(source.get(i));
			 *}
			 */
		}
	}
	
	public static void printList(List<?> list) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object lists : list) {
			sb.append(lists);
			sb.append("  ");
		}
			sb.setLength(sb.length() - 2);
			sb.append("]");
			System.out.println(sb.toString());
	}
	
}
