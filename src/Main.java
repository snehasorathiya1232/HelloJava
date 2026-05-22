import java.util.Scanner;
public class Main {

    public static void enterMark(Scanner sc,double[] subject){
        for(int i=0;i<subject.length;i++) {
            System.out.println("enter sub"+(i+1)+" mark: ");
            subject[i] = sc.nextDouble();
        }
    }

    public static double sumMark(double[] subject){
        double sum=0;
        for(int i=0;i<subject.length;i++) {
            sum = subject[i]+sum;
        }
        System.out.println(sum);
        return sum;
    }

    public static double per(double sum,double[] subject){
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

    public static void printt(double[] subject,double sum,double per){
        System.out.println("-------------------------------");
        for(int i=0;i<subject.length;i++) {
            System.out.println("Subject "+(i+1)+" mark : "+subject[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("*total 50 mark per paper*");
        System.out.println("total: " + sum);
        System.out.println("percentage: " + per);
    }
    // ////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String TName;
        String id = "abc123";
        String idd;
        String pass;
        double[] subject=new double[4];
        double sum;
        double per;

        System.out.println("enter teacher name: ");
        TName = sc.nextLine();

        System.out.println("enter Teacher ID: ");
        idd = sc.nextLine();

        System.out.println("enter password: ");
        pass = sc.nextLine();


        if(pass.equals("Sneha@2006") && idd.equals(id)) {
            System.out.println("\n");
            System.out.println("LOGIN SUCCESSFUL");
            System.out.println("\n");

            enterMark(sc,subject);
            sum = sumMark(subject);


            per=per(sum,subject);

            printt(subject,sum,per);

            grade(per);

        }else{
            System.out.println("LOGIN FAIL!! SOMETHING WRONG");
        }
        sc.close();
    }
}