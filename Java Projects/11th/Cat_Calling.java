public class Cat_Calling {
    public static void main(String[] args) {
        System.out.println("Cat Count: " + Cat.getCatCount());
        Cat obcat = new Cat();
        System.out.println(obcat.name);
        System.out.println(obcat.age);
        System.out.println(obcat.LivesRemaining);
        obcat.Meow();
        System.out.println("Cat Count: " + Cat.getCatCount());
        System.out.println("Max Lives: " + Cat.MAX_LIVES);
    }
}
