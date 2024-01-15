import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Cat("Мурка", 3, "серый"),
                new Dog("Бобик", 5, 3)
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("Кличка: " + animal.name);
            System.out.println("Возраст: " + animal.age);

            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (Exception e) {
                System.out.println("Метод 'makeSound()' не найден.");
            }

            System.out.println();
        }
        }
    }

