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

public class StudentCreator {

    public static void main(String[] args) {
        
        Student student1 = new Student("Bobo", 5);
        Student student2 = new Student("Coco", 12);
        Student student3 = new Student("Lucky", 16);
        Student student4 = new Student("Vy Lam", 21);
        
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " +student1.getAge());
        System.out.println("Schooling Level: " + student1.getSchoolingLevel() +"\n");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " +student2.getAge());
        System.out.println("Schooling Level: " + student2.getSchoolingLevel() +"\n");
        System.out.println("Name: " + student3.getName());
        System.out.println("Age: " +student3.getAge());
        System.out.println("Schooling Level: " + student3.getSchoolingLevel() +"\n");
        System.out.println("Name: " + student4.getName());
        System.out.println("Age: " +student4.getAge());
        System.out.println("Schooling Level: " + student4.getSchoolingLevel() +"\n");
    }
    
}
