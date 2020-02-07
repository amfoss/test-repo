
public class Student{

	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;

	public Student(){
		name=null;
		rollNumber=null;
		favoriteFruit=null;
		height = 0;
		weight = 0;
	}

	public Student(String name,
		String rollNumber,
		String favoriteFruit,
		float height,
		float weight){
		this.name=name;
		this.rollNumber=rollNumber;
		this.favoriteFruit=favoriteFruit;
		this.height=height;
		this.weight=weight;
	}

	public void setStudent(String name,
		String rollNumber,
		String favoriteFruit,
		float height,
		float weight){
		this.name=name;
		this.rollNumber=rollNumber;
		this.favoriteFruit=favoriteFruit;
		this.height=height;
		this.weight=weight;
	}

	public String getName(){
		return name;
	}
	public String getRollNumber(){
		return rollNumber;
	}
	public String getFavoriteFruit(){
		return favoriteFruit;
	}
	public float getHeight(){
		return height;
	}
	public float getWeight(){
		return weight;
	}



}