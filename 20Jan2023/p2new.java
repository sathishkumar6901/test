import java.util.*;
public class p2new
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int target=sc.nextInt();
			List<List<Integer>> result = new ArrayList<>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
			    int j=i,sum=0;
				boolean check=false;
			    for(;j<n;j++)
			    {
			        sum+=arr[j];
			        list.add(arr[j]);
			        if(sum>target)
			            break;
			        else if(sum==target)
			        {
						check=true;
			            result.add(new ArrayList(list));
			            break;
			        }
			    }
				if(check)
					i=j;
				while(list.size()!=0)
				    list.remove(list.size()-1);
			}
			System.out.println(result);
	}
}
