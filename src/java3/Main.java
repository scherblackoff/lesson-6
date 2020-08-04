package java3;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,3,3,5,6,5};
        giveAfterFour(arr);
    }
    public static void giveAfterFour(int[] arr){
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
    }
}
