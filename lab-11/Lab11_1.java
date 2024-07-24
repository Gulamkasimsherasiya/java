import java.io.*;

public class Lab11_1{
	public static void main(String[] args) {
		String filename = "muskan.txt";
		try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("nency,11\n");
            bw.write("Apsin,12\n");
            bw.write("khushi,13\n");
            bw.close();
            System.out.println("Data written succesfully");

		}catch(Exception e){
            e.printStackTrace();
		}
	

	try{
        BufferedReader br= new BufferedReader(new FileReader(filename));
        String line;
        while((line = br.readLine())!=null){
        	String name_age[] = line.split(",");
        	String name = name_age[0];
        	int age = Integer.parseInt(name_age[1]);
        	Student st = new Student(name,age);
        	System.out.println(st);
        }
         br.close();

	}catch(Exception e){
		e.printStackTrace();
    } 
  }
}

class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Name : "+name+" , Age : "+age;
	}
}