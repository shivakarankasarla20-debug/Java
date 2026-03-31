class Student {
    private int age;

    void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    int getAge() {
        return age;
    }
}

public class encaps {
    public static void main(String args[]) {
        Student s = new Student();
        s.setAge(21);
        System.out.println(s.getAge());
    }
}