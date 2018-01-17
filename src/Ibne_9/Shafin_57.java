package Ibne_9;
//import java.io.*;

class Student1{
	private int id;
	
	private String name;
	
	public Student1() {
		
	}
	 public void setdata( int id){
		this.id=id;
		
	}
	  public int getid() {
		return  id;
	}
	 public void setdata (String name){
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
	
}

public class Shafin_57 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 m=new Student1();
		 m.setdata("Adira");
		 System.out.println(m.getname());
		 m.setdata(701);
       System.out.println(m.getid());

	}

}
