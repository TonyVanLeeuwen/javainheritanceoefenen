package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {



    private String name;
    private String sex;
    private final Dog dog;

    public DogOwner(String name, String sex, Dog dog) {
        this.name = name;
        this.sex = sex;
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void changeName(String name){
        dog.setName(name);
    }

    public void setageOfDog(){
        dog.setAge();
    }

    @Override
    public String toString() {
        return getName() + " heeft een " + dog.getSex() + ", deze is " + dog.getAge() + " jaar oud en van het soort: " + dog.getSpecies() + ". De hond heet: " + dog.getName();
    }
}
