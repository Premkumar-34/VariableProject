public class DemoStatic {
    static int empId = 2345;
    static String empName = "Prem Kumar";
    static double empSal = 70000.56;
    static String department = "Developer";

    public static void main(String[] args) {

        System.out.println("Employee Details");
        System.out.println("Employee Id : " + DemoStatic.empId);
        System.out.println("Employee Department : " + DemoStatic.department);
        System.out.println("Employee Name : " + DemoStatic.empName);
        System.out.println("Employee Salary : " +DemoStatic.empSal);
    }
}
