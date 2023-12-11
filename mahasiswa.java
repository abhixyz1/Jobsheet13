import java.util.Scanner;

public class mahasiswa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];

        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        inputDataMahasiswa(nilaiMahasiswa, namaMahasiswa, jumlahMahasiswa, jumlahTugas);

        System.out.println("\nSeluruh Nilai Mahasiswa:");
        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa, jumlahMahasiswa, jumlahTugas);

        int hariTertinggi = cariHariTertinggi(nilaiMahasiswa, jumlahMahasiswa, jumlahTugas);
        System.out.println("\nHari dengan nilai tertinggi adalah hari ke-" + hariTertinggi);

        tampilkanMahasiswaTertinggi(nilaiMahasiswa, namaMahasiswa, jumlahMahasiswa, jumlahTugas);
    }

    static void inputDataMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = sc.next();

            System.out.println("\nMasukkan nilai tugas untuk Mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        System.out.printf("%-15s", "");
        for (int tugas = 1; tugas <= jumlahTugas; tugas++) {
            System.out.printf("%-10s", "Tugas " + tugas);
        }
        System.out.println();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-15s", namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.printf("%-10d", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
    }

    static int cariHariTertinggi(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        int[] totalNilaiPerHari = new int[jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilaiPerHari[j] += nilaiMahasiswa[i][j];
            }
        }

        int hariTertinggi = 1;
        for (int i = 1; i < jumlahTugas; i++) {
            if (totalNilaiPerHari[i] > totalNilaiPerHari[hariTertinggi - 1]) {
                hariTertinggi = i + 1;
            }
        }

        return hariTertinggi;
    }

    static void tampilkanMahasiswaTertinggi(int[][] nilaiMahasiswa, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        int nilaiTertinggi = -1;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi] +
                " dengan nilai total " + nilaiTertinggi);

        System.out.println("Detail nilai per tugas:");
        for (int j = 0; j < jumlahTugas; j++) {
            System.out.println("Tugas ke-" + (j + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][j]);
        }
    }
}
