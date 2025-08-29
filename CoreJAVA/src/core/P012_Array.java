package core;

import java.util.Scanner;

public class P012_Array {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;
		System.out.println(a);
		int ar[] = { 11, 42, 53, 84, 55, 66, 70, 38, 129, 140 };
		for (int index = 0; index < ar.length; index++) {
			System.out.println(ar[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.print("enter element at ar[" + index + "] : ");
			arr[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
//			System.out.println("sum : " + sum);
		}
		System.out.println("sum = " + sum);

		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if(max < arr[index]) {
				max = arr[index];
			}0
		}
		System.out.println("max of array : "+max);

	}
}
