class Animal {
    protected String name;

    protected void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }

}

class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.name = "Rohu";
        labrador.display();
        labrador.eat();
    }
}