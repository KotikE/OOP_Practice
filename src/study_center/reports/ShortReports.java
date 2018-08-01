package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReports implements Report{
    SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss");
    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("STUDENT:" + currentStudent.getName() + " " + currentStudent.getSurName()+ "\n");
        shortInfo.append("STUDENTS PROGRAM:" + program.getProgramName() + "\n");
        if(program.getProgramName()!=null) {
            shortInfo.append("START:" + format.format(programStartDate) + "\n");
            shortInfo.append("PROGRAM DURATION:" + program.countProgramDuration() + "hours" + "\n");
            shortInfo.append(program.showProgramProgress(programStartDate, programStopDate));
        }else {
            shortInfo.append("No assigned courses for this students \n");
        }
        System.out.println(shortInfo.toString());
    }
}
