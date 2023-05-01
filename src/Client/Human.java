package Client;

public class Human {
    String name, gender, country;
    byte age;

    public Human(String name, byte age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Human(String name, String gender, byte age, String country) {
        this(name, age, country);
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
