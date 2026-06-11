//linked list implementation in java
class Student {
    int id;
    String name;
    Student next;

}

class Main {
    
    //Add student to end of linked list and return head

    Student addStudent(Student head, int id, String name) {

        //Make new student and set id and name

        Student newStudent = new Student();

        newStudent.id = id;

        newStudent.name = name;

        //If Head is null, just set head to new student

        if (head == null) {

            head = newStudent;

        } else {

            //set cursor to head
            Student cursor = head;

            //Move cursor through linked list until it reaches the end

            while (cursor.next != null) {

                cursor = cursor.next;

            }

            //add student to end of linked list

            cursor.next = newStudent;

        }

        IO.println("Student added successfully!");

        return head;
    }

    void main() {
        Student head = null;

        int id;

        String name;

        
        while (true) {

            //Check if use wants to add new student or stop adding students

            if(IO.readln("\nAdd New Student (Enter -1 to stop): ").equals("-1")) {
                break;
            }
            
            //Try to read student id fromt user and retry if input is invalid

            while (true) {

                try {

                    id = Integer.parseInt(IO.readln("Enter student ID: "));
                    
                    break;
                } catch (NumberFormatException e) {
                
                    IO.println("Invalid input. Please enter a valid integer.");
                
                }
            }

            //Read student name from user


            name = IO.readln("Enter student name: ");

            //Add student to linked list

            head = addStudent(head, id, name);    
        }

        //Print all students in the linked list
        
        IO.println("\nPrinting List\n");
        while (head != null) {
    
            IO.println("Student id: " + head.id + ", Student name: " + head.name);
            
            head = head.next;

        
        }

    }
}
