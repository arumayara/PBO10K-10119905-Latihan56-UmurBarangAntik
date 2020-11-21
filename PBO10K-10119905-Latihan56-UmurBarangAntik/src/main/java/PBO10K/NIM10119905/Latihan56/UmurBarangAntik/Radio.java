/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan56.UmurBarangAntik;

/**
 *
 * @author aruma
 */
public class Radio extends BarangAntik {
    private String nama;

    public Radio(int umur) {
        super(umur);
    }

    public String getNama() {
        System.out.println("Nama Barang Antik : "+ nama);
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
