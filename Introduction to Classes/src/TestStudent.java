import com.gabr.corejava.Student;

public class TestStudent {

        public static void main(String[] args) {

                var students = new Student[5];

                students[0] = new Student("Pavel", 18, 7.8F);
                students[1] = new Student("Vlad", 18, 8.8F);
                students[2] = new Student("Vlad", 18, 7.9F);
                students[3] = new Student("Kirill", 17, 8.2F);
                students[4] = new Student("Pasha", 17, 7.5F);

                for (int i = 0; i < students.length; i++)
                        System.out.printf("Student %d: %s, %d years, GPA %f\n",
                                i+1, students[i].getName(), students[i].getAge(), students[i].getGPA());

        }

}
