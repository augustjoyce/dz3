package com.joyce.august.sourceit.dz;

public class Minmax {

	public static void main(String[] args) {
		double x = 501.79;
		getMin(x);
		getMax(x);

	}

	public static void getMax(double x) {
		String s;
		s = String.valueOf(x); // Преобразовываем число в строку

		int num[] = new int[s.length()]; // Создаем массив интов

		for (int j = 0; j < s.length(); j++) {
			num[j] = s.charAt(j) - '0'; // Присваемаем элементам массива интов
										// числовое значене символов строки,
			// т.к. номер цифры в юникоде минус символ '0' равен значению цифры
		}
		bubble(num); // Сортируем массив

		System.out.println(num[num.length - 1]); // Выдаем наибольшую цифру
													// числа

	}

	public static void getMin(double x) {
		String s;
		s = String.valueOf(x); // Преобразовываем число в строку

		int num[] = new int[s.length()]; // Создаем массив интов

		for (int j = 0; j < s.length(); j++) {
			num[j] = s.charAt(j) - '0'; // Присваемаем элементам массива интов
										// числовое значене символов строки,
			// т.к. номер цифры в юникоде минус символ '0' равен значению цифры
		}
		bubble(num); // Сортируем массив

		System.out.println(num[1]); // Выдаем наименьшую цифру числа, игнорируя
									// точку, которая выдает "-2"
									// и является первым элементом массива

	}

	public static void bubble(int items[]) {
		int temp;

		for (int i = 1; i < items.length; i++)
			for (int j = items.length - 1; j >= i; j--) {
				if (items[j] < items[j - 1]) {
					temp = items[j];
					items[j] = items[j - 1];
					items[j - 1] = temp;
				}
			}

	}

}
