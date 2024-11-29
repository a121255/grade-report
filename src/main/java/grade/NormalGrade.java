package grade;

public class NormalGrade implements BaseGrade {
    @Override
    public String getGrade(int score) {
        String grade = "";
        if(score >= 90 && score <= 100){
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 55 && score <= 69) {
            grade = "D";
        } else if (score < 55) {
            grade = "F";
        }
        return grade;
    }
}
