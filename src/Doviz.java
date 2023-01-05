import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Doviz extends Islemler{
    YetersizBakiyeMesaji yetersizBakiyeMesaji = new YetersizBakiyeMesaji();
    IslemSonuMesaji islemSonuMesaji= new IslemSonuMesaji();

    Scanner scanner = new Scanner(System.in);

    // TODO: 25.12.2022 Euro - Dolar  /  Altın (Gram,Çeyrek,Yarım,Tam) ve Gümüş (10gr,25gr,50gr,100gr,1kg) alınabilsin
    private double alinacaDovizMiktari,mevcutDovizMiktari;;
    double tutar;
    char secim;
    public abstract void dovizSatinAl();

    public abstract void dovizMenu();

    public double getAlinacaDovizMiktari() {
        return alinacaDovizMiktari;
    }

    public void setAlinacaDovizMiktari(double alinacaDovizMiktari) {
        this.alinacaDovizMiktari = alinacaDovizMiktari;
    }

    public double getMevcutDovizMiktari() {
        return mevcutDovizMiktari;
    }

    public void setMevcutDovizMiktari(double mevcutDovizMiktari) {
        this.mevcutDovizMiktari = mevcutDovizMiktari;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
