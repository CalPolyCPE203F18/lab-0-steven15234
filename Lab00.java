public class Lab00
{
   public static void main(String[] args)
   {
   	// Declaring and initializing some variables

	int x = 5;
	String y = "hello";
	double z = 9.8;
	
	// Printing the variables
	System.out.println("x: " + x + " y: " + y  + " z: " + z);
	
	// A list (make an array in java)
	int[] nums = {3, 6, -1, 2};
	for (int k = 0; k < nums.length; k++)
		System.out.println(nums[k]);

	// Call a function**
	int numFound = char_count(y, 'l');
	System.out.println("Found: " + numFound);
	
	// A counting for loop
	int ctr = 0;
	String blah = "";
	for (int i = 1 ; i < 11; i++)
		blah = blah + Integer.toString(i)  + " ";
	blah.trim();
	System.out.println(blah);

   }
	
   public static int char_count(String s, char c)
   {
	int count = 0;
	
	for (int k = 0; k < s.length(); k++)
	{
		char temp = s.charAt(k);
		if (temp == c)
			count++;
	}
	return count; 	
   }
}
