package jarfilesusage;

public class Salary {
/* rajes created on 7/13/2019 
inside the package - jarfilesusage */
private String name;
private float salary;

    public Salary(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
