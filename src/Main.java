import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();

        String id = "abc123";
        System.out.println("enter SPID: ");
        String idd = sc.nextLine();

        System.out.println("enter password: ");
        String pass = sc.nextLine();

        System.out.println("enter age: ");
        int age = sc.nextInt();

        if(pass.equals("Sneha@2006") && idd.equals(id)) {
            System.out.println("***");
            System.out.println("LOGIN SUCESSFUL");
            System.out.println("***");
            System.out.println("enter sub 1: ");
            double s1 = sc.nextInt();

            System.out.println("enter sub 2: ");
            double s2 = sc.nextInt();

            System.out.println("enter sub 3: ");
            double s3 = sc.nextInt();

            double sum = s1 + s2 + s3;
            double per = (sum / 150) * 100;
            System.out.println("-------------------------------");
            System.out.println("Name: " + name);
            System.out.println("age: " + age);
            System.out.println(age > 18);// answer in true or false
            System.out.println("sub 1: " + s1);
            System.out.println("sub 2: " + s2);
            System.out.println("sub 3: " + s3);
            System.out.println("-------------------------------");
            System.out.println("*total 50 mark per paper*");
            System.out.println("total: " + sum);
            System.out.println("percentage: " + per);
            if (per > 40) {
                System.out.println("status: pass");
            } else {
                System.out.println("status: fail");
            }
        }else{
            System.out.println("LOGIN FAIL!! WRONG PASSWORD");
        }

    }
}