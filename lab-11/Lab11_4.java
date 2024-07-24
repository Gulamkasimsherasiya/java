import java.io.*;
public class Lab11_4{
	public static void main(String[] args) {
		String filename = "muskan.dat";
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeUTF("khushi");
			dos.writeInt(15);
			dos.writeUTF("Apsin");
			dos.writeInt(12);
			dos.writeUTF("nancy");
			dos.writeInt(13);
			System.out.println("Data written succesfully");
			dos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream(filename));
				while(dis.available()>0){
					String name = dis.readUTF();
					int age = dis.readInt();
					Student st = new Student(name,age);
					System.out.println(st);

				}
				dis.close();

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