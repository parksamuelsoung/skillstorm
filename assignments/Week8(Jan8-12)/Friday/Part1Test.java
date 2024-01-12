import java.util.Arrays;
import java.util.List;

public class Part1Test {
    
    public static void main(String[] args) {

        Pet bunny = new Pet("Bugs", 9);
        Pet cat = new Pet("Sylvester", 4);
        Pet bird = new Pet("Tweety", 1);
        Pet duck = new Pet("Daffy", 5);
        Pet pig = new Pet("Porky", 7);
        Pet coyote = new Pet("Wile", 15);
        Pet skunk = new Pet("Pepe", 8);
        Pet dog = new Pet("Hector", 11);
        Pet td = new Pet("Taz", 3);

        Person granny = new Person("Emma", Arrays.asList(bird, dog, cat, duck, pig));
        Person elmer = new Person("Elmer", Arrays.asList(bunny, coyote, skunk));
        Person ys = new Person("Yosemite Sam", Arrays.asList(td));

        List<Person> persons = Arrays.asList(granny, elmer, ys);

        mostPets(persons);

    }

    public static void mostPets(List<Person> petOwners) {
        
        int maxNumberOfPets = petOwners.stream()
            .map((person) -> person.pets.size())
            .reduce(0, (maxNumPets, curNumPets) -> Math.max(maxNumPets, curNumPets));
        
        System.out.println(maxNumberOfPets);
    }

}
