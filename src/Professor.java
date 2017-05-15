/**
* Class for Professors
*/
public class Professor
{
	/* Members and Properties */
	
	/**
	* This is the firstName of this professor
	*/
	private String firstName;
	/**
	* This is the surname of this professor
	*/
	private String surname;
	/**
	* This is the salary per year of this professor
	*/
	private float salary; 
	
	
	/**
     * {@link Professor#firstName}
     */
    public String getFirstName()
	{
        return this.firstName;
    }
	
	/**
     * {@link Professor#firstName}
	 *
	 * @param firstName the first name of the Professor to set
     */
    public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
     * {@link Professor#surname}
     */
    public String getSurname()
	{
        return this.surname;
    }
	
	/**
     * {@link Professor#surname}
	 *
	 * @param surname the first name of the Professor to set
     */
    public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	/**
     * {@link Professor#salary}
     */
    public float getSalary()
	{
        return this.salary;
    }
	
	/**
     * {@link Professor#salary}
	 *
	 * @param salary the salary per year of this professor
     */
    public void setSalary(float salary)
	{
		this.salary = salary;
	} 
	
	
	/* Constructor */
	
	/**
	* Creates a nameless professor, without a salary
	* Poor lad :(
	*
	* @return returns a professor instance
	*/
	public Professor()
	{
		//stuff
	}
	
	/**
	* Creates a professor with the given params
	* 
	* @param surname yes, guess what
	* @param firstName okay, I admit, this is harder to guess
	* @param salary, how much this guy is earning a year
	* @return returns a professor instance
	*/
	public Professor(String surname, String firstName, float salary)
	{
		//stuff, but with params
	}
	
	
	/* Methods */
	
	/**
	* Prints the name of this professor
	*
	* @return Nothing, but it does print something somewhere
	*/
	public void printName()
	{		
		//check if we know the name of the professor
		if(this.firstName == null || this.surname == null ||
			this.firstName.isEmpty() || this.surname.isEmpty())
		{
			//We haven't learned exception throwing yet, so let's just output something and return :'(
			System.out.println("Error: This Professor is nameless, I'm sorry :(");
			return;
		}
		
		System.out.println(String.format("", this.firstName, this.surname));
	}
	
	/**
	* Calculates the salary for a given month
	* 
	* @param month enter a number for the month (Jan = 1, Feb = 2, ...)
	* @return returns the salary for the given month (hopefully)
	*/
	public float calculateSalary(int month)
	{
		float calculatedSalary = this.salary / 14.0f;
		
		switch(month)
		{
			case 3:
			case 6:
			case 9:
			case 12:
				//what a lucky boy (or girl) this professor is
				calculatedSalary *= 1.5;
				break;
			default:
				//I have no idea whether java accepts switch case without the default,
				//so better be safe and just put it here.
				break;
		}
		
		return calculatedSalary;
	}
}

