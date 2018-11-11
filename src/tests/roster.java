package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class roster {
ArrayList<StudendList> students = new ArrayList<>();
ArrayList<display5> Student2 = new ArrayList<>(); 
String h;
	public static void main(String[] agrs) throws IOException {
		roster StudentId = new roster();
		StudentId.writeTofile("C:\\Users\\catboot\\Desktop\\Csco1301\\Midterm test 2 pp2\\src\\Testfile");
		StudentId.displayTop3();
	}
	public void writeTofile(String FileName) throws IOException {
		List<String> StudentRead = Files.readAllLines(Paths.get(FileName));
		while(!StudentRead.isEmpty()) {
		String Students = StudentRead.remove(0);
		createStudent(Students);	
		}
		}
	public void createStudent(String Students) {
		Scanner ListStudented = new Scanner(Students);
		String Name = ListStudented.next();
		int FirstNum = ListStudented.nextInt();
		int SecondNum = ListStudented.nextInt();
		int ThirdNum = ListStudented.nextInt();
		StudendList StudentsListArra = new StudendList(Name, FirstNum, SecondNum, ThirdNum);
		StudentsListArra.CalAvg();
		Student2.add(new display5(Name, StudentsListArra.CalAvg));
		students.add(StudentsListArra);
	}
	public void displayTop3() {
		Collections.sort(Student2, new Comparator<display5>() {

			@Override
			public int compare(display5 o1, display5 o2) {
				if(o2.CalAvg >o1.CalAvg) {
					return 1;
				}
				else if(o2.CalAvg< o1.CalAvg) {
					return -1;
				}
				return 0;
			}
			
		});
		System.out.println("Top 3 Students");
		for(int WinningList = 0; WinningList < 3;WinningList++) {
		System.out.println(WinningList+1 +"." + Student2.get(WinningList).Name + " "+ Student2.get(WinningList).CalAvg);
		}
	}
	}
