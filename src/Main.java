
public class Main {
    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        int sumAB = add(a, b);
        int sumCD = add(c, d);
        return add(sumAB, sumCD);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好，" + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting (String name){
        return "下午好，" + name + "!";
    }

    // 5. triple
    public static String triple(String word){
        return word + word + word;
    }

    // 6. half
    public static double half(int num){
        return num * 0.5;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double num){
        return (int) Math.round(num);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num){
        return (int) Math.round(Math.abs(num)) * -1;
    }

    //main method
    public static void main(String[] args){
        int result = add(3, 8);
        System.out.println(result);

        result = add(3, 8, 4, 9);
        System.out.println(result);

        String greeting = morningGreeting("Toby Fox");
        System.out.println(greeting);

        greeting = afternoonGreeting("Mac Miller");
        System.out.println(greeting);

        String threeWords = triple("oohbaby");
        System.out.println("\"" + threeWords + "\"");

        double halfNum = half(8);
        System.out.println(halfNum);
        halfNum = half(17);
        System.out.println(halfNum);

        //Please note that the instructions for section 7 and 8:
        // "an example of a call to the half method," may be a
        // typo, as we are not working with the half method here.
        int positiveInt = roundPositiveValueToNearestInteger(8.5);
        System.out.println(positiveInt);
        positiveInt = roundPositiveValueToNearestInteger(8.49);
        System.out.println(positiveInt);

        int negativeInt = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(negativeInt);
        negativeInt = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(negativeInt);


    }
}

