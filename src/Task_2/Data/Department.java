package Task_2.Data;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 5:03 PM
 * IoT83 Internship
 */

public class Department {

    private int deptId;
    private String deptName;
    private String deptCity;

    public Department(int deptId, String deptName, String deptCity) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptCity = deptCity;
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
}
