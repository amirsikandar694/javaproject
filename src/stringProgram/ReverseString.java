package stringProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Amir Sikandar",str="";
		int i;
		int stringlenghth=s1.length()-1;
		for(i=stringlenghth;i>=0;i--)
		{
			str+=s1.charAt(i);
		}
		System.out.print(str);
	}

}
