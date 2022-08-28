import otus.Alkoholisti;
import otus.AterioivaOtus;
import otus.Opettaja;
import otus.Oppilas;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
        AterioivaOtus alkoholisti = new Alkoholisti();
        alkoholisti.aterioi();
    }
}