import java.util.Map;
import java.util.Scanner;

public class BagisIslemleri extends Islemler{

    Scanner scanner = new Scanner(System.in);
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

        System.out.println("Bağış Miktarını Giriniz: ");
        bagisMiktari=scanner.nextDouble();

       if(bakiye < bagisMiktari)
       {
          yetersizBakiyeMesaji.mesaj();
           System.out.println("Bağış Menüsüne Dönülüyor... ");
           bagisMenu();
       }
       else {
           bakiye-=bagisMiktari;
       }


        System.out.println("\nLütfen bağış yapmak istediğiniz vakfı seçiniz: ");
        secilenVakif= scanner.nextInt();

       switch (secilenVakif)
       {
           case 1:
               System.out.println("Afad'a "+ bagisMiktari + " TL bağış yapılmıştır.");
               System.out.println("Mevcut Bakiyeniz: "+bakiye);
               islemSonuMesaji.mesaj();
               break;
           case 2:
               System.out.println("Lösev'e "+ bagisMiktari + " TL bağış yapılmıştır.");
               System.out.println("Mevcut Bakiyeniz: "+bakiye);
               islemSonuMesaji.mesaj();
               break;
           case 3:
               System.out.println("KızılAy'a "+ bagisMiktari + " TL bağış yapılmıştır.");
               System.out.println("Mevcut Bakiyeniz: "+bakiye);
               islemSonuMesaji.mesaj();
               break;
           case 4:
               System.out.println("Mehmetçik Vakfına "+ bagisMiktari + " TL bağış yapılmıştır.");
               System.out.println("Mevcut Bakiyeniz: "+bakiye);
               islemSonuMesaji.mesaj();
               break;
           default:
               System.out.println("Geçersiz Giriş Lütfen Tekrar deneyin");
               bagisMenu();
               break;
       }


    }
}
