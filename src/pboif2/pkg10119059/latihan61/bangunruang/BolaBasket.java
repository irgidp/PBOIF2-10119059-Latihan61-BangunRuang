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
public class BolaBasket extends BangunRuang {

    public int getR(){
        return r;
    }
    
    public void setR(int r){
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(r,3))*4/3;
    }
    
}
