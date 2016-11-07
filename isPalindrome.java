public class isPalindrome 
{
	public static void main(String[] args)
	{
		System.out.println("----- isPalindrome0 ----- ");
		System.out.println(isPalindrome0(""));
		System.out.println(isPalindrome0("a"));
		System.out.println(isPalindrome0("aa"));
		System.out.println(isPalindrome0("ab"));
		System.out.println(isPalindrome0("aba"));
		System.out.println(isPalindrome0("abba"));
		System.out.println(isPalindrome0("abca"));
		System.out.println(isPalindrome0("abbc"));
		System.out.println(isPalindrome0("abcdba"));

		System.out.println("----- isPalindrome1 ----- ");
		System.out.println(isPalindrome1(""));
		System.out.println(isPalindrome1("a"));
		System.out.println(isPalindrome1("aa"));
		System.out.println(isPalindrome1("ab"));
		System.out.println(isPalindrome1("aba"));
		System.out.println(isPalindrome1("abba"));
		System.out.println(isPalindrome1("abca"));
		System.out.println(isPalindrome1("abbc"));
		System.out.println(isPalindrome1("abcdba"));

		System.out.println("----- isPalindrome2 ----- ");
		System.out.println(isPalindrome2(""));
		System.out.println(isPalindrome2("a"));
		System.out.println(isPalindrome2("aa"));
		System.out.println(isPalindrome2("ab"));
		System.out.println(isPalindrome2("aba"));
		System.out.println(isPalindrome2("abba"));
		System.out.println(isPalindrome2("abca"));
		System.out.println(isPalindrome2("abbc"));
		System.out.println(isPalindrome2("abcdba"));
		
		System.out.println("----- isPalindrome3 ----- ");
		System.out.println(isPalindrome3(""));
		System.out.println(isPalindrome3("a"));
		System.out.println(isPalindrome3("aa"));
		System.out.println(isPalindrome3("ab"));
		System.out.println(isPalindrome3("aba"));
		System.out.println(isPalindrome3("abba"));
		System.out.println(isPalindrome3("abca"));
		System.out.println(isPalindrome3("abbc"));
		System.out.println(isPalindrome3("abcdba"));


	}
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using chartAt and iteration
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static boolean isPalindrome0(String s)
	{
		while (s.length() > 1)
		{
			if (s.charAt(0) == s.charAt(s.length() - 1))
				s = s.substring(1, s.length() - 1);
			else
				break;
		
		}
		if (s.length() <= 1)
			return true;
		else
			return false;
	}
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using chartAt and recursion
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static boolean isPalindrome1(String s)
	{
		//System.out.println(s)
		if (s.length() < 2)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))				
			return isPalindrome1(s.substring(1, s.length() - 1));	
		return false;
	}	

	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using AP reference and iteration
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static boolean isPalindrome2(String s)
	{
		while (s.length() > 1)
		{
			String toCompare = s.substring(s.length() - s.length(), s.length() - (s.length() - 1));
			int compare = toCompare.compareTo(s.substring(s.length() - 1, s.length() - 0));
			if (compare == 0)
				s = s.substring(1, s.length() - 1);
			else
				break;
		
		}
		if (s.length() <= 1)
			return true;
		else
			return false;
	}
	
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using AP reference and recursion
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static boolean isPalindrome3(String s)
	{
		if (s.length() < 2)
			return true;
		String toCompare = s.substring(s.length() - s.length(), s.length() - (s.length() - 1));
		int compare = toCompare.compareTo(s.substring(s.length() - 1, s.length() - 0));
		if (compare == 0)
			return isPalindrome3(s.substring(1, s.length() - 1));
		return false;
	}
}