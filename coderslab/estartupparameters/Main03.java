package pl.coderslab.estartupparameters;

public class Main03 {

        static void ExE3(Object... values)  {
            int sum = 0;

            for (int i = 0; i < values.length; i++) {
                sum = Integer.parseInt((String) values[i]);
            }

            double avg = sum / values.length;
            System.out.println(avg);
        }

    public static void main (String[] args){

            ExE3(1, 2, 3);
        }
    }