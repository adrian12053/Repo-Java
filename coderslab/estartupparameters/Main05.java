package pl.coderslab.estartupparameters;

public class Main05 {

    static void ExE5(int O) {

        if(O >= 0 || O <= 50)  {
            System.out.println("F");
        }   else if(O >= 51 || O <= 70) {
            System.out.println("E");
        }   else if(O >= 71 || O <= 90) {
            System.out.println("C");
        }   else if(O >= 91 || O <= 100)    {
            System.out.println("A");
        }   else {
            System.out.println("BADVALUE");
        }
    }
    public static void main(String []args) {
        ExE5(43);
    }
}