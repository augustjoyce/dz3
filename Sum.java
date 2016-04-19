package com.joyce.august.sourceit.dz;

public class Sum {

	public static void main(String args[]) {
		
		double x = 376.28;

		getSumOfDigits(x);

	}

	public static void getSumOfDigits(double x) {
		String s;
		s = String.valueOf(x); // Преобразование числа в строку

		char[] ch = s.toCharArray(); // Преобразование строки в массив символов
		int sum = 0; 
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == '.') continue; // Игнорирование точки в записи дабла
			int i = Character.getNumericValue(ch[j]); // Получение числового значение символа
			sum += i;
		}

		System.out.println(sum);
	}
}
