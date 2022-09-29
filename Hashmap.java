import java.util.*;
import java.util.Map.Entry;
public class Hashmap {
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int key=0;


    public static void main(String[] args) throws InterruptedException {
        select();
    }

    public static void select() throws InterruptedException {
        while (true) {
            System.out.println("""
                    ===================
                    ===== HashMap =====:
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
                    System.out.println("Add a number to the map: ");
                    add(input.nextInt());
                    Thread.sleep(1000);
                    break;
                case "2":
                    System.out.println("Input number you want to remove from the map: ");
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
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
        if(num==1){
            key++;
                map.put(key,num);
                Thread.sleep(1000);
                System.out.println("You added " + num + " to the map.");
    

        }else{
            if(!flag){
                System.out.println("You cannot add a prime number.");
            } else{
                key++;
                map.put(key,num);
                Thread.sleep(1000);
                System.out.println("You added " + num + " to the map.");
    
            }
        }

        
        
        
        
    }

    public static void remove(int num) throws InterruptedException {
        int key=0;
        for(Entry<Integer, Integer>entry : map.entrySet()){
            if(entry.getValue()==num){
             key = entry.getKey();
            }
        }
        map.remove(key);
        Thread.sleep(1000);
        System.out.println("You removed " + num + " from the map.");
       
    }

    public static void display()throws InterruptedException {
        System.out.println(map);
    }

    public static void clear() throws InterruptedException{
        map.clear();
        Thread.sleep(1000);
        System.out.println("The map has been cleared.");
    }
}