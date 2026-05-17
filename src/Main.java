import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();

        System.out.println("enter age: ");
        int age = sc.nextInt();

        System.out.println("enter sub 1: ");
        int s1 = sc.nextInt();

        System.out.println("enter sub 2: ");
        int s2 = sc.nextInt();

        int sum = s1 + s2;
        int per = sum / 2;
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println(age > 18);// answer in true or false
        System.out.println("sub 1: "+s1);
        System.out.println("sub 2: " +s2);
        System.out.println("total: "+sum);
        System.out.println("persentage: "+per);

    }
}