package BaiTapTapTin;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Random;
import java.util.Scanner;

public class Bai1TapTin {
	private static Scanner sc;
	private static DataInputStream dis;
	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử của mảng:");
		n = sc.nextInt();
		double[] A = new double[n];
		System.out.print("Nhập chuỗi: ");
		sc.nextLine();
		String str = sc.nextLine();
		randomArray(A, n);
		GhiFile_mang(A);
		GhiFile_string(str);
		DocFile_mang();
		DocFile_string();
		
	}
	
	public static void GhiFile_mang(double[] a) throws IOException {
		try {
                    try (FileOutputStream fos = new FileOutputStream("C:\\NetbeansProjects\\baitap\\src\\BaiTapTapTin\\thaotactaptinmang.txt"); 
                        DataOutputStream dos = new DataOutputStream(fos)) {
                        for(int i = 0; i< a.length; i++) {
                            dos.writeDouble(a[i]);
                            dos.flush();
                        }
                    }
			
		} catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block

		}
	}
	public static void DocFile_mang(){
		try {
			FileInputStream fis = new FileInputStream("C:\\NetbeansProjects\\baitap\\src\\BaiTapTapTin\\thaotactaptinmang.txt");
			dis = new DataInputStream(fis);
			double doc ;
			while(true) {
				doc = dis.readDouble();
				System.out.println(doc);
			}
		
		} catch (IOException e) {
			
		}
		
	}
	
	
	
	
	public static void GhiFile_string(String s) {
            FileWriter fw;
		try {
		    fw = new FileWriter("D:\\NetbeansProjects\\baitap\\src\\BaiTapVeTapTin\\thaotactaptinstring.txt");
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(s);
            }
		fw.close();
	    } 
                catch (IOException e) {
                            // TODO Auto-generated catch block
			}	
	}
	public static void DocFile_string() throws IOException {
	    try {
                try (FileReader fr = new FileReader("D:\\java_co_ban_ecl\\src\\BaiTapVeTapTin\\thaotactaptinstring.txt"); 
                    BufferedReader br = new BufferedReader(fr)) {
                    String line = "";
                    while(true) {
                        line = br.readLine();
                        if(line != null) {
                            System.out.println(line);
                    }else
                        break;
                        }
                    }	
		} catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
		}		
	}

	public static void randomArray(double[] a, int n) {
		Random rd = new Random();
		for(int i = 0 ; i<n ; i++) {
			a[i] = rd.nextDouble(100);
		}
	}
	public static void XuatMang(double[] a, int n) {
		for(int i = 0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
	
}

