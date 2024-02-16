import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student\n2. Display students\n3. Search student\n4. Update student\n5. Delete student\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter PRN, Name, DoB, Marks: ");
                    String prn = sc.next();
                    String name = sc.next();
                    String dob = sc.next();
                    int marks = sc.nextInt();
                    students.add(new Student(prn, name, dob, marks));
                    break;
                case 2:
                    for (Student s : students) {
                        s.display();
                    }
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = sc.next();
                    for (Student s : students) {
                        if (s.prn.equals(prn)) {
                            s.display();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter PRN to update: ");
                    prn = sc.next();
                    for (Student s : students) {
                        if (s.prn.equals(prn)) {
                            System.out.print("Enter new Name, DoB, Marks: ");
                            s.name = sc.next();
                            s.dob = sc.next();
                            s.marks = sc.nextInt();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter PRN to delete: ");
                    prn = sc.next();
                    students.removeIf(s -> s.prn.equals(prn));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

