package Data_Structure;

// Maximum and minimum of an array using Linear search:
//Initialize values of min and max as minimum and maximum of the first two elements respectively. Starting from 3rd, compare each element with max and min, and change max and min accordingly (i.e., if the element is smaller than min then change min, else if the element is greater than max then change max, else ignore the element)
public class prob1 {
    static class Pair{
        int min;
        int max;
    }

    static Pair getminmax(int arr[],int n){
        Pair minmax = new Pair();

        if (n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        if (arr[0]>arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for (int i = 2;i<n;i++){
            if (arr[i]>minmax.max){
                minmax.max = arr[i];
            } else if (arr[i]<minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String args[]){
        int arr[] = {5,6,7,54,9,1};
        Pair minmax = getminmax(arr,arr.length);
        System.out.println("the minimum element of an array is "+ minmax.min);
        System.out.println("the maximum element of an array is "+ minmax.max);

    }

}
