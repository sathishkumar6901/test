import java.util.*;
public class p5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int[] count=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
				continue;
			else
				count[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i)+":"+count[s2.charAt(i)]);
		}
	}
}