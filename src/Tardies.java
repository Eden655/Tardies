import java.util.*;

public class Tardies {
    private Student[] students;
    private int numStudents;

    public Tardies(){
        students = new Student[50];
        numStudents = 0;
    }

    public void enterData(String ln,String fn,int ta) {
        Student a = new Student(ln,fn,ta);
        students[numStudents]= a;
        numStudents = numStudents + 1;

    }

    public int getTotalTardies(){
        int sumT = 0;
        for (int i = 0; i < numStudents; i++){
            sumT = sumT + students[i].getTardies();
        }
        return sumT;
    }

    public void summaryReport(){
        System.out.println("=====================" + "\n" + "Class Summary - Tardy Total = " + getTotalTardies() + "\n"
        + "=====================");
           String a = " ";
        for (int i = 0; i < numStudents; i ++)
            a = a + "\n" + students[i].toString();
            System.out.println(a);
    }

    public static void main(String[] args) {
        Tardies app = new Tardies();
        System.out.println("=====================" + "\n" + " Enter Student Data" + "\n" + "=====================" + "\n" + "Enter last name --->");
        Scanner myWar = new Scanner(System.in);
        String ln1 = myWar.nextLine();
        System.out.println("Enter First Name ---> ");
        myWar = new Scanner(System.in);
        String fn1 = myWar.nextLine();
        System.out.println("Enter number of tardies ---> ");
        myWar = new Scanner(System.in);
        int ta1 = myWar.nextInt();
        app.enterData(ln1,fn1,ta1);
        String yn = " ";
        System.out.println("Enter another student [y/n]?");
        myWar = new Scanner(System.in);
        yn = myWar.nextLine();

        while (yn.equals("y")) {
            System.out.println("Enter Last Name ---> ");
        myWar = new Scanner(System.in);
        String ln = myWar.nextLine();
        System.out.println("Enter First Name ---> ");
        myWar = new Scanner(System.in);
        String fn = myWar.nextLine();
        System.out.println("Enter number of tardies ---> ");
        myWar = new Scanner(System.in);
        int ta = myWar.nextInt();
        app.enterData(ln,fn,ta);
            System.out.println("Enter another student [y/n]?");
            myWar = new Scanner(System.in);
            yn = myWar.nextLine();
        }
        app.getTotalTardies();
        app.summaryReport();

   }
    

}
