package Interface;
interface Animal {
    void feed();
    void makeSound();

}
interface Aquatic extends Animal {
    void swim();
}
interface Climb extends Animal {
    void climb();


}
class Lion implements Animal {

    @Override
    public void feed() {
        System.out.println("Lion Feeding....");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring");
    }


}
class Penguine implements Aquatic{

    @Override
    public void swim() {
        System.out.println("Penguine can swim");
    }

    @Override
    public void feed() {
        System.out.println("Penguine eats fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguine sounds quake quake");
    }
}
class Monkey implements Climb{

    @Override
    public void climb() {
        System.out.println("Monkey can climb");
    }

    @Override
    public void feed() {
        System.out.println("Monkey eats leaves");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey sounds hoop hoop");
    }
}
