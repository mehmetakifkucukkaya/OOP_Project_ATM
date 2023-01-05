import java.util.Scanner;

public class AnaSayfa{

    User musteri = new User();

    public int kontrolNo,kontrolsifre;
    private int girilenNo, girilenSifre, kalanHak = 3;
    final ThreadLocal<Islemler> islemler = ThreadLocal.withInitial(() -> new Islemler());
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        System.out.println("Merhaba! Bankamıza Hoşgeldiniz...");

        System.out.println("Lütfen aşağıdaki menüden yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1-) Giriş Yap");
        System.out.println("2-) Yeni Banka Hesabı Oluştur");
        System.out.println("3-) Çıkış Yap");

        int secim = scanner.nextInt();

        switch (secim)
        {
            case 1:
               girisYap();
                break;
            case 2:
                yeniHesapAc();
                break;
            case 3:
                cikisYap();
                break;

            default:
                System.out.println("Geçersiz İşlem Seçtiniz");
                menu();
                break;
        }
    }

    public void girisYap()  {

        while (kalanHak > 0) {
            System.out.println("Lütfen müşteri numaranızı girin: ");
            girilenNo = scanner.nextInt();

            System.out.println("Lütfen şifrenizi girin: ");
            girilenSifre = scanner.nextInt();

            if (girilenNo == musteri.getMusteriNo() && girilenSifre == musteri.getMusteriSifre()) {
                System.out.println("Giriş başarıyla yapıldı\n");
                islemler.get().islemMenu();
                break;
            } else {
                System.out.println("********* GiRİŞ BAŞARISIZ OLDU *********");
                kalanHak--;
                if (kalanHak <= 0) {
                    System.out.println("Hesabınız Bloke Edildi !");
                } else {
                    menu();
                }
            }
        }
    }


    public void cikisYap() {
        System.out.println("Atm'den Çıkış Yapılıyor...");
        System.out.println("Hoşçakalın!");

    }
    public void yeniHesapAc() {

        try {
            System.out.println("Lütfen kullanmak istediğiniz müşteri numaranızı girin: ");
            musteri.setMusteriNo(scanner.nextInt());

            System.out.println("Lütfen kullanmak istediğiniz şifrenizi girin: ");
            musteri.setMusteriSifre(scanner.nextInt());

            System.out.println("Hesabınız Başarıyla Oluşturuldu");

            System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...\n");
            menu();
        }
        catch (Exception e)
        {
            System.out.println("Şifreniz ve Müşteri numaranız sadece rakamlardan oluşmalıdır!");
        }

    }


}
