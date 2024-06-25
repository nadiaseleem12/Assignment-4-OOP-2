package person;

public class Teacher1 extends Person{

    private int numOfCourses;
    private String [] courses;
    public Teacher1(String name,String address,String[] courses,int totalCourses){
        super(name,address);
        this.courses = courses;

        if (courses==null){
            totalCourses = totalCourses<0 ? 10 : totalCourses;
            this.courses = new String[totalCourses];
        }else {
            for (String course : courses) {
                if (course != null)
                    numOfCourses++;
            }
        }
    }

    public boolean addCourse(String course){
        if (course==null)
            throw new IllegalArgumentException("invalid input! course is null");

        if (numOfCourses==courses.length){
            return false;
        }

        for (String registeredCourse:courses){
            if (registeredCourse!=null && registeredCourse.equalsIgnoreCase(course))
                return false;
        }

        courses[numOfCourses]=course;
        numOfCourses++;
        return true;
    }

    public boolean removeCourse(String course){
        if (course==null)
            throw new IllegalArgumentException("invalid input! course is null");

        int index = -1;
        for (int i=0;i<courses.length;i++)
            if (courses[i]!=null && courses[i].equalsIgnoreCase(course)){
                index = i;
                break;
            }

        if (index==-1)
            return false;

        for (int i=index;i<courses.length-1;i++){
            courses[i]=courses[i+1];
        }
        courses[courses.length-1]=null;
        numOfCourses--;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

}
