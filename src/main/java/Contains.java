

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){

        boolean a = false;
        
        for (int i = 0; i < arr.length; i++){
           if(target == arr[i]){
            a = true;
            break;
           } 
           else {
            a = false;
           }
        }
        return a;
    }
}