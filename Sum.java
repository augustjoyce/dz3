package com.joyce.august.sourceit.dz;

public class Sum {

	public static void main(String args[]) {
		
		double x = 376.28;

		getSumOfDigits(x);

	}

	public static void getSumOfDigits(double x) {
		String s;
		s = String.valueOf(x); // �������������� ����� � ������

		char[] ch = s.toCharArray(); // �������������� ������ � ������ ��������
		int sum = 0; 
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == '.') continue; // ������������� ����� � ������ �����
			int i = Character.getNumericValue(ch[j]); // ��������� ��������� �������� �������
			sum += i;
		}

		System.out.println(sum);
	}
}
