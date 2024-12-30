import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;

public class Assignment1 {
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file (e.g. C:\\Users\\CAMT-STD\\Downloads\\class_roaster67.csv) ");
        System.out.print("enter: ");
        String file = scanner.nextLine();
        File f = new File(file);

        if (!f.exists()) {
            System.out.println("File not found: " + file);
            return;
        }

        Scanner inputf = new Scanner(f);

        for (int j = 0; j < 7; j++) {
            if (inputf.hasNextLine()) inputf.nextLine();
        }

        // Vector to store student data
        Vector<StudentList> students = new Vector<StudentList>();
        while (inputf.hasNextLine()) {
            String dataLine = inputf.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
            stu.nextToken(); // Skip student number
            StudentList s = new StudentList(stu.nextToken(), stu.nextToken(), stu.nextToken());
            students.addElement(s);
        }

        String option;
        do {
            System.out.println();
            System.out.println("Please enter an option for sorting \nn: Student ID \nf: First Name \nl: Last Name \ns: Search by First Name \nx: Exit ");
            System.out.print("enter: ");
            option = scanner.nextLine();

            switch (option) {
                case "n":
                    sortID(students);
                    break;
                case "f":
                    sortFirstname(students);
                    break;
                case "l":
                    sortLastname(students);
                    break;
                case "s":
                    System.out.print("enter the first name to search for: ");
                    String searchName = scanner.nextLine();
                    searchByFirstName(students, searchName);
                    break;
                case "x":
                    System.out.println("Stopping the program.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            if (!option.equals("x") && !option.equals("s") && !option.equals("default")) {
                for (StudentList student : students) {
                    System.out.println(student);
                }
            }

        } while (!option.equals("x"));
    }

    public static void sortID(Vector<StudentList> students) {
        students.sort(Comparator.comparing(StudentList::getStudentID));
    }

    public static void sortFirstname(Vector<StudentList> students) {
        students.sort(Comparator.comparing(StudentList::getFname));
        for (StudentList student : students) {
            System.out.println(student);
        }
    }

    public static void sortLastname(Vector<StudentList> students) {
        Collections.sort(students, (s1, s2) -> s1.getLname().compareTo(s2.getLname()));
        for (StudentList student : students) {
           System.out.println(student.getStudentID()+" " +student.getFname() + " "+student.getLname() );
        }
    }

    public static void searchByFirstName(Vector<StudentList> students, String firstName) {
        boolean found = false;
        firstName = firstName.trim();
 
        for (int i = 0; i < students.size(); i++) {
            StudentList student = students.get(i);  // Get the student at index i
            String studentFirstName = student.getFname().trim();
            
            if (studentFirstName.equalsIgnoreCase(firstName)) {
                // Print
                System.out.println(student);
                System.out.println("Found in index " + i);
                found = true;
            }
        }
    
        if (!found) {
            System.out.println("No student found with the first name: " + firstName);
        }
    }
}

