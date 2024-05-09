import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[] array = {3, 93, 4,2,-3,4,-35,-87,2,5545,-3,24,1,5,7};
        boolean negativeFound = false;

        float quantityOfPositiveNumbers=0;
        float sum=0;
        


        for(float currentNumber : array){
            if(currentNumber<0){
                negativeFound=true;
            }else if(negativeFound){
                quantityOfPositiveNumbers=quantityOfPositiveNumbers+1;
                sum=sum+currentNumber;
            }


        }

        System.out.println(sum/quantityOfPositiveNumbers);


    }
}