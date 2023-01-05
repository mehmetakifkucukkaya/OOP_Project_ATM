import java.text.DecimalFormat;

public interface IKrediIslemleri {
    DecimalFormat formatter = new DecimalFormat("###,###.##"); //Double sayıların virgülden sonra kaç basamak gözükeceğini belirlememizi sağlayan nesne.
     void krediMenu();

     double faizHesapla(double tutar);
    public double aylikOdemeHesapla(int ay);
}
