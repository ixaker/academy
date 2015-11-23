import java.util.List;


public interface IMusicSchoolOrganizer {
    void addNewStudent(IStudent student, ISchoolClass schoolClass);
    void deleteStudentFromClass(IStudent student, ISchoolClass schoolClass);
    List getAllStudents();
    List getStudentsFromClass(ISchoolClass schoolClass);
}
