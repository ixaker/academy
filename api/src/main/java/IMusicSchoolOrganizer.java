import java.util.List;


public interface IMusicSchoolOrganizer {
    void addNewStudent(IStudent student, ISchoolClass schoolClass);
    void deleteStudentFromClass(IStudent student, ISchoolClass schoolClass);
    List<IStudent> getAllStudents();
    List<IStudent> getStudentsFromClass(ISchoolClass schoolClass);
}
