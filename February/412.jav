/*
 * 412. Fizz Buzz
 * February 29, 8:10 PM
 */

class Solution{
    //first solution
    public static String[] fizzBuzz1(int n){
        List<String> fizzBuzzArray = new List<>(n);

        for (int i = 1; i <= n; i++){
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);

            if (divisibleBy3 && divisibleBy5){
                fizzBuzz1.add("FizzBuzz");
            } else if (divisibleBy3){
                fizzBuzzArray.add("Fizz");
            } else if (divisibleBy5){
                fizzBuzzArray.add("Buzz");
            } else {
                fizzBuzzArray.add(i);
            }
        }
        return fizzBuzzArray;
    }

    //second solution
    public static String[] fizzBuzz2(int n){
        List<String> fizzBuzzArray = new List<>(n);

        for (int i = 1; i <= n; i++){
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);
            String answer = "";

            if (divisibleBy3){
                answer += "Fizz";
            }
            
            if (divisibleBy5){
                answer += "Buzz";
            }

            if (answer.isEmpty()){
                answer += i;
            }

            fizzBuzzArray.add(answer);
        }
        return fizzBuzzArray;
    }
}