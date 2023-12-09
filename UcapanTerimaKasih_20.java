import java.util.Scanner;
public class UcapanTerimaKasih_20 {
    
    public static  String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String ucaptambah = UcapanTambahan();
        System.out.println("Thank you " + nama +" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything");
        System.out.println("Ucapan Tambahan untuk " + nama + " adalah " +ucaptambah);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
    public static String UcapanTambahan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang ingin di berikan: ");
        String ucapantambahan = sc.nextLine();
        sc.close();
        return ucapantambahan;
    }
}
