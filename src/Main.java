import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 30; //data type integer
        int myAge = age;
        System.out.println(myAge);

        //primitive types - byte, short, int, long, float, double, char, boolean
        byte ageByte = 25;
        short count = 4567;
        int views = 123_256_789;
        long viewsTotal = 3_123_456_78L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        //reference types - requires allocating memory manually using new keyword
        //references have some inbuilt functions while primitive data types do not.
        Date now = new Date();
        System.out.println(now);

        //primitive vs reference
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // y won't be affected by change in x as both are independent

        Point point1 = new Point(1, 1);
        Point point2 = point1; //store reference to the object. Here both point1 and point2 are referring to same point object
        point1.x = 2;
        System.out.println(point2); //This will reflect the change in value as it store reference

        //string data type - another reference data type in java
        String name = "John" + "Dutch";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        //strings are immutable so methods that modify them creates new string without touching the original one

        //to add \ or "" inside a string, we prefix them with another /
        // - for new line - /n, for space - /t

        //Arrays in Java - another reference data type
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        // number[10] = 3; // this will give an exception
        System.out.println(Arrays.toString(number));
        int[] digits = {1,4,6,2,4};
        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));

        //2d arrays
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));
        int[][] matrix2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(matrix2));

        //constant
        final float PI = 3.15F;
        //this value of PI cannot be changes

        //arithmetic operations => +, -, *, /, %, ++, -- => ++, -- work differently as postfix and prefix
        //In java they follow BODMAS rule

        //casting=> implicit - automatically convert smaller data type to larger, when left side has higher order data type and right has lower
        //implicit => byte > short> int> long> float> double
        //explicit - higher order data type on right and lower on l
        double x3 = 1.1;
        int result = (int)x3 + 2;
        System.out.println(result);

        String x1 = "1";
        int y1 = Integer.parseInt(x1) +2;
        System.out.println(y1);

        //math class in java
        int r1 = Math.round(1.1F);
        System.out.println(r1);
        int r2 = (int)Math.ceil(1.1F);
        System.out.println(r2);
        int r3 = (int)Math.floor(1.1F);
        System.out.println(r3);
        int r4 = Math.max(1,2);
        System.out.println(r4);
        double r5 = Math.random();
        System.out.println(r5);
        System.out.println(Math.round(r5));

        //formatting numbers in java - this class is abstract
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String ans = currency.format(123456.89); //in decimal format
        System.out.println(ans);
        NumberFormat perc = NumberFormat.getPercentInstance();
        String a1 = perc.format(0.1);
        System.out.println(a1);

        //read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte ax = scanner.nextByte();
        System.out.println("age =" + ax);
        System.out.print("Name: ");
        String name1 = scanner.next();
        System.out.println("Name =" + name);
        System.out.print("Line: ");
        String line = scanner.nextLine();
        System.out.println("Line =" + line);

        //comparison operators -> ==, !=, >=, <=, >, <

        //logical operators -> &&, ||

        //loops -> for, while, do-while


        //ArrayList - dynamic array
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(num.toString());
        System.out.println(num.get(2));
        num.remove(3); //removes from given index
        System.out.println(num.toString());
        num.remove(Integer.valueOf(1)); // removes particular value
        System.out.println(num.toString());
        System.out.println(num.isEmpty());
        num.clear(); //clears entire arraylist
        System.out.println(num.isEmpty());

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.set(3, Integer.valueOf(40)); //set value 30 at position 3, that is replacing the value 4
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums.toString());
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums.toString());
        System.out.println(nums.size());
        System.out.println(nums.contains(Integer.valueOf(1)));

        //loop over array list
        nums.forEach(n -> {
            System.out.println(n*2);
        }); //for each n in nums, do n*2 and print -> This doesn't change original nums arraylist

        //to modify arraylist
        nums.forEach(n -> {
            nums.set(nums.indexOf(n), n*2);
        });
        System.out.println(nums.toString());


        //hashmaps in Java
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Maths", 85);
        examScores.put("English", 90);
        examScores.put("Socials", 95);
        System.out.println(examScores.toString());
        System.out.println(examScores.get("Maths"));
        examScores.putIfAbsent("Math", 75);
        examScores.putIfAbsent("Hindi", 75);
        examScores.replace("Math", 70);
        examScores.remove("Socials");
        System.out.println(examScores.getOrDefault("Religion", 50));
        System.out.println(examScores.size());

        //foreach loop in hashmaps
        examScores.forEach((k, v) -> {
            System.out.println(k + "-" + v);
        });

        examScores.forEach((k, v) -> {
            examScores.remove(k, v-10);
        });
        System.out.println(examScores.toString());

    }

}