package task1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Max", 23));
        users.add(new User(2, "Tol9", 45));
        users.add(new User(3, "Igor", 56));
        users.add(new User(4, "Anna", 45));
        users.add(new User(5, "Koko", 12));
        users.add(new User(6, "Loko", 73));

        // Сортування за віком (зростання)
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Сортування за віком (зростання): " + users);

        // Сортування за віком (спадання)
        users.sort((user1, user2) -> Integer.compare(user2.getAge(), user1.getAge()));
        System.out.println("Сортування за віком (спадання): " + users);

        // Сортування за кількістю символів в імені (зростання)
        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        System.out.println("Сортування за кількістю символів в імені (зростання): " + users);

        // Сортування за кількістю символів в імені (спадання)
        users.sort((user1, user2) -> Integer.compare(user2.getName().length(), user1.getName().length()));
        System.out.println("Сортування за кількістю символів в імені (спадання): " + users);


        ArrayList<String> words = new ArrayList<>();

        words.add("сонце");
        words.add("місяць");
        words.add("зорі");
        words.add("вітер");
        words.add("дощ");
        words.add("сніг");
        words.add("хмара");
        words.add("небо");
        words.add("гори");
        words.add("річка");
        words.add("озеро");
        words.add("ліс");
        words.add("птах");
        words.add("дерево");
        words.add("квітка");
        words.add("трава");
        words.add("камінь");
        words.add("земля");
        words.add("поле");
        words.add("хвиля");


        words.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String word : words) {
            System.out.println("Слова за алфавітом: " + word);
        }

    }

}
