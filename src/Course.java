import java.util.ArrayList;
import java.util.List;

/**
 * I couldn't think of a better docu for this:
 * A class for courses
 */
public class Course
{
	/* Here goes some attributes */
	
	// Do not judge me for not building up a docu for these four members
	private int id;
	private String name;
	private int maxStudents;
	private List<Student> students = new ArrayList<Student>();

	/* BEGIN Some getters, some setters
	 * some constructors */
	
	/**
	 * A rare, empty, useless constructor
	 * It does nothing. 
	 */
	public Course()
	{
		
	}
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the maxStudents
	 */
	public int getMaxStudents()
	{
		return maxStudents;
	}
	/**
	 * @param maxStudents the maxStudents to set
	 */
	public void setMaxStudents(int maxStudents)
	{
		this.maxStudents = maxStudents;
	}
	
	/**
	 * @return the students
	 */
	public List<Student> getStudents()
	{
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students)
	{
		this.students = students;
	}

	/* END Some getters, some setters
	 * some constructors */
	
	
	/* BEGIN Methods b) required */
	
	/**
	 * Adds a given student to the course, in case there is a free place for him
	 * 
	 * @param student Student to add
	 */
	public void addStudent(Student student)
	{
		/* When writing code, I prefer to place abort-conditions ahead the code that fulfills the purpose of the method
		 * This will allow the reader to faster identify the "function" of the code and see, when this piece isn't allowed
		 * to be executed */
		
		//if # of already assigned students is bigger or equal, we cannot add a student anymore
		if(this.students.size() >= this.getMaxStudents())
		{
			//at this moment, I would throw an exception, unfortunatly, we haven't learned that
			//so let's just say 'No' on the console
			System.out.println("No");
			//Yes, this is obviously not a good error-handling
			//probably wouldn't count as error-handling anyway
			//still, my intentions are clear... I guess
			return;
		}
		
		/* I admit, I wasn't sure, what to check against - either the student or just the id of the student
		 * That's why i included both cases to throw our exception */
		//if student is already in the course, he ain't going to be added here again
		if(this.students.contains(student) || this.containsId(student.getId()))
		{
			//here comes our professional error-handling once more:
			System.out.println("No");
			return;
		}
		
		//Otherwise, we can simply add
		this.students.add(student);
	}

	/**
	 * Removes a given student to the course
	 * 
	 * @param student Student to remove
	 */
	public void removeStudent(Student student)
	{
		//if the student ain't visiting the course, how should we remove him?
		if(!(this.students.contains(student)))
		{
			//Let's throw our imaginary exception again:
			System.out.println("No");
			return;
		}
		
		//so, if we came here, we supposed to remove that little    student
		this.students.remove(student);
	}
	
	/**
	 * Returns the current amount of students in this course
	 * 
	 * @return read above
	 */
	public int getStudentAmount()
	{
		return this.students.size();
	}
	
	/**
	 * Guess what this does
	 */
	public void printStudents()
	{
		int index = 0;
		for (Student student: this.students)
		{
			System.out.println(
					String.format("%d: %s - %d - %s %s", index++, this.name,
							student.getId(), student.getFirstName(), student.getLastName()));
		}
	}

	/* END Methods b) required */
	
	
	
	/* BEGIN Helping Methods for d) */
	
	/**
	 * This method will check, whether a student with a given studentsId is already
	 * added into the list.
	 * 
	 * @param studentList
	 * @param StudentId
	 * @return true, if the student is in the list
	 */
	public boolean containsId(long studentId)
	{
		for(Student student : this.students)
		{
			if(student.getId() == studentId)
				return true;
		}
		return false;
	}
	
	/* END Helping Methods for d) */
}
