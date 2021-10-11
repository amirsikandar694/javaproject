package stringProgram;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is amir sikandar and i am 26 year old";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
