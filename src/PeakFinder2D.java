public class PeakFinder2D {

    public static int peak2D(int arr[][]){

        int arrsize = arr.length;
        int arrcolsize =
        int peak=0;
        int temppeak=0;

        // find collumn peak in middle

        int middleRow = arrsize/2;
        int middleCol = arrsize[middleRow]/2;

        if(arr[middleRow][middleCol] < arr[middleRow][middleCol-1]){
            if(arr[middleRow][0] > arr[middleRow][1]){
                peak = arr[middleRow][0];
            }
            else if (arr[middleRow][middleCol-1] > arr[middleCol] -2){
                peak = arr[middleRow][middleRow-1];
            }

            else{
                for (int i = 0; i < middleCol-1; i++){
                    if((arr[middleRow][i] >= arr[middleRow][i+1]) && (arr[middleRow][i] >= arr[middleRow][i-1])){
                        peak = arr[middleRow][i];
                    }
                }
            }
        }
        else if(arr[middleRow][middleCol] < arr[middleRow][middleCol+1]){
            if(arr[middleRow][middleCol] > arr[middleRow][middleCol+1]){
                peak = arr[middleRow][middleCol];
            }
            else if (arr[middleRow][] > arr[middleCol] -2){
                peak = arr[middleRow][middleRow-1];
            }

            else{
                for (int i = 0; i < middleCol-1; i++){
                    if((arr[middleRow][i] >= arr[middleRow][i+1]) && (arr[middleRow][i] >= arr[middleRow][i-1])){
                        peak = arr[middleRow][i];
                    }
                }
            }
        }
        return peak;

    }

    public static void main(String[] args){
        int[][] input = {
                { 2, 3, 5, 4, 1 },
                { 1, 3, 4, 3, 2 },
                { 1, 3, 5, 4, 3 },
                { 2, 4, 6, 8, 2 },
                { 3, 4, 5, 6, 1 }
        };


        //System.out.println(input.length);
        System.out.println(input.length/2);
    }

}

