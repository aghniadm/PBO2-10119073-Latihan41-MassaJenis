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

public class PBO210119073Latihan41MassaJenis {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("=====Massa Jenis Kubus=====");
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("Sisi  : "+kubus.getSisi());
        System.out.println("Massa : "+kubus.getMassa());
        
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Volume       : "+kubus.hitungVolume(0));
        System.out.println("Massa Jenis  : "+kubus.hitungMassaJenis(0,0));
    }
    
}
