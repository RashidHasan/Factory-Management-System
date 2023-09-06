public abstract class Employee {

    private String employeeName;
    private String email;
    private static float salary;
    private int phoneNumber;

    //----------------------------------------------------------------


    public Employee(String employeeName, String email, float salary, int phoneNumber) {
        this.employeeName = employeeName;
        this.email = email;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }
    //----------------------------------------------------------------


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void getEmployeeSalary();

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    //----------------------------------------------------------------
}

