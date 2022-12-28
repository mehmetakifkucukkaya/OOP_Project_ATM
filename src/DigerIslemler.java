import java.util.Scanner;

public class DigerIslemler{

    User musteri = new User();
    int secilenIslem;
    Scanner scanner = new Scanner(System.in);
    Islemler islemler = new Islemler();
    public  void menu(){

        System.out.println(musteri.getBakiye());

        System.out.println("1-)Fatura Ödeme");
        System.out.println("2-)Sınav Harcı Ödeme");
        System.out.println("3-)Ehliyet Ödemeleri");
        System.out.println("4-)Dijital Oyun Ödemeleri");
        System.out.println("5-)Vergi Ödemeleri");
        System.out.println("6-)Bağış İşlemleri");
        System.out.println("7-)Kredi İşlemleri");
        System.out.println("8-)Döviz İşlemleri");
        System.out.println("9-)Yatırım/Borsa İşlemleri");

        System.out.println("\nLütfen yapmak istediğiniz işlemi seçin");
        secilenIslem = scanner.nextInt();

        switch (secilenIslem)
        {
            case 1:
                //faturaOdemeleri();
                break;
            case 2:
                //sinavOdemeleri();
                break;
            case 3:
                //ehliyetOdemeleri();
                break;
            case 4:
                //dijitalOyunOdemeleri();
                break;
            case 5:
                //vergiOdemeleri();
                break;
            case 6:
                //bagisIslemeri();
                break;
            case 7:
                //krediIslemeri();
                break;
            case 8:
                //dovizIslemeri();
                break;
            case 9:
                //yatirimIslemeri();
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz! Lütfen tekrar deneyin\n");
                menu();
                break;
        }
    }


}
