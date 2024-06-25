package person;

import java.util.ArrayList;
import java.util.Arrays;

public class Student1 extends Person{
    private ArrayList<String> courses= new ArrayList<>();
    private ArrayList<Integer> grades= new ArrayList<>();
    public Student1(String name,String address){
        super(name, address);
    }

    int getNumOfCourses(){
        return courses.size();
    }

    public ArrayList<String> getCourses() {
        return courses;
    }


    public void addCourseGrade(String course, int grade){
        if (course==null)
            throw new IllegalArgumentException("invalid input! course is null");

        if (courses.contains(course)){
            int index = courses.indexOf(course);
            grades.set(index,grade);
            return;
        }

        courses.add(course);
        grades.add(grade);
    }

    public void printGrades(){
        for (int i=0;i<courses.size();i++)
            System.out.println("course "+courses.get(i)+": "+grades.get(i));
    }

    public double getAverageGrade(){
        if (grades.size()==0)
            return 0;
        int sum=0;
        for (int grade:grades)
            sum+=grade;

        return  (double) sum/grades.size();
    }

    @Override
    public String toString() {
        return "Student: "+super.toString();
    }
}
