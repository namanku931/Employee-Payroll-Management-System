package EmployeePayroll;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new PrmanentEmployee(1, "Rahul", "IT", 30000, 5000);

        Employee emp2 = new ContractEmployee(2, "Aman", "HR", 0, 25, 800);


//        emp1.displayDetails();
        emp1.generateSlip();
        //emp2.displayDetails();
        emp2.generateSlip();
    }
}
