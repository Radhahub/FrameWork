package practice;

import java.util.Random;

public class GetRandomData {

	public static void main(String[] args)
	{
		Random ran=new Random();
		               int ranDomNum = ran.nextInt(10000);
		               System.out.println(ranDomNum);

	}

}
