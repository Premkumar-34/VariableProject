public class InstanceDemo {
    int empId = 2345;
    String empName = "Prem Kumar";
    double empSal = 70000.56;
    String department = "Developer";

    public static void main(String[] args) {
        InstanceDemo obj = new InstanceDemo();
        System.out.println("Employee Details");
        System.out.println("Employee Id : " + obj.empId);
        System.out.println("Employee Department : " + obj.department);
        System.out.println("Employee Name : " + obj.empName);
        System.out.println("Employee Salary : " + obj.empSal);
    }
}
