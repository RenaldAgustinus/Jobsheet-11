import java.util.Scanner;
public class NestedLoop_2341760090{
    public static void main (String[]args) {
    Scanner input = new Scanner(System.in);
    double[][] temps = new double[2][7];
    double[] avg = new double[5];
    double total = 0;
    for (int i = 0; i < temps.length; i++) {
        System.out.println("Kota ke-" + (i+1));
        for (int j = 0; j < temps[0].length; j++) {  
            System.out.print("Hari ke-" + (j + 1) + ": ");  
            temps[i][j] = input.nextDouble();
            total += temps[i][j];
        }   
        System.out.println();
        avg[i] = total/7;
        total = 0;
       } 
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + " : ");  
            for (double suhu : temps[i]) { 
                System.out.print(suhu + " ");    
        }
        System.out.println();
        System.out.printf("Rata Rata : %.2f\n", avg[i]);
       }
    }
}