/**
 * Package created to keep loop related programs
 */
package com.java.loops;
/**
 * class created to perform while and so while comparisons
 * @author ANJALI PANDEY
 *
 */
public class WhileComparison {

	public static void main(String[] args) {
		int i=0,j=0,i1=0,j1=0;
		System.out.println("do while");
		/**
		 * do while loop		
		 */
		do
		{
			i++;
			++j;
			System.out.println(i*j);
		}while((i<10)&&(j*j!=25));
		
		System.out.println("while");
		i1++;
		++j1;
		/**
		 * while loop
		 */
		while((i1<10)&&(j1*j1!=25))
		{
			i1++;
			++j1;
			System.out.println(i1*j1);	
		}

	}

}
