import java.text.DecimalFormat;
import java.util.Map;

public class ArabaKredi extends Islemler implements KrediIslemleri {

    int vadeAraba;
    double krediTutari,odencekTutar,faizOraniAraba;

    double toplamFaizTutari,faizTutari,aylikOdeme;
    @Override
    public void krediMenu() {

        Map<Integer, Double> vadeFaizAraba  =
                Map.ofEntries(
                        Map.entry(36,1.99),
                        Map.entry(24,1.94),
                        Map.entry(12,1.89)
                );

        System.out.println(vadeFaizAraba);

        System.out.println("Lütfen kredi Tutarını giriniz:");
        krediTutari = scanner.nextInt();

        System.out.println("Lütfen vade seçiniz:");
        vadeAraba = scanner.nextInt();

        if(vadeAraba == 12)
        {
            faizOraniAraba=1.89;
            faizHesapla(12);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ odencekTutar + " TL");
            System.out.println("Aylik Ödenecek Tutar "+ formatter.format(aylikOdemeHesapla(vadeAraba))+" TL");
            islemSonuMesaji.mesaj();
        }
        else if(vadeAraba == 24)
        {
            faizOraniAraba=1.94;
            faizHesapla(24);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ odencekTutar + " TL");
            System.out.println("Aylik Ödenecek Tutar "+ formatter.format(aylikOdemeHesapla(vadeAraba))+" TL");
            islemSonuMesaji.mesaj();
        }
        else if(vadeAraba == 36)
        {
            faizOraniAraba=1.99;
            faizHesapla(36);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ formatter.format(odencekTutar ) +" TL");
            System.out.println("Aylik Ödenecek Tutar "+ formatter.format(aylikOdemeHesapla(vadeAraba))+" TL");
            islemSonuMesaji.mesaj();
        }
        else {
            System.out.println("Geçersiz vade girdiniz!");
            krediMenu();
        }
    }
    public double faizHesapla(double tutar)
    {
        faizTutari= ((faizOraniAraba / 100) * krediTutari) * 12 ;
         toplamFaizTutari = faizTutari + krediTutari;
       return  toplamFaizTutari;
    }

    public double aylikOdemeHesapla(int ay)
    {
        aylikOdeme = toplamFaizTutari / vadeAraba;
        return aylikOdeme;
    }
}
