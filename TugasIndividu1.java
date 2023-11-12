import java.util.Scanner;
public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //untuk memasukkan nilai N
        System.out.print("Masukkan Nilai N: ");
        int n = input.nextInt();
        //jika n kurang dari 3 maka akan mengulang
        if (n < 3){
            System.out.println("Nilai N minimal 3");
            System.out.print("Masukkan Nilai N: ");
            n = input.nextInt();
        }
        //perulangan untuk print per baris sampai nilai i kurang dari sama dengan n
        for (int i = 1 ; i <= n ; i++ ){
            //perulangan untuk print jarak sampai nilai j lebih dari nilai n - nilai i
            for (int j = 1 ; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            //perulangan untuk print nilai k dan nilai k akan terus bertambah hingga nilai k lebih dari i
            for (int k = 1 ; k <= i ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}