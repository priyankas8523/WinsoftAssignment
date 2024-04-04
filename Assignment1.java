package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment1 {
	public static void mergeArrays(int x[], int y[]) {
		
		int j = 0;
		for(int i =0;i<x.length;i++) {
			if(x[i]==0) {
				int temp = x[i];
				x[i] = y[j];
				y[j] = temp;
				j++;
			}
			
		}
		ArrayList <Integer> list = new ArrayList<>();
		for(int n : x) {
			list.add(n);
		}
		Collections.sort(list);
		System.out.println(list);
	}
	public static void main(String[] args) {
		int[] x= { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
		int[] y ={ 1, 8, 9, 10, 15 };
		mergeArrays(x,y);
	}
}
