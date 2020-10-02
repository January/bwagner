package Unit20;

public class AssignmentManager {
    
    
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        System.out.println("\nType: " + assignment.getType()
        + "\nName: " + assignment.getName() 
        + "\nScore: " + assignment.getScore()
        + "\nLettergrade: " + assignment.getLetterGrade(assignment.getScore()) + "\n\n");
        
        assignment = new Assignment("Test", "Chapter 1 Test", 95);
        System.out.println("\nType: " + assignment.getType()
        + "\nName: " + assignment.getName() 
        + "\nScore: " + assignment.getScore()
        + "\nLettergrade: " + assignment.getLetterGrade(assignment.getScore()) + "\n");
        
        assignment = new Assignment("Quiz", "Chapter 1 Quiz", 83);
        System.out.println("\nType: " + assignment.getType()
        + "\nName: " + assignment.getName() 
        + "\nScore: " + assignment.getScore()
        + "\nLettergrade: " + assignment.getLetterGrade(assignment.getScore()) + "\n");
        
        assignment = new Assignment("Test", "Chapter 1 Test", 75);
        System.out.println("\nType: " + assignment.getType()
        + "\nName: " + assignment.getName() 
        + "\nScore: " + assignment.getScore()
        + "\nLettergrade: " + assignment.getLetterGrade(assignment.getScore()) + "\n");
        
        assignment.setName("Chapter 1 Quiz");
        assignment.setScore(30);
        assignment.setType("Quiz");
        
        System.out.println("\nType: " + assignment.getType()
        + "\nName: " + assignment.getName() 
        + "\nScore: " + assignment.getScore()
        + "\nLettergrade: " + assignment.getLetterGrade(assignment.getScore()) + "\n");
        
        
    }
    
}
