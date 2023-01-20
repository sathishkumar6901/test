import java.util.*;
public class p1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stack<Character> s= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(s.isEmpty() || str.charAt(i)!=')')
				s.push(str.charAt(i));
			else
			{
				while(s.peek()!='(')
				{
					char c=s.pop();
					if((c>='a' && c<='z') && (s.peek()>='a' && s.peek()<='z'))
					{
						System.out.println("Invalid");
						return;
					}
				}
				s.pop();
			}
		}
		if(s.isEmpty())
			System.out.println("Valid");
		else	
			System.out.println("Invalid");
	}	
}