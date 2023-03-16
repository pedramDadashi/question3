package homework07_Q3;

public class Course {
    private String name;
    private Professor professor;
    private Student[] students;

    private double[] score;


    public Course(String name,Professor professor,Student[] students, double[] score) {
        this.name = name;
        this.professor = professor;
        this.students = students;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public double[] getScore() {
        return score;
    }

    public void show(){
        System.out.println("---------------------");
        System.out.println("Course Name: "+getName());
        System.out.println("Professor Name: "+professor.getName());
        System.out.println("Students : ");
        for(int i=0;i< students.length;i++){
            System.out.println("Name: "+students[i].getName()+" ,Score: "+score[i]);
        }
    }
}
