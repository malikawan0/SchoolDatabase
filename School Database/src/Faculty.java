
public class Faculty extends Employee implements Comparable<Person>{

	private Course coursesTaught[];
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty () {
		
		super();
		this.coursesTaught = new Course [100];
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}
		
	public Faculty(boolean isTenured) {
		
		this();
		this.isTenured = isTenured;
		
		
	}
		
	public Faculty(String deptName, boolean isTenured) {
		
		super(deptName);
		this.coursesTaught = new Course [100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
				
	}
		
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		
		super(name, birthYear, deptName);
		this.coursesTaught = new Course [100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
			
	}
	
	public boolean isTenured() {
		
		return isTenured;
		
		
	}
	
	public int getNumCoursesTaught() {
		
		
		return numCoursesTaught;
				
	}
	public void setIsTenured(boolean isTenured) {
		
		this.isTenured = isTenured;
			
	
	}
	
	public void addCourseTaught(Course course) {
		
		for(int i = 0; i < coursesTaught.length; i++) {
			
			if(coursesTaught[i] == null) {
				coursesTaught[i] = course;
				numCoursesTaught++;
				return;
			}
			
			
			
			
		}
		
	}
	
	public void addCoursesTaught(Course[] course) {
		
		for(int i = 0; i < course.length; i++) {
			
			addCourseTaught(course[i]);
			
			
		}
		
		
		
		
	}
	
	public Course getCourseTaught(int index) {
		
		if(index >= coursesTaught.length || index < 0 || coursesTaught[index] == null) {
			
			return  null;
			
			
		}
		return coursesTaught[index];
		
		
	}
	
	public String getCourseTaughtAsString(int index) {
		
		if(getCourseTaught(index) == null) {
			
			return "";
			
			
		}
		String courseDept = coursesTaught[index].getCourseDept();
		
		int courseNum = coursesTaught[index].getCourseNum();
		
		return courseDept + "-" + courseNum;
		
	}
	
	public String getAllCoursesTaughtAsString() {
		
		String temp = "";
		for(int i = 0; i < coursesTaught.length; i++) {
			if(!getCourseTaughtAsString(i).equals("")) {
				if(!getCourseTaughtAsString(i + 1).equals("")) {	
				
				temp += getCourseTaughtAsString(i) + ","; 
				
			} else {
				temp += getCourseTaughtAsString(i);
			}
			
			
		}
			
	}
	return temp;
	
	
	
	}
	public boolean equals(Object o) {
		
		if(o instanceof Faculty) {
			
			Faculty temp = (Faculty) o;
			if(super.equals(temp)) {
				if(temp.numCoursesTaught == this.numCoursesTaught && temp.isTenured == this.isTenured) {
					return true;
				}
			}
			
		}
		
		return false;
		
		
		
	}
	
	public String getIsTenured(){
		String tenure = "";
		if(isTenured)
		tenure = "Is Tenured";
		else
		tenure = "Not Tenured";
		return tenure;
		}

		public String toString() {
		return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", getIsTenured(), getNumCoursesTaught(), getAllCoursesTaughtAsString());
		}

	
	

	public int compareTo(Faculty p) {
		
		if(this.numCoursesTaught > p.numCoursesTaught) {
			
			return 1;
			
		}
		else if (this.numCoursesTaught < p.numCoursesTaught) {
			return -1;
		}
		return 0;
		
	}
	
	
	
	
	
	
	}
	

