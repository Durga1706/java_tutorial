public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);

        dog.display();
        dog.sound();

        cat.display();
        cat.sound();
    }
}


class Animal {
    String ani_type;
    String name;
    int age;

    Animal(String ani_type, String name, int age) {
        this.ani_type = ani_type;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old.");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super("Dog", name, age);
    }

    void sound() {
        System.out.println("I sound bark.");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super("Cat", name, age);
    }

    void sound() {
        System.out.println("I sound meow.");
    }
}
