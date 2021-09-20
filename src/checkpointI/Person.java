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

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}
