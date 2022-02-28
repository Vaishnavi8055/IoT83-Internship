package Task_3.Data;/*
 * Created by Vaishnavi Chaurasia
 * 25-Feb-22
 * 11:44 PM
 * IoT83 Internship
 */

import Task_3.Data.Department;

import javax.persistence.*;

@Entity
@Table(name = "employee" , schema = "organisation")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int empId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private int salary;

    @Column(nullable = false)
    private String city;

    /*@Column(nullable = false , insertable = false , updatable = false)
    private int deptId;*/


    /**
     * name is deptId, as it is the foreign Key in Employee table
     */
    @ManyToOne
    @JoinColumn(name="deptId" , nullable = false)
    private Department department;



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

//    public int getDeptId() {
//        return deptId;
//    }
//
//    public void setDeptId(int deptId) {
//        this.deptId = deptId;
//    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
