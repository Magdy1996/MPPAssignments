package prob2A;

public class Student {
    private String name = null ;
    private GradeReport gradeReport  = null;

    public Student(String name) {
        this.name = name;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }
}
