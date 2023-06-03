public class Person {
    private String name;
    private String position;
    private String job;
    private int age;
    private int salary;

    public Person(String name, String position, String job, int age, int salary) {
        this.name = name;
        this.position = position;
        this.job = job;
        this.age = age;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
