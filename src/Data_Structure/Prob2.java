package Data_Structure;

//reverse the array.....
public class Prob2 {
    static void reverse(int arr[],int start,int end){
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            System.out.println(start+" "+end);
            //System.out.println(arr);
        }


    }


    static void printa(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {25,26,27,28,30,24};
        printa(arr);
        reverse(arr,0,5);
        printa(arr);
        System.out.println("\n\n\n");

        String name = "Nilesh Rajput";

    }
}
