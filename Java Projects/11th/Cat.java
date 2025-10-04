public class Cat {
    String name;
    int age;
    int LivesRemaining;
    private static int CatCount = 0;
    public static final int MAX_LIVES = 9;
    
    public static void main(String[] args) {
        // Cat obcat = new Cat();
        // obcat.Cat();
    }
    
    public Cat() {
        name = "Stella";
        age = 8;
        LivesRemaining = 9;
        CatCount++;
        LivesRemaining = MAX_LIVES;
    }

    public void Meow() {
        System.out.println("Meow");
    }

    public static int getCatCount() {
        return CatCount;
    }
}
