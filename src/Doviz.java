import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Doviz extends Islemler{
    YetersizBakiyeMesaji yetersizBakiyeMesaji = new YetersizBakiyeMesaji();
    IslemSonuMesaji islemSonuMesaji= new IslemSonuMesaji();

    Scanner scanner = new Scanner(System.in);
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
