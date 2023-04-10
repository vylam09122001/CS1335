/* 
 * The following program is a user-defined Studrnt class that uses setter methods 
to set the name and age instance variables ,
getter methods to get the name and age instance variables
and a method to define the schooling level of each student
 * have the user try to solve a set of multiplying problems
 * By Vy Lam - 10.02.2022
 * JDK 18.0.2.1
 */
package studentcreator;

public class Student {
    private String name = null;
    private int age = 0;
    
    public Student(String name, int age) 
	{
		setName(name);
		setAge(age);
	}

	public String getName()
	{
		return name;
	}

	public final void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
        }

	public final void setAge(int age) 
	{
		if(age <= 0){
			this.age = 0;
		} else{
			this.age = age;
		}
	}
        
        public String getSchoolingLevel()
	{
		if(age == 5){
			return "Kindergarten";
		}else if(age >= 6 && age <= 10){
			return "Elementary School";
		}else if(age >= 11 && age <= 13){
			return "Intermediate School";
		}else if(age >= 14 && age <= 17){
			return "High School";
		}else{
			return "College";
		}
        }
}
