public class Manager extends Employee {

    private String department;
    private int officeNumber;
    private String projectName;

    //----------------------------------------------------------------

    public Manager(String employeeName, String email, float salary, int phoneNumber, String department, int officeNumber, String projectName) {
        super(employeeName, email, salary, phoneNumber);
        this.department = department;
        this.officeNumber = officeNumber;
        this.projectName = projectName;
    }


    //----------------------------------------------------------------


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public void getEmployeeSalary() {

         double calculate = getSalary() * 0.25 ;

        float salaryIncrease = (float) calculate;
        float sumSalary = getSalary() + salaryIncrease;

        System.out.println("The manager salary is " + getSalary() + "jd" + " + 25% "+  "Total " + sumSalary + "jd");

    }

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return super.toString()+ " Manager{" +
                "department='" + department + '\'' +
                ", officeNumber=" + officeNumber +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    //----------------------------------------------------------------

}
