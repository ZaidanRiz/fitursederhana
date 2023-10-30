package org.example;

import java.util.Scanner;

/**
 * Kelas ini merepresentasikan seorang pegawai.
 * Kelas ini menyimpan informasi seperti nama, gaji, dan jabatan pegawai.
 */
public class Pegawai {
    private String nama;
    private double gaji;
    private String jabatan;

    /**
     * Konstruktor untuk membuat objek Pegawai.
     * @param nama Nama pegawai.
     * @param gaji Gaji pegawai.
     * @param jabatan Jabatan pegawai.
     */
    public Pegawai(String nama, double gaji, String jabatan) {
        this.nama = nama;
        this.gaji = gaji;
        this.jabatan = jabatan;
    }

    /**
     * Metode untuk mendapatkan nama pegawai.
     * @return Nama pegawai.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Metode untuk mengubah nama pegawai.
     * @param nama Nama baru pegawai.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Metode untuk mendapatkan gaji pegawai.
     * @return Gaji pegawai.
     */
    public double getGaji() {
        return gaji;
    }

    /**
     * Metode untuk mengubah gaji pegawai.
     * @param gaji Gaji baru pegawai.
     */
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /**
     * Metode untuk mendapatkan jabatan pegawai.
     * @return Jabatan pegawai.
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * Metode untuk mengubah jabatan pegawai.
     * @param jabatan Jabatan baru pegawai.
     */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    /**
     * Metode untuk mencetak informasi pegawai ke konsol.
     */
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: $" + gaji);
        System.out.println("Jabatan: " + jabatan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pegawai: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan gaji pegawai: $");
        double gaji = scanner.nextDouble();

        scanner.nextLine(); // Mengonsumsi newline character.

        System.out.print("Masukkan jabatan pegawai: ");
        String jabatan = scanner.nextLine();

        Pegawai pegawai = new Pegawai(nama, gaji, jabatan);
        pegawai.cetakInfo();
    }
}