package main;

import grade.MajorGrade;
import grade.NormalGrade;
import school.School;
import school.Student;
import school.Subject;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {

        School school = School.getInstance();

        ArrayList<Subject> subjects = school.getSubjectList();
        ArrayList<Student> students = school.getStudentList();

        for (int i=0; i<subjects.size(); i++) {
            Subject subject = subjects.get(i);
            System.out.println("---------------------------------");
            System.out.println("      "+ subject.getSubjectName()+" 수강생 학점          ");
            System.out.println("이름    | 학번      | 중점과목  | 점수     ");
            System.out.println("---------------------------------");
            for (Student student : students) {

                int score = student.getScore().get(i).getScore();
                String grade = "";
                String majorSubject = student.getMajorSubject() == 1 ? "국어" : "수학";
                if(student.getMajorSubject() == subject.getSubjectId()){
                    MajorGrade m = new MajorGrade();
                    grade = m.getGrade(score);
                }else if (student.getMajorSubject() != subject.getSubjectId()){
                    NormalGrade n = new NormalGrade();
                    grade = n.getGrade(score);
                }
                System.out.println(student.getName() + " | " + student.getId() + " | " + majorSubject  + " | " + score + ":" + grade);
            }
        }


    }
}
