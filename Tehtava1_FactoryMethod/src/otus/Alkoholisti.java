package otus;

import juoma.Juoma;
import juoma.Olut;

public class Alkoholisti extends Opettaja {

    public Juoma createJuoma() {
        return new Olut();
    }
}