package task3;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        // Створюємо кілька учасників
        Person person1 = new Person("Vasya", 31);
        Person person2 = new Person("Olga", 28);
        Person person3 = new Person("Serhii", 35);

        // Створюємо кілька тварин
        Pet pet1 = new Pet("Tom", "Cat");
        Pet pet2 = new Pet("Buddy", "Dog");
        Pet pet3 = new Pet("Goldie", "Fish");
        Pet pet4 = new Pet("Fluffy", "Rabbit");

        // Додаємо учасників в клуб
        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);

        // Додаємо тваринок учасникам клубу
        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person1, pet2);
        zooClub.addPetToMember(person2, pet3);
        zooClub.addPetToMember(person3, pet4);

        // Виводимо зооклуб на екран
        System.out.println("\nZooClub:");
        zooClub.displayZooClub();

        // Видаляємо тваринку з власника
        zooClub.removePetFromMember(person1, pet1);

        // Видаляємо конкретну тваринку з усіх власників
        zooClub.removePetFromAll(pet3);

        // Видаляємо учасника клубу
        zooClub.removeMember(person3);

        // Виводимо зооклуб на екран після змін
        System.out.println("\nZooClub after modifications:");
        zooClub.displayZooClub();
    }
}