// https://youtu.be/0uhwvdAI0-s
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver_SchoolDB {
	public static void main(String[] args) {
			
		File readFile = new File("SchoolDB_Initial.txt");	
		Scanner inStream = null;

		try{
			inStream = new Scanner ((readFile));
			while(inStream.hasNextLine()){
				System.out.println(inStream.nextLine());//display line on console
			}
		}
		catch(FileNotFoundException e){
			System.err.println("Could not read from file " + readFile);
		
		}
		finally	{
			if(inStream !=null)	{
				inStream.close();
		  }
		
			
			Course course = new Course(true,771,"MAT",4);
			Faculty faculty1 = new Faculty();
			Faculty faculty2 = new Faculty(true);
			Faculty faculty3 = new Faculty("MAT", false);
			Faculty faculty4 = new Faculty("Superman", 1938, "PHY", true);
			
			Student student1 = new Student();
			Student student2 = new Student(false);
			Student student3 = new Student("Math", false);
			Student student4 = new Student("Wonderwoman", 1941, "JST", true);
			
			GeneralStaff general1 = new GeneralStaff();
			GeneralStaff general2 = new GeneralStaff("advise students");
			GeneralStaff general3 = new GeneralStaff("Sanitation","clean");
			GeneralStaff general4 = new GeneralStaff("Flash Gordon", 1934, "Security","safety");
			
			Course course1 = new Course(true,777,"CMP", 4);
			Course course2 = new Course(true,711,"CMP", 4);
			Course course3 = new Course(true,723,"MAT", 4);
			Course course4 = new Course(false,168,"CMP", 4);
			Course course5 = new Course(false,338,"CMP", 4);
			
		
			System.out.println();
			System.out.println("**************************************************************");
			System.out.println("SCHOOL DATABASE INFO:");
			System.out.println();
			System.out.print("");
			System.out.println("************************************************");
			System.out.println("COURSES:");
			System.out.println(course.toString());
			System.out.println(course1.toString());
			System.out.println(course2.toString());
			System.out.println(course3.toString());
			System.out.println(course4.toString());
			System.out.println(course5.toString());
			
			System.out.println("************************************************");
			System.out.println("************************************************");
			
			System.out.println("PERSONS:");
			System.out.println("************************************************");
			System.out.println("************************************************");
			
			System.out.println("EMPLOYEES:");
			System.out.println("************************************************");
			System.out.println("************************************************");
			
			System.out.println("GENERAL STAFF:");
			System.out.println(general1.toString());
			System.out.println(general2.toString());
			System.out.println(general3.toString());
			System.out.println(general4.toString());
			
			System.out.println("************************************************");
			System.out.println("************************************************");
			System.out.println("FACULTY:");
			System.out.println(faculty1.toString());
			System.out.println(faculty2.toString());
			System.out.println(faculty3.toString());
			System.out.println(faculty4.toString());
			
			System.out.println("************************************************");
			System.out.println("************************************************");
			System.out.println("STUDENTS:");
			System.out.println(student1.toString());
			System.out.println(student2.toString());
			System.out.println(student3.toString());
			System.out.println(student4.toString());
			System.out.println("************************************************");
			System.out.println("**************************************************************");
			System.out.println();
			
		
		
			}}
			}		