public class BorsaIslemleri extends Islemler {
    int secim,lotSayisi;
    double bfren=5230.8,issen=88.70,eregl=42.92,akbnk=19.65,sahol=44.86;
    public void borsaMenu()
    {
        System.out.println("Borsa Menüsüne Hoşgeldiniz");

        System.out.println("1-) BFREN => 5230.80 TL");
        System.out.println("2-) ISSEN => 88.70 TL");
        System.out.println("3-) EREGL => 42.92 TL");
        System.out.println("4-) AKBNK => 19.65 TL");
        System.out.println("5-) SAHOL => 44.86 TL");

        System.out.println("Lütfen almak istediginiz hissenin numarası giriniz: ");
        secim=scanner.nextInt();

        System.out.println("Lütfen kaç lot alacağınızı giriniz: ");
        lotSayisi=scanner.nextInt();


        switch (secim)
        {
            case 1:
                hisseAl("BFREN",bfren,lotSayisi);
                islemSonuMesaji.mesaj();
                break;
            case 2:
                hisseAl("ISSEN",issen,lotSayisi);
                islemSonuMesaji.mesaj();
                break;
            case 3:
                hisseAl("EREGL",eregl,lotSayisi);
                islemSonuMesaji.mesaj();
                break;
            case 4:
                hisseAl("AKBNK",akbnk,lotSayisi);
                islemSonuMesaji.mesaj();
                break;
            case 5:
                hisseAl("SAHOL",sahol,lotSayisi);
                islemSonuMesaji.mesaj();
                break;
            default:
                System.out.println("Geçersiz Hisse Kodu ! Lütfen Tekrar deneyin");
                borsaMenu();
                break;
        }
    }

    public void hisseAl(String hisseAdi,double hisseFiyat,double lotSayisi) {

        double toplamTutar= hisseFiyat*lotSayisi;

        if(bakiye >= toplamTutar)
        {
            bakiye-=toplamTutar;
        }
        else
        {
            yetersizBakiyeMesaji.mesaj();
        }

        System.out.println(hisseAdi + " adlı hisseden " + toplamTutar + "TL değerinde " + lotSayisi + " adet lot satın aldınız");

        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }
}
