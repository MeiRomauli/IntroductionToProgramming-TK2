/**
 @author Tim 5 - Introduction to programming
 */

import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        int minLengthName = 1, maxLengthName = 25, nimLength = 10;
        boolean task1 = false, task2 = false, looping=true;
        String name, nim, loop ="y";

        Scanner input = new Scanner(System.in);

        do {System.out.print("Masukkan Nama Anda [1..25]: ");
            name = input.nextLine();
            if (name.length() <= maxLengthName && name.length() >= minLengthName) {
                task1 = true;
            } else {
                System.out.println("Jumlah karakter nama harus minimal 1 dan maksimal 25!");
            }
        } while (!task1);

        do {
            System.out.print("Masukkan NIM Anda [harus 10 karakter]: ");
            nim = input.nextLine();
            if (nim.length() == nimLength) {
                task2 = true;
            } else {
                System.out.println("Jumlah karakter NIM harus 10 karakter");
            }

        } while (!task2);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Registrasi Sukses....");
        System.out.println("Selamat datang " + name + " [NIM: " + nim + "]..^^\n");
        System.out.println("Mari belajar macam-macam deret bilangan...");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

        while (loop.equalsIgnoreCase("y")) {
            int number, eventCount=0, oddCount=0,  evenNo = 0, oddNo = 0, sumOfOdd = 0, sumOfEven = 0, fiboNo, sumOffibonaci = 0, past = 1, current = 0, fibonaccy =0;
            boolean task3 = false;
            do {
                System.out.print("Masukkan Sembarang Angka [5..20]: ");
                number = input.nextInt();
                if (number < 5 || number > 20) {
                    System.out.println("Nomor yang anda input harus antara 5..20!");
                } else {
                    task3 = true;
                }
            } while (!task3);

            //menampilkan bilangan genap dan menjumlahkan semuanya
            System.out.println(+ number + " bilangan genap: ");

            while (eventCount<number){
                evenNo++;
                if (evenNo % 2 == 0 && eventCount<=number){
                    System.out.print(evenNo+" ");
                    eventCount++;
                    sumOfEven +=evenNo;
                }
            }
            System.out.println("\nHasil penjumlahan Bilangan Genap = " + sumOfEven+"\n");

            //menampilkan bilangan ganjil dan menjumlahkan semuanya
            System.out.println( + number + " bilangan ganjil: ");

            while (oddCount < number){
                oddNo++;
                if (oddNo % 2 != 0 && oddCount<=number){
                    System.out.print(oddNo+" ");
                    oddCount++;
                    sumOfOdd +=oddNo;
                }
            }
            System.out.println("\nHasil penjumlahan Bilangan Ganjil = " + sumOfOdd+"\n");

            //menampilkan bilangan fibonaccy dan menjumlahkan semuanya
            System.out.println(+ number + " bilangan fibonaccy: ");

            for (fiboNo = 0; fiboNo < number; fiboNo++) {
                fibonaccy = current + past;
                System.out.print(fibonaccy + " ");
                past = current;
                current = fibonaccy;
                sumOffibonaci +=fibonaccy;
            }
            System.out.println("\nHasil penjumlahan Bilangan Fibonacci = " + sumOffibonaci +"\n");
            System.out.print("Anda Ingin Mengulang [y/t]: ");
            loop = input.next();
            if (loop.equalsIgnoreCase("t")){
                looping=false;
            }
        }
        System.out.println("Well Done. Thank You!");
    }

}
