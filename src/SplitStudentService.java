import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SplitStudentService {
	String[] splitBy;
	String masterFile;
	String fileType;
	Integer fileLength;
	String fileHeaders;

	private Integer studentID;
	private String studentName;
	private String studentCourse;
	private Integer studentGrade;

	public SplitStudentService(String[] splitBy, String masterFile, String fileType, Integer fileLength,
			String fileHeaders) throws IOException {
		super();
		this.splitBy = splitBy;
		this.masterFile = masterFile;
		this.fileType = fileType;
		this.fileLength = fileLength;
		this.fileHeaders = fileHeaders;

		String line = null;
		for (String course : splitBy) {
			BufferedReader reader = new BufferedReader(new FileReader(masterFile));
			{
				BufferedWriter writer = new BufferedWriter(new FileWriter(course.toLowerCase() + fileType));
				if (fileHeaders != null) {
					writer.write(fileHeaders + "\n");
				}
				String[] studentArray = null;
				Student[] studentArr = new Student[fileLength];
				Student student = null;
				int i = 0;
				reader.readLine(); // ignores 1st row of headers in script
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
				Arrays.sort(studentArr);

				for (Student s : studentArr) {
					if (s.getStudentCourse().contains(course)) {
						writer.write(s.getStudentID() + "," + s.getStudentName() + "," + s.getStudentCourse() + ","
								+ s.getStudentGrade() + "\n");
					}

				}

				writer.close();
			}
			reader.close();

		}

	}

}
