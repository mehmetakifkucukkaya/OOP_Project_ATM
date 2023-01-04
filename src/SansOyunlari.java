import java.util.Random;
public class SansOyunlari extends Islemler implements OdemeSablon{

    Random random = new Random();
    Mesajlar mesaj = new Mesajlar();
    private int uyeId, secim, kod;
    private double tutar;

    public void sansOyunMenu() {
        System.out.println("Lütfen üye ID'sini giriniz: ");
        uyeId = scanner.nextInt();

        System.out.println("1-) Milli Piyango");
        System.out.println("2-) Türkie Jokey Kulübü");
        System.out.println("3-) Nesine.com");

        System.out.println("Lütfen oyunun kodunu giriniz: ");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                odeme("Milli Piyango");
                mesaj.islemSonuMesaji();
                break;
            case 2:
                odeme("Türkiye Jokey Kulübü");
                mesaj.islemSonuMesaji();
                break;
            case 3:
                odeme("Nesine.com");
                mesaj.islemSonuMesaji();
                break;
            default:
                System.out.println("Geçersiz Giriş Lütfen Tekrar deneyin");
                sansOyunMenu();
                break;
        }

    }

    @Override
    public void odeme(String sansOyunu) {
        System.out.println("Lütfen Tutarı Giriniz: ");
        tutar=scanner.nextDouble();

        if(bakiye >= tutar)
        {
            bakiye-=tutar;
            kod=random.nextInt(10000);
        }
        else
        {
            mesaj.yetersizBakiyeMesaji();
        }

        System.out.println(tutar +" değerinde "+ sansOyunu + " kupununuz tanımlanmıştır");
        System.out.println("Kupon kodunuz: "+ kod);

        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }
}

