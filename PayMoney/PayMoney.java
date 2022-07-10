package com.greatlearning.PayMoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of transaction array");
		
		int sizeoftranscation = sc.nextInt();
		int arr[] = new int[sizeoftranscation];
		System.out.println("Enter the values of array");
		
		for(int i=0;i<sizeoftranscation; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the total number of targets that needs to be achieved ");
		int targetAchieve = sc.nextInt();
		
		while (targetAchieve-- != 0) {
			 int flag = 0;
			 long target;
			 System.out.println("Enter the value of target");
			 target = sc.nextInt();
			 long sum = 0;
			 
			 for(int i=0;i<sizeoftranscation; i++) {
				 
				 sum += arr[i];
				 if (sum >= target) {
					 System.out.println("Target achieved after " +(i+1)+" transcations");
					 flag = 1;
					 break;	 
				 }
			 }
			 
			 if(flag == 0) {
				 System.out.println("Given target is not achieved");
				 
			 }
		}
	}	
}