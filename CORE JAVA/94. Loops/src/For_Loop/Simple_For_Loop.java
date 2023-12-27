package For_Loop;

public class Simple_For_Loop {

	public static void main(String[] args) {
		lable10: for(int a=1; a<=3; a++)    //1 1 1 2 3 3 3
		{
			lable1: for(int b=1; b<=3; b++) //1 2 3 1 1 2 3
			{
				if(a==2 && b==2) // 2 2 stop
				{
					break lable1;
				}
				System.out.println(a + " "+b);
			}
		}

	}

}
