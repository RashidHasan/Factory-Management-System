import java.util.List;

public class Accountant extends Employee {

    private String level;

    private List<String> responsibilities;

    //----------------------------------------------------------------

    public Accountant(String employeeName, String email, float salary, int phoneNumber) {
        super(employeeName, email, salary, phoneNumber);
    }

    //----------------------------------------------------------------


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

    @Override
    public void getEmployeeSalary() {

        double calculate = getSalary() * 0.1 ;

        float salaryIncrease = (float) calculate;
        float sumSalary = getSalary() + salaryIncrease;

        System.out.println("The accountant  salary is " + getSalary() + "jd" + " + 10% "+  "Total " + sumSalary + "jd");


    }

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return super.toString() + " Accountant{" +
                "level='" + level + '\'' +
                ", responsibilities=" + responsibilities +
                '}';
    }

    //----------------------------------------------------------------

}
