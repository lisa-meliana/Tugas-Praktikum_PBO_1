
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Microsoft User
 */


public class Main {
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        int uts, uas, usia;
        boolean pilihan = true;
        
         System.out.println("Input Data======");
         System.out.print("Nama : ");
         nama = input.nextLine();
         System.out.print("NIM : ");
         nim = input.next();
         System.out.print("Usia : ");
         usia = input.nextInt();
         System.out.print("UTS : ");
         uts = input.nextInt();
         System.out.print("UAS : ");
         uas = input.nextInt();
       
        Mahasiswa dataMahasiswa = new Mahasiswa(nama, nim, usia, uts, uas);
        
        while(pilihan){
        char pilih ;
        System.out.println("Opsi=======");
        System.out.println("1. Tampikan Data");
        System.out.println("2. Edit data");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih = input.next().charAt(0);
            System.out.println("\n");
        
        if(pilih == '1') {
            dataMahasiswa.tampilData();
            
        }else if(pilih == '2'){
                input.nextLine();
                
                System.out.println("Edit Data======");
                System.out.print("Nama : ");
                dataMahasiswa.nama = input.nextLine();
                System.out.print("NIM : ");
                dataMahasiswa.nim = input.next();
                System.out.print("Usia : ");
                dataMahasiswa.usia = input.nextInt();
                System.out.print("UTS : ");
                dataMahasiswa.uts = input.nextInt();
                System.out.print("UAS : ");
                dataMahasiswa.uas = input.nextInt();
        }else if(pilih == '3'){
            pilihan=false;
        }
       
        
    
    }
    }
}
