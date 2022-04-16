/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package BaiTapTapTin;

/**
 *
 * @author Admin
 */
import java.io.Serializable;

/**
 * @author ADMIN
 *
 */
public class Student extends Person implements Serializable{
	
	String maSinhVien;
	double gpa;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String soCCCD, String hoTen, String gioiTinh, int namSinh, String maSinhVien, double gpa) {
		super(soCCCD, hoTen, gioiTinh, namSinh);
		this.maSinhVien = maSinhVien;
		this.gpa = gpa;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int) (getGpa() - o.getGpa());
	}

	@Override
	public String toString() {
		return "Student [maSinhVien=" + maSinhVien + ", gpa=" + gpa + ", soCCCD=" + soCCCD + ", hoTen=" + hoTen
				+ ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + "]";
	}
	
}
