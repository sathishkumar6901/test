import java.util.*;
public class p4
{
		public static int findcoin(int n,int coin,int am)
		{
			for(int i=1;i<=coin;i++)
			{
				if(n<(i*am))
					return i-1;
			}
			return coin;
		}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] coins={5,4,3,2};
		ArrayList<Integer> result = new ArrayList<Integer>();
		int temp=n;
		int sum=0,coin,amount;
		while(n>0)
		{
			if(n>=10 && coins[3]!=0)
			{
				coin=coins[3];
				int i=findcoin(n,coin,10);
				amount=10*i;
				sum+=amount;
				n-=amount;
				coins[3]-=i;
				result.add(amount/10);
			}
			else if(n>=5 && coins[2]!=0)
			{
				coin=coins[2];
				int i=findcoin(n,coin,5);
				amount=5*i;
				sum+=amount;
				n-=amount;
				coins[2]-=i;
				result.add(amount/5);
			}
			else if(n>=2 && coins[1]!=0)
			{
				coin=coins[1];
				int i=findcoin(n,coin,2);
				amount=2*i;
				sum+=amount;
				n-=amount;
				coins[1]-=i;
				result.add(amount/2);
			}
			else if(n>=1 && coins[0]!=0)
			{
				coin=coins[0];
				int i=findcoin(n,coin,1);
				amount=1*i;
				sum+=amount;
				n-=amount;
				coins[0]-=i;
				result.add(amount);
			}
			else
				break;
		}
		if(sum==temp)
		{
			System.out.println(result);
		}
		else
			System.out.println("Sorry, insufficient amount");
	}
}