
public class Person {
	
	private String name;
	private int birthYear;
	
		
		public Person(String name, int birthYear) {
			this.name = name;
			this.birthYear = birthYear;
		}
		
		public Person() {
			this("", 0);
		}
		
		
		public String getName() {
			return name;
			
			}
		

		
		public int getBirthYear() {
			
			return this.birthYear;
			
		}
		
		public void setName(String name) {
			
			this.name = name;
			
		}

		public void setBirthYear(int birthYear) {
			
			this.birthYear = birthYear;
			
			
		}
		
	public boolean equals(Object o) {
		
		
if(o instanceof Person) {
	
	Person p = (Person) o;
	
if(p.name.equals(this.name) && this.birthYear == p.birthYear) {
	
	return true;
}
	
	
}
		return false;
		
		
		
	}
		
		public String toString() {  
			
			return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);

		}
		
		public int compareTo(Person p) {
			
			if(this.birthYear > p.birthYear) {
				return 1;
			}else if (this.birthYear < p.birthYear) {
				return -1;
			
		}
		return 0;
		
		
		
}


}
