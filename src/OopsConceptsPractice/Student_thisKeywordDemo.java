package OopsConceptsPractice;

class Student_thisKeywordDemo {
	int rollno;
	String name, course;
	static float fee;
	private Address_thisDemo address;

	// Parametrised constructor
	Student_thisKeywordDemo(int rollno, String name, String course ,Address_thisDemo address) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.address=address;
		
	}
	public void setAddress(Address_thisDemo address) {
		this.address = address;
	}

	// use of this in constructor chaining or calling
	Student_thisKeywordDemo(int rollno, String name, String course, float fee ,Address_thisDemo address) {
		this(rollno, name, course,address);
		Student_thisKeywordDemo.fee = fee;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getFee() {
		return fee;
	}

	static public void setFee(float fee) {
		Student_thisKeywordDemo.fee = fee;
	}

	public Address_thisDemo getAddress() {
		return address;
	}

	// passing object of class as argument in method
	void enterStudentDetails(Student_thisKeywordDemo s1) {
		s1.rollno = rollno;
		s1.name = name;
		s1.course = course;
	}

	// this use as argument to call method who except argument as class type
	void getStudentDetials() {
		enterStudentDetails(this);// this is used as argument , object type argument
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
    Student_thisKeywordDemo returnAll() {
    	return this;
    }
}