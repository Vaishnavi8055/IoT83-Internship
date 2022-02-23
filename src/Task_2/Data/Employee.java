package Task_2.Data;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 4:59 PM
 * IoT83 Internship
 */

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private String city;
    private int deptId;

    public Employee(int empId, String firstName, String lastName, int age, int salary, String city, int deptId) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.deptId = deptId;
    }

    public Employee() {

    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
