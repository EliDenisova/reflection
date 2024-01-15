public class Dog extends Animal{
    int size;

    public Dog(String name, int age, int size) {
        super(name, age);
        this.size = size;
    }

    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public void sit(){
        System.out.println("Собака села");
    }
}
