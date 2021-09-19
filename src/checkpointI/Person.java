package checkpointI;

public class Person {
    private String name;
    private String cpf;
    private String phone;
    private Gender gender;
    private String email;
    private Address address;

    public Person(String name, String cpf, String phone, Gender gender, String email, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }
}
