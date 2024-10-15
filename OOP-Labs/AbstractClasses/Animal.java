abstract class Animal {
    // Variable
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Concrete method
    public String getName() {
        return name;
    }

    // Abstract methods
    public abstract void makeASound();
}
