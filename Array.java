# Kumpulan-Tugas
Tempat jawaban tugas soal menganai program

import java.util.Scanner;
public class TugasArrayJava {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Var
        Byte DataHandphone;

        //Input User
        System.out.println("Isi data jumlah Handphone =");
        DataHandphone = input.nextByte();

        String[] Handphone = new String[DataHandphone];

        //Input Data
        for (int i = 0; i < DataHandphone; i++) {
            System.out.println("Data Handphone ke "+i+ ":");

        }
        //Print
        System.out.println("======HASIL DATA=======");
        for (int i = 0; i < DataHandphone; i++) {
            System.out.println("Handphone Ke ="+i+"=");

        }





    }
}
