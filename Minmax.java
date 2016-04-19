package com.joyce.august.sourceit.dz;

public class Minmax {

	public static void main(String[] args) {
		double x = 501.79;
		getMin(x);
		getMax(x);

	}

	public static void getMax(double x) {
		String s;
		s = String.valueOf(x); // ��������������� ����� � ������

		int num[] = new int[s.length()]; // ������� ������ �����

		for (int j = 0; j < s.length(); j++) {
			num[j] = s.charAt(j) - '0'; // ����������� ��������� ������� �����
										// �������� ������� �������� ������,
			// �.�. ����� ����� � ������� ����� ������ '0' ����� �������� �����
		}
		bubble(num); // ��������� ������

		System.out.println(num[num.length - 1]); // ������ ���������� �����
													// �����

	}

	public static void getMin(double x) {
		String s;
		s = String.valueOf(x); // ��������������� ����� � ������

		int num[] = new int[s.length()]; // ������� ������ �����

		for (int j = 0; j < s.length(); j++) {
			num[j] = s.charAt(j) - '0'; // ����������� ��������� ������� �����
										// �������� ������� �������� ������,
			// �.�. ����� ����� � ������� ����� ������ '0' ����� �������� �����
		}
		bubble(num); // ��������� ������

		System.out.println(num[1]); // ������ ���������� ����� �����, ���������
									// �����, ������� ������ "-2"
									// � �������� ������ ��������� �������

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
