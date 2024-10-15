public class Dog extends Animal {
    // Make constructor
    public Dog (String name) {
        super(name);
    }

    // Implement abstract method
    @Override
    public void makeASound() {
        System.out.println(getName() + " Is barking");
    }
}
