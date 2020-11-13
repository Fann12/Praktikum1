package fanny07204_pendataankorbanbencana;

import java.util.Scanner;


public class Fanny07204_PendataanKorbanBencana {
    static Scanner Fanny07204_input = new Scanner (System.in);

    
    public static void main(String[] args) {
        
    Fanny07204DataKorban data = new Fanny07204DataKorban();
        System.out.println("\tPENDATAAN KORBAN BENCANA SELAMAT");
        int pil;
        do {
            System.out.println("1.Input Data Korban");
            System.out.println("2.Print Data");
            System.out.println("3.Hapus");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("\n pilih = ");
            pil = Fanny07204_input.nextInt();
            switch (pil){
                case 1 :
                    System.out.print("NIK Korban = ");
                    String Fanny07204_nik = Fanny07204_input.next();
                    System.out.print("Nama Korban = ");
                    String Fanny07204_nama = Fanny07204_input.next();
                    System.out.print("Pekerjaan = ");
                    String Fanny07204_kerja = Fanny07204_input.next();
                    System.out.print("No Telp = ");
                    String Fanny07204_notelp = Fanny07204_input.next();
                    System.out.print("Jenis Kelamin L/P= ");
                    String Fanny07204_kelamin = Fanny07204_input.next();
                    System.out.print("Alamat = ");
                    String Fanny07204_alamat = Fanny07204_input.next();
                    System.out.print("Agama = ");
                    String Fanny07204_agama = Fanny07204_input.next();
               System.out.print("=============================================\n");
                    System.out.print("\tDONASI\n");
                    System.out.print("Donasi Yang Diberikan = ");
                    String Fanny07204_bantuan = Fanny07204_input.next();
                   
                    
  data.Fanny07204_Korban(Fanny07204_nama, Fanny07204_kerja, Fanny07204_alamat, 
                      Fanny07204_agama, Fanny07204_kelamin, Fanny07204_bantuan, Fanny07204_nik, 
                     Fanny07204_notelp);
                    break;
                case 2 :
                    data.view();
                    break;
                case 3 :
                    System.out.println("NIK berapa Yang dihapus = ");
                    String hapus=Fanny07204_input.next();
                    data.hapus(hapus);
                    break;
                case 4 :
                    System.out.println("NIK berapa Yang diupdate = ");
                    String nik=Fanny07204_input.next();
                    System.out.println("Donasi Yang diupdate = ");
                    String bantuanbaru=Fanny07204_input.next();
                    data.update(nik, bantuanbaru);
                    break;
            }
    }while (pil!=5);
  }
}
        
       
 