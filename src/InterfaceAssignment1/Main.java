package Interface;

public class Main {
    public static void main(String[] args) {
        Penguine penguine = new Penguine();
        penguine.feed();
        penguine.swim();

        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();

        Monkey monkey = new Monkey();
        monkey.climb();
        monkey.feed();




    }


}
