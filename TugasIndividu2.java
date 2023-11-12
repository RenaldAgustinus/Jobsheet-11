import java.util.Scanner;
public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //untuk memasukkan nilai n
        System.out.print("Masukkan Nilai N: ");
        int n = input.nextInt();

        //jika n kurang dari 5 maka akan mengulang
        if (n < 5){
            System.out.println("Nilai N minimal 5 silahkan coba lagi");
            System.out.print("Masukkan Nilai N: ");
            n = input.nextInt();
        }

        //untuk melakukan perulangan print bintang sesuai input an dan nilai j akan berkurang terus 
        //hingga nilai j sama dengan n
        for (int i = 0 ; i < n ; i++){
            for (int j = n ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}