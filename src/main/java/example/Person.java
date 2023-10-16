package example;

public class Person {
    private  Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello,my Pet");
        pet.say();
    }
}
