package aula01.mesapg;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Bingo", 2, 1.5f, "woof woof");
        Pet pet2 = new Pet("fish", "Nemo", 1, 0.14f, "blub blub");
        Pet pet3 = new Pet("cat", "GitHub", 3, 0.5f, "meow meow");
        Pet pet4 = new Pet("owl", "Hedwig", 100, 0.3f, "hoo hoo");
        Pet[] pets = {pet1, pet2, pet3, pet4};
        for (int i = 0; i < pets.length; i++) {
            printPetInformation(pets[i]);
        }
    }
    private static void printPetInformation(Pet pet) {
        String petTypeMessage;
        if (pet.type.matches("^[aeiou]+")) {
            petTypeMessage = "is an " + pet.type;
        } else {
            petTypeMessage = "is a " + pet.type;
        }
        String petAgeMessage;
        if (pet.age == 1) {
            petAgeMessage = "is " + pet.age + " year old";
        } else {
            petAgeMessage = "is " + pet.age + " years old";
        }

        System.out.println(String.format("%s %s, %s, eats %s kg of food and does \'%s\'.", pet.name, petTypeMessage, petAgeMessage, pet.foodQuantity, pet.sound));
    }
}
