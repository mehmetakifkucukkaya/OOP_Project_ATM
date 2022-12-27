import java.util.Scanner;

public class Mesajlar {
    char secim;
    Scanner scanner = new Scanner(System.in);
    Islemler islemler = new Islemler();

    public void islemSonuMesaji()
    {
        System.out.println("\nBaşak bir işlem yapmak istiyor musunuz?\n 'E-H'");
        secim= scanner.next().charAt(0);

        if (secim == 'E' || secim == 'e')
        {
            islemler.islemMenu();
        }
        if (secim == 'H' || secim == 'h')
        {
            islemler.cikisYap();
        }
    }

    public void yetersizBakiyeMesaji()
    {
        System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır!");
        System.out.println("İşlemler menüsüne dönülüyor...\n");

        islemler.islemMenu();

    }

}
