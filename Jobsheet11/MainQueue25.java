package Jobsheet11;

import java.util.Scanner;

public class MainQueue25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueLinkedList25 queue = new QueueLinkedList25();

        int pilih;

        do {
            System.out.println("\n===== ANTRIAN UNIT KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    queue.peekFront();
                    break;

                case 5:
                    queue.peekRear();
                    break;

                case 6:
                    queue.jumlahAntrian();
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

        sc.close();
    }
}