package stringProgram;

public class PalindromeString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="nitin",str="";
		int i;
		int stringlenghth=s1.length()-1;
		for(i=stringlenghth;i>=0;i--)
		{
			str+=s1.charAt(i);
		}
		
		if(str.equalsIgnoreCase(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
