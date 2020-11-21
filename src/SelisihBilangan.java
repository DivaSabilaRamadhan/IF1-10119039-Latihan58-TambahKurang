/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class dari Selisih Bilangan 
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        int a,b;
        a = getX();
        b = getY();
        int result = a - b;
        System.out.println("Hasil Selisih " + a +" - " + b + " = " + result);
    }
}
