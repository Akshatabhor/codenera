package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
   private String name;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "(" + "name='" + name + '\'' + ", grade=" + grade + ')';
    }

    public Student() {
    }
}
public class GroupStudents
{
    public static void main(String[] args) {
        List<Student >ls=new ArrayList<>();
        ls.add(new Student("Akshata",'A'));
        ls.add(new Student("Komal",'B'));
        ls.add(new Student("Trupti",'C'));
        ls.add(new Student("ashwini",'B'));
        ls.add(new Student("Nisha",'A'));
        ls.add(new Student("Kajal",'A'));
        ls.add(new Student("Pranali",'C'));
        Map<Character,List<Student>>map=groupStudentsByGrade(ls);
        for(Map.Entry<Character,List<Student>>e:map.entrySet()){
            System.out.println("Grade: "+e.getKey()+": list of Students : "+e.getValue());
        }
    }
    public static Map<Character, List<Student>> groupStudentsByGrade(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }

}
