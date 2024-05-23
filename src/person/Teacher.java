package person;

import person.Person;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name,String address){
        super(name,address);

    }

    int getNumOfCourses(){
        return courses.size();
    }

    boolean addCourse(String course){
        if (course==null)
            return false;
        if (courses.contains(course))
            return false;
        courses.add(course);
        return true;
    }

    boolean removeCourse(String course){
        if (course==null)
            return false;

       if(!courses.contains(course))
           return false;

       courses.remove(course);
        return true;
    }


    @Override
    public String toString() {
        return "person.Teacher: "+super.toString();
    }
}
