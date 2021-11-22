package view;

import java.util.LinkedList;
import java.util.List;

import Controller.ListaController;

public class Principal {

	public static void main(String[] args) {
		ListaController Controller = new ListaController();
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int num1 = (int) ((Math.random() * 200) + 1);
			list1.add(num1);
			
			int num2 = (int) ((Math.random() * 200) + 1);
			list2.add(num2);
		}

		Controller.concat(list1, list2);
		Controller.split(list1, 2);
	}

}