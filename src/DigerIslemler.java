import java.util.Scanner;

public class DigerIslemler{

    User musteri = new User();
    BagisIslemleri bgs = new BagisIslemleri();
    EhliyetIslemleri ehliyet = new EhliyetIslemleri();
    SinavOdemeleri sinav = new SinavOdemeleri();
    FaturaYatir fatura  = new FaturaYatir();
    DijitalOyunOdemeleri oyun= new DijitalOyunOdemeleri();
    SansOyunlari sansOyunlari = new SansOyunlari();
    BorsaIslemleri borsa = new BorsaIslemleri();
    IKrediIslemleri arabakredi = new ArabaKredi();
    IKrediIslemleri evKredi = new EvKredi();
    Euro euro = new Euro(musteri.getBakiye());
    Dolar dolar= new Dolar(musteri.getBakiye());
    int secilenIslem;
    Scanner scanner = new Scanner(System.in);
    public  void menu(){

        System.out.println("1-)  Fatura Ödeme");
        System.out.println("2-)  Sınav Harcı Ödeme");
        System.out.println("3-)  Ehliyet Ödemeleri");
        System.out.println("4-)  Dijital Oyun Ödemeleri");
        System.out.println("5-)  Bağış İşlemleri");
        System.out.println("6-)  Kredi İşlemleri");
        System.out.println("7-)  Döviz İşlemleri");
        System.out.println("8-)  Yatırım/Borsa İşlemleri");
        System.out.println("9-)  Şans Oyunları");

        System.out.println("\nLütfen yapmak istediğiniz işlemi seçin");
        secilenIslem = scanner.nextInt();

        switch (secilenIslem) {
            case 1 -> fatura.faturaMenu();
            case 2 -> sinav.sinavMenu();
            case 3 -> ehliyet.ehliyetMenu();
            case 4 -> oyun.oyunMenu();
            case 5 -> bgs.bagisMenu();
            case 6 -> krediSecim();
            case 7 -> dovizSecim();
            case 8 -> borsa.borsaMenu();
            case 9 -> sansOyunlari.sansOyunMenu();
            default -> {
                System.out.println("Geçersiz işlem seçtiniz! Lütfen tekrar deneyin\n");
                menu();
            }
        }
    }

    public void krediSecim () {
        int secimKredi;

        System.out.println("1-) Araba Kredisi");
        System.out.println("2-) Ev Kredisi");

        System.out.println("Lütfen kredi türünü seçiniz: ");
        secimKredi = scanner.nextInt();

        if(secimKredi == 1)
        {
            arabakredi.krediMenu();
        }
        else if(secimKredi == 2)
        {
            evKredi.krediMenu();
        }
        else {
            System.out.println("Geçersiz işlem seçtiniz!");
            menu();
        }
    }

    public void dovizSecim () {
        int secimDoviz;

        System.out.println("1-) Euro");
        System.out.println("2-) Dolar");

        System.out.println("Lütfen doviz türünü seçiniz: ");
        secimDoviz = scanner.nextInt();

        if(secimDoviz == 1)
        {
            euro.dovizMenu();
        }
        else if(secimDoviz == 2)
        {
            dolar.dovizMenu();
        }
        else {
            System.out.println("Geçersiz işlem seçtiniz!");
            menu();
        }
    }

}
