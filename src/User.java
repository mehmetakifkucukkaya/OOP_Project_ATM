import java.util.HashMap;
import java.util.Map;

public class User {

    private int musteriNo=1,musteriSifre=1;
    private  double bakiye=1000;

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }

    public int getMusteriSifre() {
        return musteriSifre;
    }

    public void setMusteriSifre(int musteriSifre) {
        this.musteriSifre = musteriSifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    //Map<Integer,Integer> users = new HashMap<>();


}
