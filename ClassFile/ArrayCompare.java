
/*This porgraam compares the values of two arrays
 prints the values that are same and those that are not.
 */
 
public class ArrayCompare
{
public static void main(String[] args)
	{
		// declare and intialise arrays with test values
		int[] firstArray = {2,4,8,6}, secondArray = {4,5,3,7}, sameValue,  notSameValue, allValues;
		int n, i, j, m, sameValCounter, notSameValCounter;
		
		 // Initialise variables and define array size
		n = 3;
		m= firstArray.length + secondArray.length;
		sameValCounter = 0;
		notSameValCounter = 0;
		sameValue = new int[m];
		notSameValue = new int[m];
		
		allValues = new int[m];
		
		
		for (i=0; i < firstArray.length; i++){
			
			for (j=0; j < secondArray.length; j++){
				
				
				if (firstArray[i] == secondArray[j]){
					
					sameValue[i] = secondArray[j]; // collect values that are the same
					sameValCounter = +1; // c */ //ount number of values collected
				}
				else if (j == n){
						notSameValue[i] = firstArray[i];
						notSameValCounter = +1;
				}
				
			} //end of inner j loop
                    
		}// end of outer i loop
		
		// copy firstArray and secondArray values to allValues 
		{
		System.arraycopy( firstArray, 0, allValues, 0,firstArray.length); // copy firstAray to combineValues
		System.arraycopy( secondArray, 0, allValues, firstArray.length,secondArray.length);// copy secondArray to combineValues
		}
		
		Arrays.sort(allValues);
		
			
		// Print the values that are the same
			System.out.println("values that are the same");
		for (i=0; i <= sameValCounter; i++){
			
			System.out.print( sameValue[i] + " ");
		}// end of i print loop
		
		System.out.println("\n");
		
		System.out.println("values that are not the same");
		
		// Print the values that are not the same
		for (i=0; i <= notSameValCounter; i++){
			System.out.print( notSameValue[i] + " ");
		}// end of i print loop
		
		System.out.println("\n");
		
		
		System.out.println("Combined Values in both Arrays");
		
		// Print the combined values in two arrays
		for (i=0; i < allValues.length; i++){
			System.out.print( allValues[i] + " ");
		}// end of i print loop
	
	}// end of main method
}// end of ArrayCompare class
