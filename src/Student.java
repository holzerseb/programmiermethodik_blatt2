/**
 * This is a class for students
 */
public class Student
{
	/* Here we go with the Members, but please forgive me to not add any documentation to them
	 * That's one of the rare opportunities to say 'My code is self-explanatory :)  */
	private long id;
	private String firstname;
	private String lastname;
	
	/**
	 * @param studentId Die Id,
	 * @param firstname Der Vorname
	 * @param lastname Der Nachname
	 */
	public Student(int studentId, String firstname, String lastname)
	{
		this.id = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	/**
	 * @return the id of the student
	 */
	public long getId()
	{
		return this.id;
	}
	
	/**
	 * @return the id of the student
	 */
	public String getFirstName()
	{
		return this.firstname;
	}
	
	/**
	 * @return the id of the student
	 */
	public String getLastName()
	{
		return this.lastname;
	}
}
