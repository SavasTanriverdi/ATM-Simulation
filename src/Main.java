import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000; // Başlangıç bakiyesi
        int choice;

        System.out.println("ATM Programına Hoş Geldiniz!");

        do {
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1. Bakiye Görüntüleme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");

            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mevcut Bakiyeniz: " + balance + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println(depositAmount + " TL yatırıldı. Güncel Bakiyeniz: " + balance + " TL");
                    } else {
                        System.out.println("Geçersiz miktar.");
                    }
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount + " TL çekildi. Güncel Bakiyeniz: " + balance + " TL");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        System.out.println("Geçersiz miktar.");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler dileriz!");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}