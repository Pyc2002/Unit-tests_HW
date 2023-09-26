package five.number;


import java.util.Random;


public class RandomNumberModule {
    public int [] randomArray(int arraySize){
        Random random = new Random();
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }
}
