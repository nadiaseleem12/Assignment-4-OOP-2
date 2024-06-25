package person;

import java.util.ArrayList;

public class Student2 extends Person {

//    private ArrayList<String> courses= new ArrayList<>();
//    private ArrayList<Integer> grades= new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public Student2(String name, String address){
        super(name,address);
    }


    int getNumOfCourses(){
        return courses.size();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }


    public void addCourseGrade(Course course) {
        if (course == null)
            return;

       for (Course registeredCourse:courses)
           if (registeredCourse.getName().equals(course.getName())) {
               registeredCourse.setGrade(course.getGrade());
               return;
           }

       courses.add(course);
    }

   public void printGrades(){
       for (int i=0;i<courses.size();i++)
           System.out.println("course "+courses.get(i)+": "+courses.get(i).getGrade());
    }

    double getAverageGrade(){
        if (courses.size()==0)
            return 0;
       int sum=0;
        for (Course course:courses)
            sum+=course.getGrade();

          return  (double) sum/courses.size();

    }


}
