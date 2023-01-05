import java.util.Map;

public class EvKredi extends Islemler implements IKrediIslemleri {

    int vadeEv;
    double krediTutari,odencekTutar,faizOraniEv;
    double toplamFaizTutari,faizTutari,aylikOdeme;

    @Override
    public void krediMenu() {

        Map<Integer, Double> vadeFaizEv  =
                Map.ofEntries(
                        Map.entry(60,2.05),
                        Map.entry(36,2.03),
                        Map.entry(12,1.99)
                );

        System.out.println(vadeFaizEv);

        System.out.println("Lütfen kredi Tutarını giriniz:");
        krediTutari = scanner.nextInt();

        System.out.println("Lütfen vade seçiniz:");
        vadeEv = scanner.nextInt();

        if(vadeEv == 12)
        {
            faizOraniEv=1.99;
            faizHesapla(12);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ IKrediIslemleri.formatter.format(odencekTutar) + " TL");
            System.out.println("Aylik Ödenecek Tutar "+ IKrediIslemleri.formatter.format(aylikOdemeHesapla(vadeEv))+" TL");
            islemSonuMesaji.mesaj();
        }
        else if(vadeEv == 36)
        {
            faizOraniEv=12.03;
            faizHesapla(24);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ odencekTutar + " TL");
            System.out.println("Aylik Ödenecek Tutar "+ IKrediIslemleri.formatter.format(aylikOdemeHesapla(vadeEv))+" TL");
            islemSonuMesaji.mesaj();
        }
        else if(vadeEv == 60)
        {
            faizOraniEv=2.05;
            faizHesapla(36);
            odencekTutar = faizHesapla(krediTutari) ;
            System.out.println("Ödenecek Tutar "+ odencekTutar + " TL");
            System.out.println("Aylik Ödenecek Tutar "+ IKrediIslemleri.formatter.format(aylikOdemeHesapla(vadeEv))+" TL");
            islemSonuMesaji.mesaj();
        }
        else {
            System.out.println("Geçersiz vade girdiniz!");
            krediMenu();
        }
    }
    @Override
    public double faizHesapla(double tutar)
    {
        faizTutari= ((faizOraniEv / 100) * krediTutari) * 12 ;
        toplamFaizTutari = faizTutari + krediTutari;
        return  toplamFaizTutari;
    }
    @Override
    public double aylikOdemeHesapla(int ay)
    {
        aylikOdeme = toplamFaizTutari / vadeEv;
        return aylikOdeme;
    }

    }

