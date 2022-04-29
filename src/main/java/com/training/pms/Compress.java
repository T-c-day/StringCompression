package com.training.pms;

/*
 * Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not 
 * become smaller than the original string, your method should return the original string. 
 * You can assume the string has only uppercase and lowercase letters (a - z)
 * 
 * 4/29/2022
 */

public class Compress {
	
	public static void main(String[] args) {
		String str= "aabcccccaaa";
		int length = str.length();
		
		StringBuilder sb= new StringBuilder();
		
		int count =1;
		
		for(int i=0; i< length; i++) {
			
			 if(i==length-1){         
		            sb.append(str.charAt(i)+""+count);
		            break;
		        }

		        if(str.charAt(i)==str.charAt(i+1)){   
		            count++;
		        }
		        else{                            
		            sb.append(str.charAt(i)+""+count);
		            count=1;  
		        }
		   }

		    System.out.println(sb.toString());   

		}
	}

