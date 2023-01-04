import java.util.Map;

public class EhliyetIslemleri extends  Islemler{

    Mesajlar mesaj = new Mesajlar();
    char ehliyetSecim;

    //Ehliyet Ücretleri
    private double ehliyetA=825.70;
    private double ehliyetB=2489.90;

    public void ehliyetMenu(){
    // Ehliyet türlerini tutan map yapısı
        Map<String, Double> ehliyetTuru  =
                Map.ofEntries(
                        Map.entry("A",825.70),
                        Map.entry("B",2489.90)
                );
        System.out.println(ehliyetTuru);

        System.out.println("Lütfen Ehliet Türünüzü Seçiniz: ");
        ehliyetSecim=scanner.next().charAt(0);

        if (ehliyetSecim == 'a' || ehliyetSecim == 'A')
        {
            if (bakiye < ehliyetA)
            {
                mesaj.yetersizBakiyeMesaji();
            }
            else
            {
                System.out.println("Ehliyet Harciniz Yatirildi!");
                bakiye -= ehliyetA;
                System.out.println("Mevcut Bakiyeniz: "+bakiye);
                mesaj.islemSonuMesaji();
            }
        }
        if (ehliyetSecim == 'b' || ehliyetSecim == 'B')
        {
            if (bakiye < ehliyetB)
            {
                mesaj.yetersizBakiyeMesaji();
            }
            else
            {
                System.out.println("Ehliyet Harciniz Yatirildi!");
                bakiye -= ehliyetB;
                System.out.println("Mevcut Bakiyeniz: "+bakiye);
                mesaj.islemSonuMesaji();;
            }
        }
    }
}
