
public class Course implements Comparable<Course>{

	
	    private boolean isGraduateCourse;
	    private	int courseNum;
	    private	String courseDept;
		private int numCredits;
		
		
		
		public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
			
			this.isGraduateCourse = isGraduateCourse;
			this.courseNum = courseNum;
			this.courseDept = courseDept;
			this.numCredits = numCredits;
			
			}
		
		public int getCourseNum(){
			
			return this.courseNum;
			
		}
		
		public String getCourseDept() {
			
			
		return this.courseDept;
				
		}
		
		public int getNumCredits() {
			
		return this.numCredits;	
		
			
		}
		
		
		public String getCourseName() {
			
			return (this.isGraduateCourse ? "G" : "U") + courseDept + courseNum;
			
			
		}
		
		//methods
		
		public boolean isGraduateCourse() {
			
			return this.isGraduateCourse ? true : false ;
			
		}
		
		
		
		public boolean equals(Object o) {
			
			
			
			if(o instanceof Course) {
				
				Course temp = (Course) o;
				if(temp.isGraduateCourse == this.isGraduateCourse && temp.courseNum == this.courseNum && temp.courseDept.equals(this.courseDept) && temp.numCredits == this.numCredits) {
					return true;
				}
			
			}
			return false;
				
				
				
		}
		
		public String toString()  {
			
			
			String level = isGraduateCourse ? "Graduate" : "Undergraduate";
			return String.format("Course: %3s-%3d | Number of Credits: %02d | " + level, courseDept, courseNum, numCredits, isGraduateCourse);
			
		
			
		}
		
		public int compareTo(Course c) {
			
			
			if (this.courseNum > c.courseNum) {
				return 1;
			}else if (this.courseNum < c.courseNum) {
				return -1;
			}
			return 0;
			
		}
}
		
		
		
	


