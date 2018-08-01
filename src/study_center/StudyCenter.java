package study_center;

import study_center.persons.Student;
import study_center.reports.LongReports;
import study_center.reports.Report;
import study_center.reports.ShortReports;

public class StudyCenter{
    public static void main(String[]args){
        Student ivan = new Student("Ivan", "Ivanov");
        Course java = new Course("Java", "40");
        Course js = new Course("JavaScript", "25");
        Program program = new Program("08/05/2018 10:00", "Programming");
        Course courses [] = new Course[] {java,js};
        program.addCoursesToProgram(courses);
        ivan.setStudentProgram(program);
        program.calculateProgramEndDate();
        System.out.println("--------------Short Report-------------");
        Report shortReport = new ShortReports();
        shortReport.showReportForStudent(ivan);
        System.out.println("--------------Long Report--------------");
        Report longReport = new LongReports();
        longReport.showReportForStudent(ivan);

    }
}
