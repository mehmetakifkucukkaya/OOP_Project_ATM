import java.util.Random;
public class DijitalOyunOdemeleri extends Islemler implements IOdemeSablon {

    Random random = new Random();
    private int secim,kod;
    private double tutar;
    public void oyunMenu()
    {
        System.out.println("1-) PUBG Mobile");
        System.out.println("2-) League of Legends");
        System.out.println("3-) Valorant RP");

        System.out.println("Lütfen almak istediğiniz oyunun kodunu giriniz: ");
        secim=scanner.nextInt();

       switch (secim)
       {
           case 1:
               odeme("PUBG Mobile");
               islemSonuMesaji.mesaj();
               break;
           case 2: odeme("League of Legends");
               islemSonuMesaji.mesaj();
               break;
           case 3: odeme("Valorant RP");
               islemSonuMesaji.mesaj();
               break;
           default:
               System.out.println("Geçersiz Giriş Lütfen Tekrar deneyin");
               oyunMenu();
               break;
       }

    }

    @Override
    public void odeme(String oyun) {
        System.out.println("Lütfen Tutarı Giriniz: ");
        tutar=scanner.nextDouble();

        if(bakiye >= tutar)
        {
            bakiye-=tutar;
            kod=random.nextInt(10000);

        }
        else
        {
            yetersizBakiyeMesaji.mesaj();
        }

        System.out.println(tutar +" değerinde "+ oyun + " kodu alınmıştır ");
        System.out.println("Oyun kodunuz: "+ kod);

        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }
}
