import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz : ");
        float boy = scan.nextFloat();
        System.out.println("Kilonuzu Giriniz : ");
        float kilo = scan.nextFloat();

        float vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz = " + vki);

        if (vki < 18) {
            System.out.println("Zayıf");
        }
        if (vki < 25) {
            System.out.println("Normal");
        }
        if (vki < 30) {
            System.out.println("Hafif Şişman");
        }
        if (vki < 35) {
            System.out.println("Obez");
        }
    }
}