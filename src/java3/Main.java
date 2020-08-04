package java3;

public class Main {

    public static void main(String[] args) {
    }
    public int[] doAfterFour(int[] arr){
        int last = 0;
            for (int i = arr.length-1; i > -1; i--) {
                if (arr[i] == 4) {
                    last = i + 1;
                    break;
                }else{
                    continue;
                }
            }
        int[] currentArr = new int[arr.length - last];
        for(int i = 0; i < currentArr.length; i ++){
            currentArr[i] = arr[last + i];
        }

        for (int i = 0; i < currentArr.length; i++) {
            System.out.print(currentArr[i] + " ");
        }
        return currentArr;
    }
    public static boolean isOneAndFour(int[] arr) {
        boolean haveOne = false;
        boolean haveFour = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                haveFour = true;
                continue;
            }
            if (arr[i] == 1) {
                haveOne = true;
                continue;
            }else {
                return false;
            }
        }
        if (haveFour == true && haveOne == true) {
            return true;
        }
        return false;
    }
}
