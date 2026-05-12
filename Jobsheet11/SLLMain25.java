// package Jobsheet11;

// public class SLLMain25 {
//     public static void main(String[] args) {
//         SingleLinkedList25 sll = new SingleLinkedList25();

//         Mahasiswa25 mhs1 = new Mahasiswa25("24212200", "Alfaro", "1A", 4.0);
//         Mahasiswa25 mhs2 = new Mahasiswa25("23422201", "Bimon", "2B", 3.8);
//         Mahasiswa25 mhs3 = new Mahasiswa25("22422202", "Cintia", "3C", 3.5);
//         Mahasiswa25 mhs4 = new Mahasiswa25("21212203", "Dirga", "4D", 3.6);

//         sll.print();
//         sll.addFirst(mhs4);
//         sll.print();
//         sll.addLast(mhs1);
//         sll.print();
//         sll.insertAfter("Dirga", mhs3);
//         sll.insertAt(2, mhs2);
//         sll.print();
//     }
// }

package Jobsheet11;

import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList25 sll = new SingleLinkedList25();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nData Linked List:");
        sll.print();

        sc.close();
    }
}