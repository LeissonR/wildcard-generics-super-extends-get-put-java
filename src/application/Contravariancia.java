package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		
		myObjs.add("Leisson");
		myObjs.add("Lohan");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.1433);
		myNums.add(8.19999433);
		
		// Number x = myNums.get(0); // Erro de compilacao ao capturar

		System.out.println(myNums);
		
		/*
		 * get - ERROR !
		 * 
		 * put - OK !
		 */
	
	}

}
