package new_package;

public class Employee 
{
    private String name, designation, salary;
    //above mentioned are the data members of the class Employee
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", designation=").append(designation);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
    
}
