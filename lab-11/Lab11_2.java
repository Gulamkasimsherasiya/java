import java.io.*;
public class Lab11_2{
	public static void main(String[] args) {
		String path = args[0];
		File f_d = new File(path);
		if(f_d .isFile()){
			System.out.println("file size:"+f_d .length() +"bytes");
		}
		else if (f_d .idDirectory()){
			System.out.println("listing file in directory:"+f_d .getAbsolute() +"bytes");
			File f[] = f_d .listFiles();
			if(f!=null){
				for(File file:f){
					if(file.isFile()){
						System.out.println(file.getName());
					}
				}
			}
			else{
				System.out.println("no file found in this directory");
			}
		}
		else{
			System.out.println("not valid file or directory");
		}
	}
}