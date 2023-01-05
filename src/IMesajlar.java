import java.util.Scanner;

public interface IMesajlar {

    Scanner scanner = new Scanner(System.in);
    Islemler islemler = new Islemler();

    void mesaj();
}
