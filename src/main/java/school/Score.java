package school;

public class Score {
    private int subjectId;
    private int score;

    public Score(int subjectId, int score) {
        this.subjectId = subjectId;
        this.score = score;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getScore() {
        return score;
    }
}
