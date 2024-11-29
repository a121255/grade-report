package school;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String major;
    private int majorSubject;
    private ArrayList<Score> score;

    public Student(int id, String name, String major, int majorSubject, ArrayList<Score> score) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.majorSubject = majorSubject;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getMajorSubject() {
        return majorSubject;
    }

    public ArrayList<Score> getScore() {
        return score;
    }
}
