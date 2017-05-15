/**
 * The Main-Stuff
 */
public class MainClass
{
	
	public static void main(String[] args)
	{
		//Create two students
		System.out.println("[INFO] Creating Students...");
		Student studentOne = new Student(12345, "Krea", "Tive");
		Student studentTwo = new Student(12346, "Nam", "Ensgebung"); //kreativer geht nimmer :)
		
		//Initialize the course
		System.out.println("[INFO] Setting up Course 'Programmiermethodik' with maximum 3 students...");
		Course mainCourse = new Course();
		mainCourse.setName("Programmiermethodik");
		mainCourse.setMaxStudents(3);

		//check how many students are in the course
		System.out.println("[CHECK] Verify that course is empty:");
		checkStudentsAmount(mainCourse);
		
		//add our students
		System.out.println("[INFO] Adding a student to the course...");
		mainCourse.addStudent(studentOne);
		System.out.println("[INFO] Adding a student to the course...");
		mainCourse.addStudent(studentTwo);
		
		//and check again
		System.out.println("[CHECK] Verify that course contains two students:");
		checkStudentsAmount(mainCourse);
		
		//print this courses students
		System.out.println("[IFNO] Printing the students of the course...");
		mainCourse.printStudents();
		
		//delete one of those poor guys
		System.out.println("[INFO] Removing a student from the course...");
		mainCourse.removeStudent(studentOne); //I didn't like 'Krea' anyway
		
		//and print students again to verify Krea isn't here anymore
		System.out.println("[IFNO] Printing the students of the course...");
		System.out.println("[CHECK] Verify that 'Krea' isn't visiting this course anymore:");
		mainCourse.printStudents();
	}
	
	/**
	 * Checks, how many students are in a course and prints the results
	 * 
	 * @param course
	 */
	private static void checkStudentsAmount(Course course)
	{
		/* Note: the name checkStudentsAmount does not imply to print something - but maybe we will change the usage
		 * of this method and won't print something in the future, which makes the name suit better imo */
		System.out.println(String.format("There are %d students in the course '%s'", course.getStudentAmount(), course.getName()));
	}

}
