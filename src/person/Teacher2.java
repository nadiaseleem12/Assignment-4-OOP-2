package person;

import java.util.ArrayList;

public class Teacher2 extends Person {

   private ArrayList<String> courses;

    public Teacher2(String name, String address, ArrayList<String> courses) {
        super(name, address);
        if (courses == null)
            this.courses = new ArrayList<>();
        else
            this.courses = courses;
    }

    public boolean addCourse(String course) {
        if (course == null)
            throw new IllegalArgumentException("invalid input! course is null");

        if (courses.contains(course))
            return false;

        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        if (course == null)
            throw new IllegalArgumentException("invalid input! course is null");

        return courses.remove(course);
    }

    @Override
    public String toString() {
        return "Teacher: "+super.toString();
    }
}
