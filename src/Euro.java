public class Euro extends Doviz {

    double euroKur = 19.92;
    public Euro(double deger){
        super.setBakiye(deger);
    }
    @Override
    public void dovizMenu() {
        System.out.println(bakiye);
        System.out.println("Mevcur Euro Kuru: " + euroKur);
        System.out.println("Satın alma menüsü açılıyor...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        dovizSatinAl();
    }

    @Override
    public void dovizSatinAl() {
        System.out.println("Lütfen kaç euro almak istediginizi girin: ");
        setAlinacaDovizMiktari(scanner.nextDouble());

        tutar = getAlinacaDovizMiktari() * euroKur;
        System.out.println(getAlinacaDovizMiktari() + " Euro = " + formatter.format(tutar) + " TL ");
        System.out.println("Satın alma işlemini kabul ediyor musunuz ?");
        System.out.println("E-e / H-h");
        secim = scanner.next().charAt(0);
        if (secim == 'E' || secim == 'e') {

            if (bakiye < tutar)
            {
                System.out.println("Yetersiz Bakiye!");
                dovizMenu();
            }
            else
            {
                bakiye -= tutar;
                setMevcutDovizMiktari(getAlinacaDovizMiktari());
                System.out.println("Mevcut Bakiyeniz: "+ bakiye + " ve mevcut Euro bakiyeniz: "+getMevcutDovizMiktari());
                islemSonuMesaji.mesaj();
            }

        }
        else if (secim == 'H' || secim == 'h') {
            System.out.println("İşlem menüsüne dönülüyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            islemMenu();
        }
        else {
            System.out.println("Geçersiz giriş");
            System.out.println("Döviz menüsüne dönülüyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            dovizMenu();
        }
    }
}
