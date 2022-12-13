package Data_Structure;

//java program to check the arry has duplicate element or not...
public class prob5 {
    static boolean checkDuplicate(int[] arr,int n){
        for (int i =0;i<n;i++){
            int j = i+1;
            while (j < n){
                if (arr[i] == arr[j]){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = {2,3,45,6,7,5};
        checkDuplicate(arr,arr.length);
        if (checkDuplicate(arr,arr.length)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
