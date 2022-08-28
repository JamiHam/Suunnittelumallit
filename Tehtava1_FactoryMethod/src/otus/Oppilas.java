package otus;

import juoma.Juoma;
import juoma.Maito;

public class Oppilas extends AterioivaOtus {
    
    public Juoma createJuoma() {
        return new Maito();
    };
}
