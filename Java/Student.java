public class Student{
	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;

	//Constructor

	public Student(String name,
	 String rollNumber,
	 String favoriteFruit,
	 float height,
	 float weight){
		this.name = name;
		this.rollNumber = rollNumber;
		this.favoriteFruit = favoriteFruit;
		this.height = height;
		this.weight = weight;
	}

	//Setters

    public setName(String name){
    	this.name = name;
    }

    public setRollnumber(String rollNumber){
    	this.rollNumber = rollNumber;
    }

    public setFavouritefruit(String favoriteFruit){
    	this.favoriteFruit = favoriteFruit;
    }

    public setHeight(float height){
    	this.height = height;
    }

    public setWeight(float weight){
    	this.weight = weight;
    }

    //Getters
    
    public getName(){
    	return this.name;
    }

    public getRollnumber(){
    	return this.rollNumber;
    }

    public getFavouritefruit(){
    	return this.favoriteFruit;
    }

    public getHeight(){
    	return this.height;
    }

    public getWeight(){
    	return this.weight;
    }
 
  
}