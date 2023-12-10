import java.util.Scanner;
public class Kubus20 {
    static int Volume (int sisi) {
        int volume =sisi * sisi * sisi;
        return volume;
    }
    static int LuarPermukaan (int sisi){
        int luarpermukaan = 6 * (sisi * sisi);
        return luarpermukaan;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan panjang sisi");
        int p = input.nextInt();

        int V = Volume(p);
        System.out.println("Volume kubus tersebut adalah : " + V);

        int LP = LuarPermukaan(p);
        System.out.println("Luas Permukaan kubus tersebut adalah "+LP);
    }
}
