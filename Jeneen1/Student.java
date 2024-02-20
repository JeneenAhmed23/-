public class Student {
    private String name;
    private int id;
    private  int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
            Student stu [] =new Student[2];
            stu[0]= new Student("Ahmed",708,23);
            stu[1]= new Student("Ali",486,23);
            for (int i = 0; i < stu.length ; i++) {
                System.out.println(stu[i]);
            }

    }
}
