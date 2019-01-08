package лаб1;

import java.util.Scanner;

public class task11 {

        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            String $ID;
            $ID = s.nextLine();


            System.out.printf("SELECT first_name, last_name, group\n");
            System.out.printf("FROM students WHERE student_id = '%s'", $ID);}
}
