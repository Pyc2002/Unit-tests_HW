package five.number;

import java.util.List;

public class MaxNumberModule {
    public int maxNumber(int[]array){
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>result) {
                result = array[i];
            }
        }
        return result;
    }
}
