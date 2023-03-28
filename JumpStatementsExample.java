package Core.Java;


public class JumpStatementsExample {

	public static void main(String[] args) {
		
		int i,limit=100;
		
		for(i=1;i<=limit;i=i+1)  //1<=100 T   // for(initialization;expression;value updation)
		{
			if(i==50) //== equlity operation
			{
				//break;
				continue;
			}
			System.out.println(i);
		}

		System.out.println("outdise of for block");
	}

}
