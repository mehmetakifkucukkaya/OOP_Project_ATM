import java.util.Map;
import java.util.Scanner;

public class BagisIslemleri extends Islemler{

    Scanner scanner = new Scanner(System.in);
    Mesajlar mesaj = new Mesajlar();
    int secilenVakif;
    double bagisMiktari;
    public void bagisMenu()
    {
        //Vakıf isimlerini tutan Map Yapısı
        Map<Integer, String> vakiflar  =
                Map.ofEntries(
                        Map.entry(1,"Afad"),
                        Map.entry(2,"Lösev"),
                        Map.entry(3,"KızılAy"),
                        Map.entry(4,"Mehmetçik Vakfı")
                );

        System.out.println(vakiflar);

        System.out.println("\nLütfen bağış yapmak istediğiniz vakfı seçiniz: ");
        secilenVakif= scanner.nextInt();

        System.out.println("Bağış Miktarını Giriniz: ");
        bagisMiktari=scanner.nextDouble();

       if(bakiye < bagisMiktari)
       {
           mesaj.yetersizBakiyeMesaji();
           System.out.println("Bağış Menüsüne Dönülüyor... ");
           bagisMenu();
       }
       else {
           bakiye-=bagisMiktari;
       }

       switch (secilenVakif)
       {
           case 1:
               System.out.println("Afad'a "+ bagisMiktari + " TL bağış yapılmıştır.");
               mesaj.islemSonuMesaji();
               break;
           case 2:
               System.out.println("Lösev'e "+ bagisMiktari + " TL bağış yapılmıştır.");
               mesaj.islemSonuMesaji();

               break;
           case 3:
               System.out.println("KızılAy'a "+ bagisMiktari + " TL bağış yapılmıştır.");
               mesaj.islemSonuMesaji();

               break;
           case 4:
               mesaj.islemSonuMesaji();
               System.out.println("Mehmetçik Vakfına "+ bagisMiktari + " TL bağış yapılmıştır.");
               break;
           default:
               System.out.println("Geçersiz Giriş Lütfen Tekrar deneyin");
               bagisMenu();
               break;
       }

        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }
}
