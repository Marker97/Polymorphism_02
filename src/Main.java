public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        Lion lion = new Lion("Lion");
        Cow  cow = new Cow ("Cow");
        
        Animal[] animals = {dog,lion,cow};

        for(Animal sound : animals) {
             sound.animalSound();
        }
    }
}