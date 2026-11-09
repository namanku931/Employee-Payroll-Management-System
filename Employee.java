package EmployeePayroll;

public abstract class Employee implements PayrollOperation{
    private int employeeId;
    private String employeeName;
    private String department;
    private double basicSalary;

    public Employee(int employeeId, String employeeName, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    void displayDetails(){
        System.out.println("EmployeeId "+employeeId);
        System.out.println("EmployeeName "+employeeName);
        System.out.println("Department "+department);
        System.out.println("BaicSalary "+basicSalary);

    }
    @Override
    public abstract double calculateSalary();
    public abstract String getEmployeeType();


    @Override
    public void generateSlip() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: " + calculateSalary());
    }

}
