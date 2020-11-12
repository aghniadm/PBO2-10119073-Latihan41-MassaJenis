package pbo2.pkg10119073.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung massa jenis kubus
 *
 */

public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
   
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return sisi * sisi * sisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return massa / (sisi * sisi * sisi);
    }
}
