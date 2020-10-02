package Unit20;

public class Assignment {

    String type, name;
    int score;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    Assignment() {
        type = "";
        name = "";
        score = 0;
    }
    Assignment(String t, String n, int s) {
        type = t;
        name = n;
        score = s;
    }
    
    public String getLetterGrade(int s) {
        if (s >= 90) {
            return "A";
        }
        else if (s >= 80 && s < 90) {
            return "B";
        }
        else if (s >= 70 && s < 80) {
            return "C";
        }
        else if (s >= 60 && s < 70) {
            return "D";
        }
        else if (s < 60) {
            return "F";
        }
        else {
            return null;
        }
    
    }
    
}
