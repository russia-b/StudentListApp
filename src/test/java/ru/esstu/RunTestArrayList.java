package ru.esstu;

public class RunTestArrayList extends StudentListTest {
    @Override
    protected StudentList createStudentList() {
        return new StudentListArrayList();
    }
}
