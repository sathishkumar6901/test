import java.util.*;	
public class p3	
{
	public static boolean isSubString(String s,String s1)
	{
		int[] sub=new int[26];
		for(int i=0;i<s.length();i++)
			sub[s.charAt(i)-97]=1;
		for(int i=0;i<s1.length();i++)
		{
			if(sub[s1.charAt(i)-97]==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String[] X={"ceo","alco","caaeio","ceai"};
		String[] Y={"ec","oc","ceo"};
		for(String s:X)
		{
			boolean notFound=false;
			for(String s1:Y)
			{
				if(!isSubString(s,s1))
				{
					notFound=true;
					break;
				}
			}
			if(!notFound)
			{
				System.out.print(s+" ");
			}
		}
	}
}