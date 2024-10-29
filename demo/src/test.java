import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a/b: ");
        String c = sc.nextLine();
        c.trim();
        if("a".equalsIgnoreCase(c)){
            System.out.print("a");
        }
        if ("b".equalsIgnoreCase(c)){
            System.out.print("b");
        }
        sc.close();
    }
}
