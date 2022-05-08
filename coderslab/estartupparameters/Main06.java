package pl.coderslab.estartupparameters;

public class Main06 {

    static void ExE6(int L) {
        for (int i = 1; i <= L; i++)    {
            for (int j = 1; j <= L; j++)    {
                System.out.println(i + " x "+j+" = " + i * j);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)  {
        ExE6(4);
    }
}