import java.util.Scanner;
public class Main {

    public static double enterMark1(Scanner sc){
        System.out.println("enter sub 1: ");
        return sc.nextDouble();
    }

    public static double enterMark2(Scanner sc){
        System.out.println("enter sub 2: ");
        return sc.nextDouble();
    }

    public static double enterMark3(Scanner sc){
        System.out.println("enter sub 3: ");
        return sc.nextDouble();

    }

    public static double sumMark(double a,double b,double c){
        return a + b + c;
    }

    public static double per(double sum){
        return (sum / 150) * 100;
    }

    public static void grade(double per){
        if (per >= 80) {
            System.out.println("Grade: A");
        }
        else if (per >= 60) {
            System.out.println("Grade: B");
        }
        else if (per >= 40) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: F");
        }
    }

    public static void printt(String name,int age,double s1,double s2,double s3,double sum,double per){
        System.out.println("-------------------------------");
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("sub 1: " + s1);
        System.out.println("sub 2: " + s2);
        System.out.println("sub 3: " + s3);
        System.out.println("-------------------------------");
        System.out.println("*total 50 mark per paper*");
        System.out.println("total: " + sum);
        System.out.println("percentage: " + per);
    }

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
            System.out.println("/n");
            System.out.println("LOGIN SUCCESSFUL");
            System.out.println("/n");

            double s1 = enterMark1(sc);
            double s2 = enterMark2(sc);
            double s3 = enterMark3(sc);

            double sum= sumMark(s1,s2,s3);

            double per=per(sum);

            printt(name,age,s1,s2,s3,sum,per);

            grade(per);

        }else{
            System.out.println("LOGIN FAIL!! SOMETHING WRONG");
        }
        sc.close();
    }
}