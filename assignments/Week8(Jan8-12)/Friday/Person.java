import java.util.List;
import java.util.Objects;

class Person {
    String name;
    List<Pet> pets;

    public Person() {}

    public Person(String name, List<Pet> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return name + "'s pets are " + pets + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pets);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return name.equals(other.name) && pets.equals(other.pets);
    }

    
    
}