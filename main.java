/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klubsepakbola;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args){
        KlubSepakbola klub1 = new KlubSepakbola(
                "Persija",
                "JL. PB. Sudirman",
                "Rahdani");
        KlubSepakbola klub2 = new KlubSepakbola(
                "Persib",
                "Jl. Selalu benar",
                "Junaedi");
        KlubSepakbola klub3 = new KlubSepakbola(
                "Real Madrid",
                "Jl. Diponegoro",
                "Carlo Anceloti");


        klub1.setjumlahKlub(3);
        System.out.println("---Klub Sepakbola---");
        System.out.println("Nama Klub :" + klub1.namaKlub);
        System.out.println("Alamat Klub :" + klub1.alamatKlub);
        System.out.println("Manajer Klub :" + klub1.manajerKlub);
        System.out.println("Jumlah Pesanan :" + klub1.getjumlahKlub());


        Pemain RealMadrid = new Pemain(
                "Adhitya",
                69,
                "Giper");

        RealMadrid.sethargaPemain(50000000);
        System.out.println("---Pemain---");
        System.out.println("Nama Pemain :" + RealMadrid.namaPemain);
        System.out.println("No Punggung pemain :" + RealMadrid.nopunggungPemain);
        System.out.println("Posisi pemain :" + RealMadrid.posisiPemain);
        System.out.println("Harga Pemain :" + RealMadrid.gethargaPemain());
     

class KlubSepakbola {
    String namaKlub;
    String alamatKlub;
    int noTelepon;
    String manajerKlub;
    String stafKlub;
    String namaPemain;
    int jumlahKlub;
    boolean isopen;

    public KlubSepakbola(String Nama, String Alamat, String ManajerKlub) {
        namaKlub = Nama;
        alamatKlub = Alamat;
        manajerKlub = ManajerKlub;
    }
    public void setjumlahKlub(int JumlahKlub){
        this.jumlahKlub = JumlahKlub;
    }
    public int getjumlahKlub(){
        return this.jumlahKlub;
    }
}
class Pemain{
    String namaPemain;
    int umurPemain;
    int nopunggungPemain;
    String posisiPemain;
    int hargaPemain;

    public Pemain(String NamaPemain, int NoPunggung, String PosisiPemain){
        namaPemain = NamaPemain;
        nopunggungPemain = NoPunggung;
        posisiPemain = PosisiPemain;
    }
    public void sethargaPemain(int HargaPemain){
        this.hargaPemain = HargaPemain;
    }
    public int gethargaPemain(){
        return this.hargaPemain;
    }
}
    }}    
