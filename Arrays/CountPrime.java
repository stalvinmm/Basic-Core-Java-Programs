public class CountPrime 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6,7,8,9,1};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			boolean prime=countPrime(a[i]);
			if(prime==true)
				count++;
		}
		System.out.println("no of prime no are:"+count);
}
	private static boolean countPrime(int x) 
	{
		if(x>=2)
			for(int i=2;i<=x/2;i++)
			{
				if(x%i!=0)
					return true;
			}
		return false;
	}
	
}
