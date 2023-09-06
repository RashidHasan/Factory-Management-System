public class Worker extends Employee {

    private String position;
    private String shift;
    private boolean workerTeamLeader; // Flag

    //----------------------------------------------------------------

    public Worker(String employeeName, String email, float salary, int phoneNumber, String position, String shift, boolean workerTeamLeader) {
        super(employeeName, email, salary, phoneNumber);
        this.position = position;
        this.shift = shift;
        this.workerTeamLeader = workerTeamLeader;
    }


    //----------------------------------------------------------------


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public boolean isWorkerTeamLeader() {
        return workerTeamLeader;
    }

    public void setWorkerTeamLeader(boolean workerTeamLeader) {
        this.workerTeamLeader = workerTeamLeader;
    }

    @Override
    public void getEmployeeSalary() {

        double calculate = getSalary() * 0.05 ;

        float salaryIncrease = (float) calculate;
        float sumSalary = getSalary() + salaryIncrease;

        System.out.println("The worker salary is " + getSalary() + "jd" + " + 5% "+  "Total " + sumSalary + "jd");


    }

    //----------------------------------------------------------------


    @Override
    public String toString() {
        return super.toString() + " Worker{" +
                "position='" + position + '\'' +
                ", shift='" + shift + '\'' +
                ", workerTeamLeader=" + workerTeamLeader +
                '}';
    }

    //----------------------------------------------------------------
}
