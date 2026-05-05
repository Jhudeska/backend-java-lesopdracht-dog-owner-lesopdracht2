public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex, Dog dog){
        this.name = name;
        this.sex = sex;
        this.dog = dog;
    }

    public DogOwner(String name, String sex){
        this.name = name;
        this.sex = sex;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void increaseAgeOfDogWithOneYear() {
        this.dog.age += 1;
    }

    public String toString(Dog dog) {
        return "DogOwner{"
                + this.name + " heeft een " +
                " " + dog.getSpicies() + ", deze is " +
                dog.getAge() + " jaar oud en van het soort: "
                + dog.getSex() + ".\n" + "De hond heet: " + dog.getName();
    }


}