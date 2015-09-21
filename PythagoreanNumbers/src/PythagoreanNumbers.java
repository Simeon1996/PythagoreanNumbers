import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        Integer count = reader.nextInt();

        for(Integer i = 0; i < count;i++){
            Integer currentNumber = reader.nextInt();

            numbers.add(currentNumber);
        }

        Integer counter = 0;

        for(Integer first = 0; first < numbers.size();first++){
            for(Integer second = 0; second < numbers.size();second++){
                for(Integer third = 0; third < numbers.size();third++){
                    Integer firstNumber = numbers.get(first);
                    Integer secondNumber = numbers.get(second);
                    Integer thirdNumber = numbers.get(third);

                    Integer sumOfFirstTwoNumbers = (firstNumber * firstNumber) + (secondNumber * secondNumber);

                    if(firstNumber <= secondNumber && sumOfFirstTwoNumbers.equals(thirdNumber * thirdNumber)){
                        System.out.printf("%d*%d + %d*%d = %d*%d",
                                firstNumber,firstNumber,secondNumber,secondNumber,thirdNumber,thirdNumber).println();
                        counter++;
                    }
                }
            }
        }

        if(counter == 0){
            System.out.println("No");
        }
    }
}
