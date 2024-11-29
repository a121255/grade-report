package school;


import java.util.ArrayList;
import java.util.Arrays;

public class School {

    private School(){}

    private static School school;

    public static School getInstance(){
        if(school == null){
            school = new School();
        }
        return school;
    }

    private ArrayList<Subject> subjects = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();



    public ArrayList<Subject> getSubjectList(){
        Subject s1 = new Subject(1,"국어");
        Subject s2 = new Subject(2,"수학");
        this.subjects.add(s1);
        this.subjects.add(s2);
        return this.subjects;
    }

    public ArrayList<Student> getStudentList(){
        Student stu1 = new Student(211213, "강감찬", "국어국문학과", 1,
                new ArrayList<Score>(Arrays.asList(
                        new Score(1, 95),
                        new Score(2, 56)
                ))
        );
        Student stu2 = new Student(212330, "김유신", "컴퓨터공학과", 2,
                new ArrayList<Score>(Arrays.asList(
                        new Score(1, 95),
                        new Score(2, 98)
                ))
        );
        Student stu3 = new Student(201518, "신사임당", "국어국문학과", 1,
                new ArrayList<Score>(Arrays.asList(
                        new Score(1, 100),
                        new Score(2, 88)
                ))
        );
        Student stu4 = new Student(202360, "이순신", "국어국문학과", 1,
                new ArrayList<Score>(Arrays.asList(
                        new Score(1, 89),
                        new Score(2, 95)
                ))
        );
        Student stu5 = new Student(201290, "홍길동", "컴퓨터공학과", 2,
                new ArrayList<Score>(Arrays.asList(
                        new Score(1, 83),
                        new Score(2, 56)
                ))
        );

        this.students.add(stu1);
        this.students.add(stu2);
        this.students.add(stu3);
        this.students.add(stu4);
        this.students.add(stu5);

        return this.students;
    }
}
