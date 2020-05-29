package modul3;

import java.util.Scanner;

public class perulanganWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka = ");
        int angkaMasukan = input.nextInt();
        int tinggi = 1;
        while (tinggi <= angkaMasukan) {
            int lebar = 1;
            while (lebar <= tinggi) {
                System.out.print(tinggi + " ");
                lebar++;
            }
            tinggi++;
            System.out.println("");
        }
    }
}
