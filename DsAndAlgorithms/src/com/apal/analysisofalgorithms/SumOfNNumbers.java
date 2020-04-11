package com.apal.analysisofalgorithms;

public class SumOfNNumbers {

	int getSumofNNumbers(int n) {
		int sum = 0;
		for(int i=1 ; i<=n ; i++ ) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		SumOfNNumbers s = new SumOfNNumbers();
		
		System.out.println("Sum:"+s.getSumofNNumbers(n));
		System.out.println("Result Given");
	}

}
