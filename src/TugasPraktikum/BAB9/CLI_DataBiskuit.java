/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB9;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Raditya Arya Wiguna
 */
public class CLI_DataBiskuit {
    public static void main(String[] args) {
        Scanner snack = new Scanner(System.in);
        Biskuit biskuit = new Biskuit();

        try {
            System.out.println("PENDATAAN SNACK BISKUIT | CEMILAN RAKYAT");
            System.out.print("ID Snack : "); biskuit.id_snack = snack.nextLine();
            System.out.print("Nama Snack : ");
            biskuit.nama_snack = snack.nextLine();
            if (biskuit.nama_snack.matches(".*\\d.*")) {
                throw new IllegalArgumentException("Nama tidak boleh mengandung angka!");
            }
            System.out.print("Harga : "); biskuit.harga = Integer.parseInt(snack.nextLine());
            System.out.print("Stok Awal : "); biskuit.stok_snack = Integer.parseInt(snack.nextLine());
            System.out.print("Tanggal Kadaluarsa : "); biskuit.setKadaluarsa(snack.nextLine());
            System.out.print("Varian Rasa : "); biskuit.setRasa(snack.nextLine());
            System.out.print("Jenis Kemasan : "); biskuit.setKemasan(snack.nextLine());
            System.out.print("Berat (gram): "); biskuit.setBerat(Integer.parseInt(snack.nextLine()));
            System.out.print("Penambahan Stok : "); biskuit.jumlah_tambah = Integer.parseInt(snack.nextLine());
            System.out.println("BERHASIL! Stok terkini adalah " + biskuit.tambahStok());
            System.out.print("Pengurangan Stok : "); biskuit.jumlah_kurang = Integer.parseInt(snack.nextLine());
            System.out.println("BERHASIL! Stok berkurang menjadi " + biskuit.penjualanProduk());

            System.out.print("Masukkan Diskon (%): ");
            int diskon = Integer.parseInt(snack.nextLine());
            int hargaDiskon = biskuit.hitungDiskon(biskuit.harga, diskon);
            // Hasil output
            System.out.println("\nHasil Akhir Laporan Pendataan Biskuit : ");
            System.out.println("ID : " + biskuit.id_snack);
            System.out.println("Nama : " + biskuit.nama_snack);
            System.out.println("Kategori : Biskuit");
            System.out.println("Harga Awal : " + biskuit.harga);
            System.out.println("Harga Setelah Diskon : " + hargaDiskon);
            System.out.println("Stok : " + biskuit.stok_snack);
            System.out.println("Kadaluarsa : " + biskuit.getKadaluarsa());
            System.out.println("Rasa : " + biskuit.getRasa());
            System.out.println("Kemasan : " + biskuit.getKemasan());
            System.out.println("Berat : " + biskuit.getBerat() + " gram");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input angka tidak valid !!", "Pengisian Salah",2);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Input Tidak Valid", 2);
        } finally {
            System.out.println("Pendataan selesai! Terimakasih banyak");
        }
    }
}
