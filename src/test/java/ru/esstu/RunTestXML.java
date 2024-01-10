package ru.esstu;

public class RunTestXML extends StudentListTest{
    @Override
    protected StudentList createStudentList() {
        return new StudentListXML("XML");
    }
}
