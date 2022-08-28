package otus;

import juoma.Juoma;
import juoma.Vesi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Vesi();
    };
}
