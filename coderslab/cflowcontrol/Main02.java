package pl.coderslab.cflowcontrol;

public class Main02 {

	public static void main(String[] args) {
		int nr1 = 3;
		int nr2 = 7;
		int nr3 = 11;
		if (nr1 > nr2)	{
			System.out.println("ZLE");
		}	else if (nr2 > nr3)   {
			System.out.println("ZLE");
		}	else {
			System.out.println("Najwieksza z liczb to 11");
		}
	}

}
