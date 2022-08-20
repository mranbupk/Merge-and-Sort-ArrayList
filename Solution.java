package co.anbu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	static void input(ArrayList<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		for(int i=0; i<5; i++) {
			list.add(sc.nextInt());
		}
	
	static void mergeAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> merge1 = new ArrayList<Integer>();
		if(list1.size()==list2.size()) {
			merge1.addAll(list1);
			merge1.addAll(list2);
			Collections.sort(merge1);
			arrayList.add(merge1.get(2));
			arrayList.add(merge1.get(6));
			arrayList.add(merge1.get(8));
			System.out.println(arrayList);
			
		}
		else
			throw new IllegalArgumentException();

	}
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		input(list1);
		input(list2);
		mergeAndSort(list1, list2);
	}
}
