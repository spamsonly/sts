Sorted Unique Permutation
Method 1 : O(N*N!)
// Java program to print all the permutation
// of the given String.
//include <algorithm>


//include <String>
import java.util.*;


class GFG{


// Count of total permutations
static int total = 0;


static void permute(int i, String s)
{
	
	// Base case
	if (i == (s.length() - 1))
	{
		System.out.print(s + "\n");
		total++;
		return;
	}


	char prev = '*';


	// Loop from j = 1 to length of String
	for(int j = i; j < s.length(); j++)
	{
		char []temp = s.toCharArray();
		if (j > i && temp[i] == temp[j])
			continue;
		if (prev != '*' && prev == s.charAt(j))
		{
			continue;
		}
	
		// Swap the elements
		temp = swap(temp,i,j);
		prev = s.charAt(j);
	
		// Recursion call
		permute(i + 1, String.valueOf(temp));
	}
}


static char[] swap(char []arr, int i, int j)
{
	char temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	return arr;
}


static String sortString(String inputString)
{
	
	// Convert input string to char array
	char tempArray[] = inputString.toCharArray();
	
	// Sort tempArray
	Arrays.sort(tempArray);
	
	// Return new sorted string
	return new String(tempArray);
}


// Driver code
public static void main(String[] args)
{
	String s = "abca";
	
	// Sort
	s = sortString(s);


	// Function call
	permute(0, s);
	System.out.print("Total distinct permutations = " +
					total +"\n");
}
}
