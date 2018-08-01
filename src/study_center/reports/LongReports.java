package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReports implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss");
        @Override
        public void showReportForStudent(Student currentStudent) {
            format.setLenient(false);
            Program program = currentStudent.getStudentProgram();
            Date programStartDate = program.getProgramStartDate();
            Date programStopDate = program.getProgramEndDate();
            StringBuilder longInfo = new StringBuilder();
            longInfo.append("STUDENT:" + currentStudent.getName() + " " + currentStudent.getSurName()+ "\n");
            longInfo.append("STUDENTS PROGRAM:" + program.getProgramName() + "\n");
            if(program.getCourses()!= null) {
                longInfo.append(program.showProgramCourses());
            }else {
                longInfo.append("No assigned courses for this students \n");
            }
            System.out.println(longInfo.toString());
    }
}
