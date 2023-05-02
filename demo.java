class  Sample301
{
	public static void main(String[] args) 
	{
		char ch='a';
		for(int i=10;i>=3;i--)
		{
			if(i%2==1)
			{ 
				System.out.println(" "+(i)+(ch++)+(i-2));
			}
		}
		
	}
}
