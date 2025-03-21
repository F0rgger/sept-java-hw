package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Skill> skills1 = Arrays.asList(new Skill("Java", 10), new Skill("JS", 10), new Skill("C++", 10));
        List<Skill> skills2 = Arrays.asList(new Skill("Python", 5), new Skill("SQL", 4));
        List<Skill> skills3 = Arrays.asList(new Skill("JavaScript", 7), new Skill("HTML", 6), new Skill("CSS", 5));
        List<Skill> skills4 = Arrays.asList(new Skill("C#", 8), new Skill("PHP", 6));

        User user1 = new User(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE, skills1, new Car("Toyota", 2021, 250));
        User user2 = new User(2, "Olga", "Ivanova", "olga@ivanova.com", 28, Gender.FEMALE, skills2, new Car("Honda", 2020, 180));
        User user3 = new User(3, "Serhii", "Kovalenko", "serhii@kovalenko.com", 35, Gender.MALE, skills3, new Car("BMW", 2019, 220));
        User user4 = new User(4, "Anna", "Petrova", "anna@petrova.com", 25, Gender.FEMALE, skills4, new Car("Ford", 2022, 200));
        User user5 = new User(5, "Ivan", "Sidorov", "ivan@sidorov.com", 30, Gender.MALE, skills2, new Car("Mazda", 2018, 210));
        User user6 = new User(6, "Natalia", "Shevchenko", "natalia@shevchenko.com", 29, Gender.FEMALE, skills4, new Car("Nissan", 2023, 190));
        User user7 = new User(7, "Dmytro", "Bondarenko", "dmytro@bondarenko.com", 33, Gender.MALE, skills1, new Car("Tesla", 2020, 300));
        User user8 = new User(8, "Liza", "Kovalchuk", "liza@kovalchuk.com", 26, Gender.FEMALE, skills4, new Car("Volkswagen", 2017, 170));
        User user9 = new User(9, "Artem", "Tkachenko", "artem@tkachenko.com", 27, Gender.MALE, skills3, new Car("Peugeot", 2019, 160));
        User user10 = new User(10, "Maria", "Zinchenko", "maria@zinchenko.com", 24, Gender.FEMALE, skills1, new Car("Audi", 2021, 220));

        // HashSet
        HashSet<User> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        usersSet.add(user5);
        usersSet.add(user6);
        usersSet.add(user7);
        usersSet.add(user8);
        usersSet.add(user9);
        usersSet.add(user10);

        System.out.println("HashSet before removing males:");
        usersSet.forEach(System.out::println);

        usersSet.removeIf(user -> user.getGender() == Gender.MALE);

        System.out.println("\nHashSet after removing males:");
        usersSet.forEach(System.out::println);

        // TreeSet (сортируем по количеству навыков)
        TreeSet<User> usersTreeSet = new TreeSet<>(Comparator.comparingInt(user -> user.getSkills().size()));
        usersTreeSet.add(user1);
        usersTreeSet.add(user2);
        usersTreeSet.add(user3);
        usersTreeSet.add(user4);
        usersTreeSet.add(user5);
        usersTreeSet.add(user6);
        usersTreeSet.add(user7);
        usersTreeSet.add(user8);
        usersTreeSet.add(user9);
        usersTreeSet.add(user10);

        System.out.println("\nTreeSet sorted by skill count:");
        usersTreeSet.forEach(System.out::println);

    }
}