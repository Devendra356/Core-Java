package Core.Java;

public class NestedifElseExample {

	public static void main(String[] args) {
		int v1=89, v2=67, v3=99;
		
		if(v1<v2)
		{
			if(v1<v2)
			{
				System.out.println(v1 + " is the smallest.");
			}
		}
		else 
		{
			if(v2<v1)
			{
				if(v2<v3)
				{
					System.out.println(v2 + " is the smallest.");
				}
				else
				{
					System.out.println(v3 + " is the smallest.");
				}
			}
			
		}

	}

}