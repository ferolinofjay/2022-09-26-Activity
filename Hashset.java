import java.util.*;

public class Hashset {
    static Scanner input = new Scanner(System.in);
    static HashSet<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) throws InterruptedException{
        select();
    }

    public static void select() throws InterruptedException {
        while (true) {
            System.out.println("""
                    ===================
                    ===== HashSet =====
                    ===================
                    1. ADD NUMBER
                    2. REMOVE NUMBER
                    3. DISPLAY NUMBER
                    4. CLEAR NUMBERS
                    5. EXIT
                    """);
            String choice = input.nextLine();
            Thread.sleep(1000);
            switch (choice) {
                case "1":
                    System.out.println("=================================");
                    System.out.println("=== Add a number to the set:  ===");
                    System.out.println("=================================");
                    add(input.nextInt());
                    Thread.sleep(1000);
                    break;
                case "2":
                    System.out.println("========================================");
                    System.out.println("=== Remove the number from the set:  ===");
                    System.out.println("========================================");
                    remove(input.nextInt());
                    Thread.sleep(1000);
                    break;
                case "3":
                    display();
                    Thread.sleep(1000);
                    break;
                case "4":
                    clear();
                    Thread.sleep(1000);
                    break;
                case "5":
                    System.exit(0);
                    break;
                
                
                
            }
        }
    }

  
    public static void add(int num) throws InterruptedException{
        if(set.contains(num)){
            System.out.println("====================================");
            System.out.println("=== Number is already in the set ===");
            System.out.println("====================================");
            Thread.sleep(1000);
        } else{
            set.add(num);
            Thread.sleep(1000);
            System.out.println("======================================");
            System.out.println("=== You added " + num + " to the set. ===");
            System.out.println("======================================");
        }
        
        
    }

    public static void remove(int num) throws InterruptedException {
        set.remove(num);
        Thread.sleep(1000);
        System.out.println("==========================================");
        System.out.println("=== You removed " + num + " from the set. ===");
        System.out.println("==========================================");
    }

    public static void display()throws InterruptedException {
        System.out.println(set);
    }

    public static void clear() throws InterruptedException{
        set.clear();
        Thread.sleep(1000);
        System.out.println("=================================");
        System.out.println("=== The set has been cleared. ===");
        System.out.println("=================================");
    }
}