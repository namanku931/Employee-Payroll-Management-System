package EmployeePayroll;

public class PrmanentEmployee extends Employee
implements PayrollOperation{
    double bonus;

    public PrmanentEmployee(int employeeId, String employeeName, String department, double basicSalary,double bonus) {
        super( employeeId,  employeeName, department, basicSalary);
        this.bonus = bonus;
    }
    void displayBonus(){
        System.out.println(bonus);
    }
    @Override
    public double calculateSalary(){

       double result = getBasicSalary()+bonus;
       return result;

    }

    @Override
    public String getEmployeeType() {
        return "PermanentEmployee";
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
