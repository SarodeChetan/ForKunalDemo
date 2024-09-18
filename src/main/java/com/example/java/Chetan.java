package com.example.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
public class Chetan {
   int a = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		  //int []  a = {10,20,30,40};   2 === count 2
		                                 // 3 === count 2
		
		// 4 ===== count 3
		// 5==== count 2
		 int count2 = 0;
		    for(int i=2;count2<10;i++) {
		    	
		    	 count =0;
		    	 
		    	for(int j=1;j<=i;j++) {
		    		
		    		if(i%j==0) {
		    			count++;
		    			 
		    		}
		    		
		    		 
		    	}
		    	
		    	if(count==2) {
		    		System.out.println(i);
		    		count2++;
		    		
		    	}
//		    	else {
//		    		System.out.println(i);
//		    	}
		    	
		    	
		    }
		  
		   
		   
		   
		   
		  
		   
		  
		 
		  
		
	 
	    
	  
	  
	   
		
		 		 
	}

	 
	}

 
