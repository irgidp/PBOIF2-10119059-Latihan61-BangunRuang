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
public class Kerucut extends BangunRuang {
    public int t;
    
    public int getT(){
        return t;
    }
    
    public void setT(int t){
        this.t = t;
    }
    
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(r, 2) * t) /3;
    }
}
