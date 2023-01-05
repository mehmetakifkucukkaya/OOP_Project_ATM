public class IslemSonuMesaji implements IMesajlar {

   private char secim;
    @Override
    public void mesaj() {
        System.out.println("\nBaşak bir işlem yapmak istiyor musunuz?\n 'E-H'");
        secim = scanner.next().charAt(0);

        if (secim == 'E' || secim == 'e') {
            System.out.println("İşlem menüsüne dönülüyor...");
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            islemler.islemMenu();

        }
        else if (secim == 'H' || secim == 'h') {
            System.out.println("Çıkış Yapılıyor");
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            islemler.cikisYap();
        }
        else {
            System.out.println("Geçersiz giriş");
            islemler.cikisYap();
        }
    }
}
