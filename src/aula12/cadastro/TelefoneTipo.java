package aula12.cadastro;

public enum TelefoneTipo {
    CELULAR("Celular"),
    FIXO("Fixo"),
    WHATSAPP("Whatsapp");

    private String tipo;

    TelefoneTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
