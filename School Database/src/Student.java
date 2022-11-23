
public class Student extends Person {
	
	
	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken ;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	
	public Student() {
		
		super();
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		this.studentID = numStudents + 1;
		numStudents++;
		this.major = "undeclared";
			
	}
	
	public Student(boolean isGraduate) {
		
		super();
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.studentID = numStudents + 1;
		numStudents++;
		this.major = "undeclared";		
	}
	
	public Student(String major, boolean isGraduate) {
		super();
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.studentID = numStudents + 1;
		numStudents++;
		this.major = major;
		
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		
		super(name, birthYear);
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.studentID = numStudents + 1;
		numStudents++;
		this.major = major;
	}
	
	public boolean isGraduate() {
		
		return isGraduate; 
		
	}
	
	
	public int getNumCoursesTaken() {
		
		return numCoursesTaken;
		
		
	}
	public static int getNumStudents() {
		return numStudents;
			
	}
	
	public int getStudentID() {
		
		return studentID;
		
	}
	
	public String getMajor() {
		
		return this.major;	
	}
	
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
		
		
	}
	
	public void setMajor(String major) {
		
		this.major = major;
			
	}
	
	public void addCourseTaken(Course course) {
		if(numCoursesTaken < coursesTaken.length) {
			coursesTaken[numCoursesTaken] = course;
			numCoursesTaken++;
		}
		
	
		
	}
	
	
	
	public void addCoursesTaken(Course [] course) {
	
	
	
		for(int i = 0; i < course.length; i++) {
			
			addCourseTaken(course[i]);
			}
		}
	
		
	
	
	public Course getCourseTaken(int index) {
		
		
		if(index < 0 || index > numCoursesTaken ) {
			return null;
		}
		if(coursesTaken[index] == null) {
			return null;
		}
		return coursesTaken[index];
			
		}
	
	
		
			
	
	
	
	public String getCourseTakenAsString(int index) {
		

		if(index < 0 || index > numCoursesTaken ) {
			return null;
		}
		if(coursesTaken[index] == null) {
			return null;
		}
		return coursesTaken[index].toString();
			
		}
				
				
		
		
	
	
	
	public String getAllCoursesTakenAsString() {
		String holder = "";
	
	for (int i = 0; i < numCoursesTaken; i++) {
		holder = holder + getCourseTakenAsString(i) + ", ";
		
	}
	return holder;
	
	
	}
	
	public boolean equals(Object o) {
		
		
		Student s = (Student) o;
		
		if (this.getNumCoursesTaken() != s.getNumCoursesTaken()) {
			return false;
			
		}
		if (this.getStudentID() != s.getStudentID()) {
			return false;
		}
		
		if (this.getMajor() != s.getMajor()) {
			return false;
		}
		
		if (this.isGraduate() != s.isGraduate()) {
			
			return false;
		}
		if(this.getBirthYear() != s.getBirthYear()) {
			
			return false;
		}
		
		if(this.getName() != s.getName()) {
			return false;
		}
		
		return true;
		
	}
	
	public String toString() {
		String status = "";
	    if (isGraduate) {
	        status = "Graduate";
	    } 
	    else {
	   status = "Undergraduate";
	    }
	    String output = super.toString() + " ";
	    output = output + String.format(
	            "Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",studentID, getMajor(), status, numCoursesTaken, getAllCoursesTakenAsString());
	    return output;
	    }	     
	
		
	
	
	public int compareTo(Student c) {
		return this.studentID - c.studentID;
	
	
	
	
	
	
	
	}
}
