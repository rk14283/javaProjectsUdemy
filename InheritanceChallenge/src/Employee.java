public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    //A static field is a place that lets you share data among all your instances
    private static int employeeNo = 1;
//in constructor 2 fields by employee and 2 by worker class
    //I did not make this constructor
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        //this would build employeeID
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}