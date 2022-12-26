public class Main {
    public static void main(String[] args) {
      Parrot parrot=new Parrot("Beks",5,"tansor");
        System.out.println(parrot);
        parrot.Fly();
      Fish fish=new Fish("Sever",15,"malchun");
        System.out.println(fish);
        fish.Swim();
      Cat cat=new Cat("pussy",12,"lentay");
        System.out.println(cat);
        cat.Cat();
      Dog dog=new Dog("Bobik",10,"killer");
        System.out.println(dog);
        dog.dog();
    }
}