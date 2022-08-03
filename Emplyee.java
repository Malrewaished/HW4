public class Emplyee {
    private String firstName;
    private String lastName;
    private int id;
    private int salary;

    public Emplyee(String firstName, String lastName, int id, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        int annualSalary = salary * 12;

        return annualSalary;

    }


}
