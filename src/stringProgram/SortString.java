package stringProgram;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="edafb";
		int i,j;
		char temp;
		char[] chars=str.toCharArray();
		
		System.out.println(chars);
		
		for(i=0;i<chars.length;i++)
		{
			for(j=0;j<chars.length;j++)
			{
				if(chars[j]>chars[i])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}
		}
		
		for(int k=0;k<chars.length;k++)
			
		{
			System.out.print(chars[k]);
		}

	}

}
