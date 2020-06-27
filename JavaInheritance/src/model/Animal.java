package model;

public class Animal {
    private int age;
    private float weight;

    public Animal() {
    }

    public Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void running(){
        System.out.println("running...");
    }
    public void eating(){
        System.out.println("eating...");
    }
}
