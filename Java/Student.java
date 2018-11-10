import java.util.*;
class Student{
  private String name;
  private String rollNumber;
  private String favoriteFruit;
  private float height;
  private float weight;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setrollNumber(String rollNumber){
    this.rollNumber=rollNumber;
  }
  public String getrollNumber(){
    return this.rollNumber;
  }
  public void setfavoriteFruit(String favoriteFruit){
    this.favoriteFruit=favoriteFruit;
  }
  public String getfavoriteFruit(){
    return this.favoriteFruit;
  }
  public void setHeight(float height){
    this.height=height;
  }
  public float getHeight(){
    return this.height;
  }
  public void setWeight(float weight){
    this.weight=weight;
  }
  public float getWeight(){
    return this.weight;
  }
  public Student(String name, String rollNumber, String favoriteFruit, float height, float weight){
    this.name=name;
    this.rollNumber=rollNumber;
    this.favoriteFruit=favoriteFruit;
    this.height=height;
    this.weight=weight;
  }
  public Student()
  {
    this.name="";
    this.rollNumber="";
    this.favoriteFruit="";
    this.height=0.0f;
    this.weight=0.0f;
  }
}
