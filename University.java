package homework07_Q3;

public class University {
    private Course[] courses;

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void findProfessor(String name) {
        boolean find = false;
        System.out.println("Professor name: "+name);
        for (int i = 0; i < courses.length; i++) {
            if (name.equals(courses[i].getProfessor().getName())) {
                find = true;
                System.out.println("course name: " + courses[i].getName());
                System.out.println("course students name: ");
                for (int j = 0; j < courses[i].getStudents().length; j++) {
                    System.out.println(courses[i].getStudents()[j].getName());
                }
                System.out.println("**********");
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }

    public void findStudent(String name) {
        boolean find = false;
        System.out.println("Student name: " + name);
        for (int i = 0; i < courses.length; i++) {
            for (int j = 0; j < courses[i].getStudents().length; j++) {
                if (name.equals(courses[i].getStudents()[j].getName())) {
                    find = true;
                    System.out.println("course name: " + courses[i].getName());
                    System.out.println("course professor name: " + courses[i].getProfessor().getName());
                    System.out.println("course score: " + courses[i].getScore()[j]);
                    System.out.println("**********");
                }
            }
        }
        if (!find) {
            System.out.println("Not found!");
        }
    }
}
