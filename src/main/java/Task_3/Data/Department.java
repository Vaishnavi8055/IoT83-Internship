package Task_3.Data;/*
 * Created by Vaishnavi Chaurasia
 * 25-Feb-22
 * 11:44 PM
 * IoT83 Internship
 */

// PARENT CLASS

import Task_3.Data.Employee;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department" , schema = "organisation")
public class Department {

    @Id
    @Column(name = "deptId")
    private int deptId;

    @Column(nullable = false)
    private String deptName;

    @Column(nullable = false)
    private String deptCity;

    /**
     * The mappedBy property is use to tell Hibernate which
     * variable we are using to represent the
     * parent class(department) in our child class(employee).
     */

    //mappedBy parameter to indicate that the given column is owned by another entity:
    @OneToMany(mappedBy = "department")
    @Fetch(value = FetchMode.SELECT)
    private Set<Employee> employees;


    public Department() {

    }

    public Department(int deptId, String deptName, String deptCity, Set<Employee> employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptCity = deptCity;
        this.employees = employees;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCity() {
        return deptCity;
    }

    public void setDeptCity(String deptCity) {
        this.deptCity = deptCity;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {

        return this.deptId +" | "+this.deptName +" | "+this.deptCity;
    }
}
