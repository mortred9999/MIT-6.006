public class PeakFinder {
    // Peak Finder 1 Dimention
    public static int strightForward(int arr[], int start, int finish){
        int arrsize = arr.length;
        int peak = 0;
        finish = arrsize-1;

        if (arr[start] >= arr[start + 1]){
            peak = arr[start];

        }

        else if(arr[finish] >= arr[finish-1]){
            peak = arr[finish];

        }

        else{
            for (int i = start+1; i <= finish-1;i++){
                if((arr[i] >= arr[i-1] )&& (arr[i]) >= arr[i+1] ){
                    peak = arr[i];
                }
            }
        }
        return peak;
    }

    public static int divideandConquer(int arr[]){
        int arrsize = arr.length;
        int peak = 0;
        if(arr[(arrsize/2 -1)] < arr[(arrsize/2 -2)]){
            peak = strightForward(arr,0,(arrsize/2-1));
        }
        else{
            peak = strightForward(arr,(arrsize/2),arrsize-1);

        }
        return peak;
    }


    public static void main(String[] args) {
        int input[] = {5, 6, 7, 7, 8, 11, 10, 9, 8, 7, 6, 5, 4, 3};
        int inputsize = input.length;
        int apeak=0;
        int dividepeak = 0;
        apeak = strightForward(input,0,inputsize-1);
        System.out.println("Find a peak strightforward, it's: "+apeak);

        dividepeak = divideandConquer(input);
        System.out.println("Find a peak divide&conquer, it's: "+dividepeak);
    }
}
