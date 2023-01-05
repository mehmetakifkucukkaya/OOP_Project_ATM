import java.text.DecimalFormat;
import java.util.Scanner;

public class Islemler{
    DecimalFormat formatter = new DecimalFormat("###,###.##"); //Double sayıların virgülden sonra kaç basamak gözükeceğini belirlememizi sağlayan nesne.

    int gonderilecekNo, secilenIslem;
    double yatirilanTutar,cekilenTutar,gonderilecekTutar;
    final ThreadLocal<AnaSayfa> anaSayfa = ThreadLocal.withInitial(() -> new AnaSayfa());
    Scanner scanner = new Scanner(System.in);
     YetersizBakiyeMesaji yetersizBakiyeMesaji= new YetersizBakiyeMesaji();

    IslemSonuMesaji islemSonuMesaji = new IslemSonuMesaji();
    double bakiye =anaSayfa.get().musteri.getBakiye() ;

    public void islemMenu()
    {
        System.out.println("1-)Para Yatır");
        System.out.println("2-)Para Çek");
        System.out.println("3-)Para Gönder");
        System.out.println("4-)Diğer İşlemler");
        System.out.println("5-)Çıkış Yap");

        System.out.println("\nLütfen yapmak istediğiniz işlemi seçin");
        secilenIslem = scanner.nextInt();

        switch (secilenIslem)
        {
            case 1:
                paraYatir();
                break;
            case 2:
               paraCek();
                break;
            case 3:
                paraGonder();
                break;
            case 4:
                digerIslemler();
                break;
            case 5:
                cikisYap();
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz! Lütfen tekrar deneyin\n");
                islemMenu();
                break;
        }
    }

    public void cikisYap() {
        anaSayfa.get().cikisYap();
    }
    private void paraGonder() {
        System.out.println("Lütfen para göndermek istediğiniz kişinin Müşteri Numarasını girin: ");
        gonderilecekNo = scanner.nextInt();

        System.out.println("Lütfen göndermek istediğiniz tutarı girin: ");
        gonderilecekTutar = scanner.nextDouble();

        if(bakiye> gonderilecekTutar )
        {
            bakiye-= gonderilecekTutar;
            System.out.println("Mevcut bakiye : "+bakiye);
            islemSonuMesaji.mesaj();
        }
        else
        {
            yetersizBakiyeMesaji.mesaj();
        }
    }
    private void paraYatir() {
        System.out.println("Lütfen yatırmak istediginiz tutarı girin: ");
        yatirilanTutar= scanner.nextInt();

        bakiye += yatirilanTutar;
        System.out.println("Mevcut bakiye : "+bakiye);
        islemSonuMesaji.mesaj();
    }

    private void paraCek(){

        System.out.println("Lütfen çekmek istediginiz tutarı girin: ");
         cekilenTutar= scanner.nextInt();

        if(bakiye> cekilenTutar )
        {
            bakiye-= cekilenTutar;
        }
        else
        {
            yetersizBakiyeMesaji.mesaj();
        }
        System.out.println("Mevcut bakiye : "+bakiye);
        islemSonuMesaji.mesaj();
    }

    private void digerIslemler() {
        DigerIslemler digerIslem= new DigerIslemler();
        digerIslem.menu();
    }
}



