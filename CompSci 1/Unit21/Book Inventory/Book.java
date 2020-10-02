package Unit21;
public class Book {
    String studentName, bookNumber;
    
    Book(String num, String name) {
        studentName = name;
        bookNumber = num;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getBookNumber() {
        return bookNumber;
    }
    
    
}
