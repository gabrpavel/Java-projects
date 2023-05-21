import com.gabr.corejava.*;

public class testAnimal {

    public static void main(String[] args) {

        var animal = new Animal[3];

        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Cow();

        var animals = new Animals(animal);

        animals.sound();

    }

}
