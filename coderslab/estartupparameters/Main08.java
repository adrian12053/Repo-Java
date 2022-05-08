package pl.coderslab.estartupparameters;

public class Main08 {

    static void ExE8(int x, int y)  {
        int z = 1;
        for (int i = 1; i <= x; i++)    {
            if(i % x == 0 || i % y == 0)    {
                z = i;
            }
        }
        System.out.println(z);
    }
    public static void main(String[] args) {
        ExE8(9, 3);
    }
}
