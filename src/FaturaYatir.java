public class FaturaYatir extends  Islemler implements OdemeSablon{
    private int faturaSecim;
    private double faturaTutari;
    public void faturaMenu()
    {
        System.out.println("1-) Telefon");
        System.out.println("2-) Su");
        System.out.println("3-) Elektirk");
        System.out.println("4-) Doğalgaz");

        System.out.println("Lütfen Yatırmak İstediğiniz Faturayı seçiniz: ");
        faturaSecim=scanner.nextInt();

        switch (faturaSecim)
        {
            case 1:
                odeme("Telefon");
                islemSonuMesaji.mesaj();
                break;
            case 2: odeme("Su");
                islemSonuMesaji.mesaj();
                break;
            case 3: odeme("Elektrik");
                islemSonuMesaji.mesaj();
                break;
            case 4:odeme("Doğalgaz");
                islemSonuMesaji.mesaj();
                break;
            default:
                System.out.println("Geçersiz Giriş Lütfen Tekrar deneyin");
                faturaMenu();
                break;
        }
    }


    @Override
    public void odeme(String faturaTipi) {
        System.out.println("Lütfen Fatura Tutarını Giriniz: ");
        faturaTutari=scanner.nextDouble();

        if(bakiye >= faturaTutari)
        {
            bakiye-=faturaTutari;
        }
        else
        {
            yetersizBakiyeMesaji.mesaj();
        }

        System.out.println(faturaTutari +" TL değerindeki "+ faturaTipi + " faturanız yatırılmıştır");
        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }
}
