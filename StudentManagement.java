/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapTapTin;

/**
 *
 * @author Administrator
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class StudentManagement  {
	private static ObjectInputStream ois;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student[] S = new Student[5];
		S[0]= new Student("913769182", "Nguyen Van A", "nam", 2002, "28392393829", 7.65);
		S[1]= new Student("915219482", "Nguyen Van B", "nu", 2002, "28391233829", 7.45);
		S[2]= new Student("913769182", "Nguyen Van C", "nam", 2002, "28395325529", 7.25);
		S[3]= new Student("913769182", "Nguyen Van D", "nu", 2002, "28392376729", 7.15);
		S[4]= new Student("913769182", "Nguyen Van E", "nam", 2002, "28391236529", 7.05);
		
		Arrays.sort(S);
		GhiFile_ob(S,5);
		DocFile_ob();				
	}
	
	public static void GhiFile_ob(Student[] s, int n) throws IOException {
	    try {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\src\\BaiTapVeTapTin\\StudentList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		    for (Student student : s) {
			oos.writeObject(student);
			}			
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        
	public static void DocFile_ob() throws ClassNotFoundException {
	    try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\src\\BaiTapVeTapTin\\StudentList.txt");
		    ois = new ObjectInputStream(fis);
	            while (fis.available()>0) {
			Student student = (Student) ois.readObject();
			System.out.println(student);				
			}		
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

