/*"1. Create a class called Student with the following instance variables:
    - name (String)
    - age (int)
    - gpa (double)
2. Implement the Student class with appropriate constructors and getter and setter methods.
3. Create a class called StudentTest with a main method.
4. In the main method, create a List of Student objects and add a few Student objects to the list.
5. Iterate over the list and print out the name, age, and GPA of each student.
6. Use the Collections.sort method to sort the list by GPA (highest to lowest).
7. Iterate over the sorted list and print out the name and GPA of each student."*/

import java.util.*;

class Student {
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    String setter1() {

        return this.name;

    }

    int setter2() {
        return this.age;

    }

    double setter3() {

        return this.gpa;

    }
}

class studentTest {
    public static void main(String args[]) {
        List<Student> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Student name : ");
            String name = sc1.nextLine();
            System.out.println("Enter the age of the student : ");
            int age = sc2.nextInt();
            System.out.println("Enter the GPA oif the student : ");
            double gpa = sc3.nextDouble();
            Student obj = new Student(name, age, gpa);
            arrayList.add(obj);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).gpa > arrayList.get(j).gpa) {
                    Student s = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, s);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Student Name : " + arrayList.get(i).name + "\t Age : " + arrayList.get(i).age
                    + "\t GPA : " + arrayList.get(i).gpa);
        }
    }
}
