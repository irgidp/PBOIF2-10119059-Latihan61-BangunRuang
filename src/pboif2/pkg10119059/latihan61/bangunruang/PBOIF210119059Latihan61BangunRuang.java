/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan bangun ruang menggunakan konsep abstraksi
 */
package pboif2.pkg10119059.latihan61.bangunruang;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan61BangunRuang {

    public static void main(String[] args) {
        BolaBasket bola = new BolaBasket();
        bola.setR(7);
        System.out.println("Jari-jari Bola Basket = " +bola.getR()+ " cm");
        System.out.printf("Volume Bola Basket = %.1f cm^3 \n",bola.hitungVolume());
        System.out.println("");
        
        Tabung tabung = new Tabung();
        tabung.setT(21);
        tabung.setR(10);
        System.out.println("Jari-jari Tabung : " +tabung.getR() +" cm");
        System.out.println("Tinggi Tabung = " +tabung.getT()+ " cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n",tabung.hitungVolume());
        System.out.println("");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setT(9);
        kerucut.setR(14);
        System.out.println("Jari-jari Kerucut = " +kerucut.getR()+ " cm");
        System.out.println("Tinggi Kerucut = " +kerucut.getT()+ " cm");
        System.out.printf("Volume Kerucut = %.1f cm^3 \n",kerucut.hitungVolume());
    }   
    
}
