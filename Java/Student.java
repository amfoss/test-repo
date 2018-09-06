public class Student{
	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;


	public String getName(){
		return this.name;
	}
	public String getRollNumber(){
		return this.rollNumber;
	}
	public String getFavoriteFruit(){
		return this.favoriteFruit;
	}
	public float getHeight(){
		return this.height;
	}
	public float getWeight(){
		return this.weight;
	}

	public void setName(String name){
		this.name = name;
	} 
	public void setRollNumber(String rollNumber){
		this.rollNumber = rollNumber;
	}
	public void setFavoriteFruit(String fruit){
		this.favoriteFruit = fruit;
	}
	public void setHeight(float h){
		this.height= h;
	}
	public void setWeight(float w){
		this.weight =w;
	}

	public Student(){
		this.name =null;
		this.rollNumber=null;
		this.favoriteFruit=null;
		this.height=0;
		this.weight=0;
	}

	public Student(String n, String r, String ff, float h, float w){
		this.name =n;
		this.rollNumber=r;
		this.favoriteFruit=ff;
		this.height=h;
		this.weight=w;
	}


}