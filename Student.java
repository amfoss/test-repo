
public class Student {
    private String name, rollNumber, favoriteFruit;
    private float height, weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFavouriteFruit(String favouriteFruit) {
        this.favoriteFruit = favouriteFruit;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return (this.name);
    }

    public String getRollNo() {
        return (this.rollNumber);
    }

    public String getFavouriteFruit() {
        return (this.favoriteFruit);
    }

    public float getWeight() {
        return (this.weight);
    }

    public float getHeight() {
        return (this.height);
    }

    public Student() {
        this.name = null ;
        this.favoriteFruit = null; 
        this.rollNumber = null;
        this.height = 0;
        this.weight = 0;
    }

    public Student(String name,String rollNumber,String favouriteFruit,float height,float weight) {
        this.name = name ;
        this.height = height ;
        this.rollNumber = rollNumber ;
        this.favoriteFruit = favouriteFruit ;
        this.height = height ;
        this.weight = weight ;
    }

}