public class IslemSonuMesaji implements Mesajlar{

   private char secim;
    @Override
    public void mesaj() {
        System.out.println("\nBaşak bir işlem yapmak istiyor musunuz?\n 'E-H'");
        secim = scanner.next().charAt(0);

        if (secim == 'E' || secim == 'e') {
            islemler.islemMenu();

        }
        if (secim == 'H' || secim == 'h') {
            islemler.cikisYap();
        }
    }
}
