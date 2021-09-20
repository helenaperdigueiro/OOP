package checkpointI;

public class Address {
    private String address;
    private short number;
    private String additionalInfo; //complemento
    private String neighborhood;
    private String cep;
    private String city;
    private String state;

    public Address(String address, short number, String neighborhood, String cep, String city, String state) {
        this.address = address;
        this.number = number;
        this.neighborhood = neighborhood;
        this.cep = cep;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return String.format("Logradouro: %s\nNúmero: %s\nComplemento: %s\nBairro: %s\nCEP: %s\nCidade: %s\nEstado: %s",
                this.address, this.number, this.additionalInfo, this.neighborhood, this.cep, this.city, this.state);
    }
}
