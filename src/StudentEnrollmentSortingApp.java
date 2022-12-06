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

	}

}
