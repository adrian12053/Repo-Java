package pl.coderslab.estartupparameters;

public class Main07 {

   static void ExE7(int n)  {
       int factorial = 1;
       for (int i = 1; i <= n; i++) {
           factorial = factorial + i;
       }
       System.out.println(factorial);
   }
   public static void main(String[] args)   {
       ExE7(3);
   }
}