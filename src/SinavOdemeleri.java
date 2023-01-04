public class SinavOdemeleri extends Islemler{
    private  int sinavSecim;
    private double  yks = 230, yds = 115, kpss = 130;
    public void sinavMenu()
    {
        System.out.println("1-) Yks: 230 Tl");
        System.out.println("2-) YDS: 115 TL");
        System.out.println("3-) KPSS:130 TL");

        System.out.println("Lütfen ödeme yapmak istediğiniz sınavı seçiniz: ");
        sinavSecim=scanner.nextInt();

        switch (sinavSecim)
        {
            case 1:
                sinavOdeme("YKS",yks);
                islemSonuMesaji.mesaj();
                break;
            case 2:
                sinavOdeme("YDS",yds);
                islemSonuMesaji.mesaj();
                break;
            case 3:
                sinavOdeme("KPSS",kpss);
                islemSonuMesaji.mesaj();
                break;

        }
    }


    public void sinavOdeme(String sinavTuru,double sinavUcreti)
    {
        if(bakiye >= sinavUcreti)
        {
            bakiye-=sinavUcreti;
        }
        else
        {
           yetersizBakiyeMesaji.mesaj();
        }

        System.out.println(sinavTuru + " başvurunuz tamamlanmıştır");
        System.out.println("Mevcut Bakiyeniz: "+bakiye);
    }

}
