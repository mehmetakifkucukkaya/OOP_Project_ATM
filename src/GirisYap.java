import java.util.Scanner;

public class GirisYap {

    private int girilenNo,girilenSifre,kalanHak=3;
    Scanner scanner = new Scanner(System.in);

    User musteri = new User();

    public void login()
    {
        while (kalanHak > 0)
        {
            System.out.println("Lütfen müşteri numaranızı girin: ");
            girilenNo=scanner.nextInt();

            System.out.println("Lütfen şifrenizi girin: ");
            girilenSifre=scanner.nextInt();

            if (girilenNo == musteri.getMusteriNo() && girilenSifre == musteri.getMusteriSifre())
            {
                System.out.println("Giriş başarıyla yapıldı");
                //İşlemler kısmına yönlendir
            }
            else
            {
                System.out.println("********* GiRİŞ BAŞARISIZ OLDU *********");
                kalanHak--;
                if (kalanHak <= 0)
                {
                    System.out.println("Hesabınız Bloke Edildi !");
                }
                else
                {
                    //Ana Sayfaya yönlendir
                }
            }
        }

    }

}
