
package fanny07204_pendataankorbanbencana;
import java.util.ArrayList;

public class Fanny07204DataKorban {
    private final ArrayList <Fanny07204Korban> datakorban =new ArrayList();
        
     public void Fanny07204_Korban(String Fanny07204_nama, String Fanny07204_kerja, 
               String Fanny07204_alamat, String Fanny07204_agama, 
               String Fanny07204_kelamin, String Fanny07204_bantuan, String Fanny07204_nik,
               String Fanny07204_notelp){
    datakorban.add(new Fanny07204Korban(Fanny07204_nama,Fanny07204_kerja,Fanny07204_alamat,
           Fanny07204_agama,Fanny07204_kelamin,Fanny07204_bantuan,Fanny07204_nik,Fanny07204_notelp));
    }
    public void view (){
    System.out.println("\tDATA TERKINI KORBAN SELAMAT");
        for (Fanny07204Korban datakorban1 : datakorban) {
            System.out.println("NIK = " + datakorban1.nik);
            System.out.println("Nama = " + datakorban1.nama);
            System.out.println("Pekerjaan = " + datakorban1.pekerjaan);
            System.out.println("No Telp = " + datakorban1.notelp);
            System.out.println("Jenis Kelamin = " + datakorban1.jeniskelamin);
            System.out.println("Alamat Korban = " + datakorban1.alamat);
            System.out.println("Agama = " + datakorban1.agama);
            System.out.println("Bantuan Yang Diberikan = \n" + datakorban1.bantuan);
        }
    }
    private int carinik(String Fanny07204_nik){
        int index=-1;
        for(int i=0;i <datakorban.size();i++) {
           if(Fanny07204_nik.equals(datakorban.get(i).nik))
               index=i;
       }
       return index;
    }
    public void hapus(String Fanny07204_nik){
        datakorban.remove(carinik(Fanny07204_nik));
    }
    public void update(String Fanny07204_nik, String Fanny07204_bantuanbaru){
        if(carinik(Fanny07204_nik)!=1){
            datakorban.get(carinik(Fanny07204_nik)).bantuan=Fanny07204_bantuanbaru;
        }
        else {
            System.out.println("NIK tidak Ditemukan");
        }
    }

    
  }


        
        
    
    
