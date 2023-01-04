import java.util.Scanner;

public interface Mesajlar {

    Scanner scanner = new Scanner(System.in);
    Islemler islemler = new Islemler();

    public void mesaj();
}
