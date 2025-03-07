import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> DogList = new ArrayList<Dog>();
        DogList.add(new Dog("Dog1", 1, "1"));
        DogList.add(new Dog("Dog2", 2, "2"));
        DogList.add(new Dog("Dog3", 3, "3"));
        DogList.add(new Dog("Dog4", 4, "4"));
        DogList.add(new Dog("Dog5", 5, "5"));
        for (Dog d : DogList) {
            System.out.println(DogList);
        }


        ArrayList<Car> CarList = new ArrayList<Car>();
        CarList.add(new Car("1", 200, 2.3, true));
        CarList.add(new Car("2", 200, 2.3, true));
        CarList.add(new Car("3", 200, 2.3, true));
        CarList.add(new Car("4", 200, 2.3, true));
        CarList.add(new Car("5", 200, 2.3, true));
        for (Car c : CarList) {
            System.out.println(c);
        }


        ArrayList<Book> BookList = new ArrayList<Book>();
        BookList.add(new Book("1", 23, "1", "2"));
        BookList.add(new Book("2", 23, "2", "3"));
        BookList.add(new Book("3", 23, "3", "4"));
        BookList.add(new Book("4", 23, "4", "5"));
        BookList.add(new Book("5", 23, "5", "6"));
        for (Book b : BookList) {
            System.out.println(b);
        }


        ArrayList<Comments> CommentsList = new ArrayList<Comments>();
        CommentsList.add(new Comments(1, 1, "2", "@", "2"));
        CommentsList.add(new Comments(2, 1, "3", "@", "3"));
        CommentsList.add(new Comments(3, 1, "4", "@", "4"));
        CommentsList.add(new Comments(4, 1, "5", "@", "5"));
        CommentsList.add(new Comments(5, 1, "6", "@", "6"));
        for (Comments c : CommentsList) {
            System.out.println(c);
        }

        ArrayList<Posts> PostsList = new ArrayList<Posts>();
        PostsList.add(new Posts(1, 1, "1", "1"));
        PostsList.add(new Posts(2, 1, "2", "2"));
        PostsList.add(new Posts(3, 1, "3", "3"));
        PostsList.add(new Posts(4, 1, "4", "4"));
        PostsList.add(new Posts(5, 1, "5", "5"));
        for (Posts p : PostsList) {
            System.out.println(p);
        }

    }
}