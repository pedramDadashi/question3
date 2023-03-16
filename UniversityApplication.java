package homework07_Q3;

public class UniversityApplication {
    public static void main(String[] args) {
        University university = new University();

        Professor professor1 = new Professor("Fattahi");
        Professor professor2 = new Professor("Movahedi");

        Student student1 = new Student("Dadashi", 4);
        Student student2 = new Student("Ahmadian", 3);
        Student student3 = new Student("Arab", 4);
        Student student4 = new Student("Ebrahimi", 5);
        Student student5 = new Student("Hoseini", 4);
        Student student6 = new Student("Shekarchi", 3);
        Student student7 = new Student("Seifi", 5);

        Student[] math1Student = new Student[5];
        math1Student[0] = student1;
        math1Student[1] = student2;
        math1Student[2] = student3;
        math1Student[3] = student4;
        math1Student[4] = student5;

        double[] math1Score = new double[5];
        math1Score[0] = 11;
        math1Score[1] = 12.5;
        math1Score[2] = 14;
        math1Score[3] = 16.5;
        math1Score[4] = 18;

        Student[] math2Student = new Student[5];
        math2Student[0] = student6;
        math2Student[1] = student2;
        math2Student[2] = student7;
        math2Student[3] = student4;
        math2Student[4] = student1;

        double[] math2Score = new double[5];
        math2Score[0] = 12.5;
        math2Score[1] = 8;
        math2Score[2] = 14.75;
        math2Score[3] = 18;
        math2Score[4] = 13.5;

        Student[] physicsStudent = new Student[5];
        physicsStudent[0] = student6;
        physicsStudent[1] = student2;
        physicsStudent[2] = student1;
        physicsStudent[3] = student4;
        physicsStudent[4] = student5;

        double[] physicsScore = new double[5];
        physicsScore[0] = 12.5;
        physicsScore[1] = 11;
        physicsScore[2] = 14.25;
        physicsScore[3] = 17.25;
        physicsScore[4] = 13.75;


        Course math1 = new Course("math 1", professor1, math1Student, math1Score);
        Course math2 = new Course("math2", professor1, math2Student, math2Score);
        Course physics = new Course("physics", professor2, physicsStudent, physicsScore);

        Course[] courses = new Course[3];
        courses[0] = math1;
        courses[1] = math2;
        courses[2] = physics;

        university.setCourses(courses);

        // math1.show();
        //math2.show();
        //university.findProfessor("Fattahi");
        university.findStudent("Dadashi");

    }
}
