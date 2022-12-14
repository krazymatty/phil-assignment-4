import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	public Student[] readStudentsFromFile(String masterFile) {
		Integer studentID;
		String studentName;
		String studentCourse;
		Integer studentGrade;

		String[] studentArray = null;
		Student[] studentArr = null;
		Student student = null;
		int i = 0;
		String line = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(masterFile));
			reader.readLine(); // ignores 1st row of headers in script
			studentArr = new Student[100];
			while ((line = reader.readLine()) != null) {
				studentArray = line.split(",");
				studentID = Integer.parseInt(studentArray[0]);
				studentName = studentArray[1];
				studentCourse = studentArray[2];
				studentGrade = Integer.parseInt(studentArray[3]);
				student = new Student(studentName, studentID, studentGrade, studentCourse);
				studentArr[i] = student;
				i++;

			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentArr;
	}

	public void writeStudentToFile(Student[] studentArr, String fileName) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("Student ID, Student Name, Couse, Grade\n");
			for (Student s : studentArr) {
				if (s != null) {
					writer.write(s.getStudentID() + "," + s.getStudentName() + "," + s.getStudentCourse() + ","
							+ s.getStudentGrade() + "\n");
				}

			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
