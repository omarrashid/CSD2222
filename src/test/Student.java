package test;

public class Student {
	private String name;
	private int age;
	private String module;
	
	public Student (String name, int age, String module){
		this.name = name;
		this.age = age;
		this.module = module;
		
		
	}
	
	public void printStudent(){
		System.out.println("the name of the Student is"+name +"the age of the student is"+age +"the module the student is doing is"+module);
	}
	
	

}
