package Sentences.Sent;

import java.util.List;

public class SentEscribir extends Sent {
    public static final String ESCRIBIR = "Escribir";

    public String escribir;
    public List<String> expresiones;

    public SentEscribir(List<String> expresiones) {
        super(SentType.SENT_ESCRIBIR);
        this.escribir = ESCRIBIR;
        this.expresiones = expresiones;
    }
}
