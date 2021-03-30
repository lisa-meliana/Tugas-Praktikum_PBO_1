


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Microsoft User
 */
public class Mahasiswa {
    String nama, nim;
    int uts, uas;
    int usia;
public Mahasiswa(String nama, String nim, int usia, int uts, int uas){
    this.nama = nama;
    this.nim = nim;
    this.usia = usia;
    this.uts = uts;
    this.uas =uas;
    
}
void tampilData(){
    System.out.print("Perkenalkan nama saya "+ nama);
    System.out.println(" nim "+ nim);
    System.out.println("Usia    : "+ usia);
    System.out.println("Nilai Akhir : "+ hitung());
}

float hitung(){
    return (uts+uas)/2;
}


}


