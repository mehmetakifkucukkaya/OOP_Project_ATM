import java.util.Scanner;

public class HesapOlustur {
    User musteri = new User();
    Scanner scanner = new Scanner(System.in);

    public void yeniHesapAc(){
        System.out.println("Lütfen kullanmak istediğiniz müşteri numaranızı girin: ");
        musteri.setMusteriNo(scanner.nextInt());

        System.out.println("Lütfen kullanmak istediğiniz şifrenizi girin: ");
        musteri.setMusteriSifre(scanner.nextInt());

        System.out.println("Hesabınız Başarıyla Oluşturuldu");

        System.out.println("Sizi Ana Sayfaya Yönlendiriyorum...\n");

        //Todo -> musteriNo 6 haneli / şifre 4 haneli olsun. (Try-Catch ile kontrol et)
    }

}
