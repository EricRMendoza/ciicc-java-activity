interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

public class Task16 implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Gorilla is eating.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming the gorilla.");
    }

    @Override
    public void pet() {
        System.out.println("Attempting to pet the gorilla...");
    }

    public static void main(String[] args) {
        Task16 gorilla = new Task16();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}