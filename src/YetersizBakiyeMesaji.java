public class YetersizBakiyeMesaji implements Mesajlar{
    @Override
    public void mesaj() {
        System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır!");
        System.out.println("İşlemler menüsüne dönülüyor...\n");

        islemler.islemMenu();
    }
}
