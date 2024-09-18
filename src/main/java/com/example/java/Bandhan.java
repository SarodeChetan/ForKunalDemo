package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class Bandhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rs= 0;
		
		int count  = 0;
		
		String [] th = new String[5];
		
		  for(int i=0;i<5;i++){
			  
		System.out.println("-----------------Welcome to Bandhan Bank--------------");
		System.out.println();
		System.out.println();
		System.out.println("choose one option");
		System.out.println("1) Deposite           2)Withdraw");
		System.out.println("3) Check Balance      4)transaction History");
		//0+100 = 100 100+400 = 500
		Scanner sc = new Scanner(System.in);
		
        int op = sc.nextInt();
        
		switch(op) {
		
		case 1: System.out.println("Enter a deposite amount");
		           int temp = sc.nextInt();
		         rs = rs+temp; //100   400
		           th[count] = "Deposited  + " +temp;
		           count++;
		          System.out.println("Transaction complete amount deposited succesfully");break;
		    
		case 2:   System.out.println("Enter a withdraw amount");
		             int sub = sc.nextInt();
		           if(sub<=rs) {
		        	   rs = rs-sub;
		        	   th[count] =  "Withdraw   - "+sub;
			           count++;
		        	   System.out.println("Transaction complete amount withdraw succesfully");
		           }
		           else {
		        	   System.out.println("insuffient Balance ");
		           }break;
		           
		case 3:    System.out.println("your balance is  - "+rs);break;
	       	
		
		case 4:      System.out.println("your transaction history is---");
			    System.out.println(Arrays.toString(th));break;
		
			    
		}
		
		  }

	}

}
