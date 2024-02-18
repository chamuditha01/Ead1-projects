class School {

    private String name;
    private String town;

    public School(String name, String town) {
        this.name = name;
        this.town = town;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}

 class Student extends School {

    private String studentName;


    public Student(String studentName, String schoolName, String schoolTown) {
        super(schoolName, schoolTown);
        this.studentName = studentName;
    }

    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

public class Main {

    public static void main(String[] args) {

        
        School school = new School("mahinda", "galle");
        System.out.println("School Name: " + school.getName());
        System.out.println("School Town: " + school.getTown());

        Student student = new Student("chamuditha", "mahinda", "galle");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("School Name: " + student.getName()); 
        System.out.println("School Town: " + student.getTown()); 
    }
}
