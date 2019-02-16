// Mark Garvey
// Project Euler Problem 1:
// https://projecteuler.net/problem=1


import java.util.ArrayList;

public class Prob1 {

	public static void main (String args[]) {
		
		sub5AndStoreAns();		// incrementally subtract 5 from 1000 and store results
		sub3AndStoreAns();		// incrementally subtract 3 from 1000 and store results
		sumOfThrees();			// get sum of all multiples of 3
		sumOfFives();			// get sum of all multiples of 5
		
	}
	
	
	
	private static int sumOfFives() {	// sum all the multiples of 5 from the ArrayList 'fivesArray'
		int sumOfFives = 0;
		for (int i = 0; i < fivesArray.size(); i++) {		// for every element in fivesArray:
			sumOfFives += fivesArray.get(i);				// retrieve and add on to sumOfFives, to get total sum
		}
		System.out.println("Sum of all multiples of 5 between but not including 0 and 1000:");
		System.out.println(sumOfFives-1000);
		return sumOfFives-1000;			// 1000 is the value of the last index in the Arraylist for the NNs that 
										// are multiples of 5, must subtract by 1000 as we do not want to count 1000, see problem spec
	}



	private static int sumOfThrees() {	// sum all the multiples of 5 from the ArrayList 'threesArray'
		
		int sumOfThrees = 0;
		for (int i = 0; i < threesArray.size(); i++) {		// for every element in threesArray:
			sumOfThrees += threesArray.get(i);				// retrieve and add on to sumOfThrees, to get total sum
			//System.out.print(sumOfThrees);
		}
		System.out.println("Sum of all multiples of 3 between but not including 0 and 1000:");
		System.out.println(sumOfThrees);
		return sumOfThrees;
	}



	
	static int fives_Holder;		
		
	static ArrayList<Integer> fivesArray = new ArrayList<>();
			
	public static ArrayList<Integer> sub5AndStoreAns() {
		
		fives_Holder = 1005;				// Hold all the natural numbers that are multiples of 3 
		for (int j=0;j <= 200; j++) {		// repeat 200 times: 1000/5 = 200
			
			fives_Holder = fives_Holder-5; 	// get each multiple of 5
			fivesArray.add(fives_Holder);	// store each multiple of 5 in an ArrayList
		}
		
		System.out.println(fivesArray);
		return fivesArray;
			
		
	}
	
	
	static int threes_Holder;
	static ArrayList<Integer> threesArray = new ArrayList<>();
	
	public static ArrayList<Integer> sub3AndStoreAns() {
		
		threes_Holder = 1002;			// Hold all the natural numbers that are multiples of 3 
		for (int k=0;k <= 333; k++){		// repeat 333 times:  1000/3 = 333
			
			threes_Holder = threes_Holder-3;	// get each multiple of 3
			threesArray.add(threes_Holder);		// store each multiple of 3 in an ArrayList
					
		}
		System.out.println(threesArray);
		return threesArray;
	}
	
	
}
