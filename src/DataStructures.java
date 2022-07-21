
public class DataStructures {

	public static void main(String[] args) {
		//1. program to sum all given arrays:
		
		double[] numbersToAdd = {2,4,6,8,10,12,14,16};
		double sum = 0;
		
		for (int i = 0; i < numbersToAdd.length; ++i) {
			sum += numbersToAdd[i];
		};
		
		System.out.println("The sum of numbers in the array for problem 1 is " + sum + ".");
		
		//========== end of #1 =================
		
		//2. output of this code?

		double[ ] exampleArray = {1,5,6,5,4,1};
		double maximum = exampleArray[0];
		int index = 0;

		for (int i = 1; i<exampleArray.length; i++){
		     if (exampleArray[ i ] > maximum) {
			  maximum = exampleArray[ i ];
			  index = i;
		     }    
		};
		System.out.println("The index for problem 2 is " + index);
		/* The output of this code is 2 (index = 2). 
		 * 
		 * 1st iteration of the for loop: i = 1, exArray[1]= 5, maximum= 1
		 * 		since 5>1, the for loop will run leaving: maximum= 5, index= 1
		 *  2nd iteration of the for loop: i = 2, exArray[2]= 6, maximum = 5
		 *  	since 6>5, the for loop will run, leaving: maximum= 6, index=2
		 *  3rd iteration of the for loop: i= 3, exArray[3]= 5, maximum= 6
		 *  	since 5>6 is NOT true, the loop will not run.
		 *  	since the loop did not run, i++ will not run and index will not be overwritten. 
		 *  	--> index remains at 2 from the 2nd loop iteration */
	}
};

