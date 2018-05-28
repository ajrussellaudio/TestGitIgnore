package models;

import javax.persistence.*;

@Entity
@Table(name = "als")
public class Al {
    private int id;
    private String name;
    private int age;
    private String favouriteLanguage;

    public Al() {
    }

    public Al(String name, int age, String favouriteLanguage) {
        this.name = name;
        this.age = age;
        this.favouriteLanguage = favouriteLanguage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @Column(name = "language")
    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }
}
