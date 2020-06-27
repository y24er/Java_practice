class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("狗可以跑和走");
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        animal1.move();//动物可以移动
        animal2.move();//狗可以跑和走
    }
}
