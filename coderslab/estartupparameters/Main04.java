package pl.coderslab.estartupparameters;

public class Main04 {

    static void ExE4(int a, int b, int c)    {
        if((a + b) > c)  {
            System.out.println("YES");
        }   else {
            System.out.println("NO");
        }
        if((c + b) > a)  {
            System.out.println("YES");
        }   else {
            System.out.println("NO");
        }
        if((a + c) > b)  {
            System.out.println("YES");
        }   else {
            System.out.println("NO");
        }
    }

    public static void main(String [] args) {
        ExE4(2, 4, 7);
    }
}