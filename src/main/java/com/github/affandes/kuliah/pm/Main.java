package com.github.affandes.kuliah.pm;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

static ArrayList<String> history = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    // Fungsi view → menampilkan seluruh history dari yang paling baru
    public static void view() {
        if (history.isEmpty()) {
            System.out.println("History masih kosong.\n");
        } else {
            System.out.println("\n=== HISTORY (Terbaru → Terlama) ===");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
            System.out.println("===================================\n");
        }
    }

    // Fungsi browse → menambah website baru ke history
    public static void browse() {
        System.out.print("Masukkan website yang ingin dikunjungi: ");
        String site = input.nextLine();
        history.add(site);
        System.out.println("Website '" + site + "' berhasil ditambahkan ke history.\n");
    }

    // Fungsi back → kembali ke website sebelumnya dan hapus history terakhir
    public static void back() {
        if (history.isEmpty()) {
            System.out.println("Tidak ada history untuk kembali.\n");
        } else {
            String removed = history.remove(history.size() - 1);
            System.out.println("Kembali dari '" + removed + "'. History terakhir dihapus.\n");
        }
    }

    // Program utama
    public static void main(String[] args) {

        while (true) {
            System.out.println("=== MENU HISTORY BROWSER ===");
            System.out.println("1. View");
            System.out.println("2. Browse");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    view();
                    break;
                case "2":
                    browse();
                    break;
                case "3":
                    back();
                    break;
                case "4":
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
    

    }
}      
    }