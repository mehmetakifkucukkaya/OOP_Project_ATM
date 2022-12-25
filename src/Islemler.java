import java.util.Scanner;

public class Islemler {
    int secilenIslem;
    AnaSayfa anaSayfa = new AnaSayfa();
    // TODO: 25.12.2022 Para Yatir–Para çek-Para Gönder?–Bakiye Görüntüle–Diğer İşlemler–Şifre Değiştir–Çıkış Yap

    Scanner scanner = new Scanner(System.in);

    public void işlemMenu()
    {
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin");

        System.out.println("1-)Para Yatır");
        System.out.println("2-)Para Çek");
        System.out.println("3-)Para Gönder");
        System.out.println("4-)Bakiye Görüntüle");
        System.out.println("5-)Diğer İşlemler");
        System.out.println("6-)Şifre Değiştir");
        System.out.println("7-)Ana Sayfaya Dön");

        switch (secilenIslem)
        {
            case 1:
                //paraYatir();
                break;
            case 2:
               // paraCek();
                break;
            case 3:
                //bakiyeGoruntule();
                break;
            case 4:
                //paraGonder();
                break;
            case 5:
                //digerIslemler();
                break;
            case 6:
                //sifreDegistir();
                break;
            case 7:
                anaSayfa.menu();
                break;
        }
        }
    }

