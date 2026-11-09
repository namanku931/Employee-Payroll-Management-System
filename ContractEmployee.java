package EmployeePayroll;

public class ContractEmployee extends Employee implements PayrollOperation{
    int workingDay;
    int perDaySalary;

    public ContractEmployee(int employeeId, String employeeName, String department, double basicSalary,int workingDay, int perDaySalary) {
        super( employeeId,  employeeName,  department,  basicSalary);
        this.workingDay = workingDay;
        this.perDaySalary = perDaySalary;
    }
    @Override
    public double calculateSalary(){
        double salary = workingDay*perDaySalary;
        return salary;
    }

    @Override
    public String getEmployeeType() {
        return "Contract Employee";
    }

    @Override
    public void generateSlip() {
        System.out.println("Employee Tyepe: "+getEmployeeType());
        System.out.println("EmployeeId: "+getEmployeeId());
        System.out.println("EmployeeName: "+getEmployeeName());
        System.out.println("EmployeeDepartment: "+getDepartment());
        System.out.println("EmployeeSalary: "+calculateSalary());
    }
}
