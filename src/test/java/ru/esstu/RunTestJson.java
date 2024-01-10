package ru.esstu;

public class RunTestJson extends StudentListTest{
    @Override
    protected StudentList createStudentList() {
        return new StudentListJSON("file_json");
    }
}
