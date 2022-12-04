
public class Student implements Comparable<Student> {
	String studentName;
	Integer studentID;
	Integer studentGrade;
	String studentCourse;

	public Student(String studentName, Integer studentID, Integer studentGrade, String studentCourse) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentGrade = studentGrade;
		this.studentCourse = studentCourse;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public Integer getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(Integer studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public int compareTo(Student that) {
		if (this.studentGrade.compareTo(that.studentGrade) == 0) {
			return this.studentName.compareTo(that.studentName);

		} else {
			return that.studentGrade.compareTo(this.studentGrade);
		}

	}

}
