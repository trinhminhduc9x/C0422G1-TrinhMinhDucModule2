package Demo.Ss6;

public class Test {
    public static void main(String[] args) {

        Student student = new Student(1, "chanh", "DN", true, "C04");
        System.out.println(student.toString());
        student.goToBy();
        // gọi method ko tham số
        student.study();
        // gọi method có tham số
        student.study("Toán");

        // khai báo
        Person person1 = new Person();
        Student student1 = new Student();
        person1 = student1;
        // cách 2
        Person person2 = new Student();
        // Person kiểu dữ liệu khai báo
        // person2 biến tham chiếu
        // new Student() đối tượng (kiểu Student) => kiểu thực tế
        System.out.println(person2 instanceof Person); // true
        System.out.println(person2 instanceof Student);// true
        person2.goToBy();// hiện tại gọi của person=> khi chạy gọi lớp con Student
        // Luư ý có ép kiểu ngầm định thì mới ép kiểu tưởng minh
        Student student3 = (Student) person2; // ép kiểu tưởng minh
        student3.study();
        //cách 2
        ((Student) person2).study();
        // ko ép được vì chưa ép ngầm định
        Person person = new Person();
        Student student2 = (Student) person;
//        Student[0]=new Student();
        // sử dụng kiểu cha để có thể lưu được các dữ liệu kiểu con
        Person[] people = new Person[3];
        people[0] = new Person();
        people[1] = new Student();
        people[2] = new Instructor();
        for (Person p : people) {
            System.out.println(p.toString());
            //kiểm tra kiểu dự liệu khi ép
            if (p instanceof Student){
                ((Student)p).study();
            }else if(p instanceof  Instructor)
            { ((Instructor)p).teach( "toans");
            }
        }

    }
}
