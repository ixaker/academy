

public interface IStudent {
    String firstName = null;
    String secondName = null;
    int age = 0;
    ISchoolClass schoolClass = null;

    void setSchoolClass(ISchoolClass schoolClass);
    ISchoolClass getSchoolClass();
}
