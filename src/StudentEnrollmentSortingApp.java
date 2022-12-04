import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentEnrollmentSortingApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String[] courseNames = new String[3];
		courseNames[0] = "COMPSCI";
		courseNames[1] = "APMTH";
		courseNames[2] = "STAT";
		String masterFile = "student-master-list.csv";
		String fileType = ".csv";
		Integer fileLength = 100;
		String fileHeaders = "Student ID,Student Name,Course,Grade";

		new SplitStudentService(courseNames, masterFile, fileType, fileLength, fileHeaders);
		
		System.out.println("Completed: Master file sorted and saved into new .csv files.");
		/*
		 * String line = null; String[] courseNames = new String[3]; courseNames[0] =
		 * "COMPSCI"; courseNames[1] = "APMTH"; courseNames[2] = "STAT";
		 * 
		 * for (String course : courseNames) { BufferedReader reader = new
		 * BufferedReader(new FileReader("student-master-list.csv")); {
		 * 
		 * BufferedWriter writer = new BufferedWriter(new FileWriter(course + ".csv"));
		 * writer.write("Student ID,Student Name,Course,Grade\n"); String[] studentArray
		 * = null; Student[] studentArr = new Student[100]; int i = 0;
		 * reader.readLine(); while ((line = reader.readLine()) != null) { studentArray
		 * = line.split(","); Integer studentID = Integer.parseInt(studentArray[0]);
		 * String studentName = studentArray[1]; String studentCourse = studentArray[2];
		 * Integer studentGrade = Integer.parseInt(studentArray[3]); Student student =
		 * new Student(studentName, studentID, studentGrade, studentCourse);
		 * studentArr[i] = student; i++;
		 * 
		 * if (studentArray[2].contains(course)) { writer.write(line + "\n"); }
		 * 
		 * 
		 * } // System.out.println(studentArr[100].getStudentName());
		 * Arrays.sort(studentArr);
		 * 
		 * for (Student s : studentArr) { if (s.getStudentCourse().contains(course)) {
		 * writer.write(s.getStudentID() + "," + s.getStudentName() + "," +
		 * s.getStudentCourse() + "," + s.getStudentGrade() + "\n"); }
		 * 
		 * }
		 * 
		 * writer.close(); } reader.close();
		 */

	}

}
