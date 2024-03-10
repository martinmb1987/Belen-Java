package belenJavaProject;

public class Employee{
    private String position;
    private int salary;

    public Employee(String position,int salary){
        this.position= position;
        this.salary= salary;
    }
    public String getInfo(String a, String b){
        return a + position+ "\n" +b+ salary;
    }




}
