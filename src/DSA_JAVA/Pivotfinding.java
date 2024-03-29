package DSA_JAVA;

//{check}
//not for duplicate values
public class Pivotfinding {
    public static void main(String[]args){
    int[]arr={3,4,5,6,7,0,1,2};
    int target=6;

   //System.out.print("index:"+Arrays.toString(search(arr,target)));
    }
    static int search(int[]arr, int target){

        int pivot=pivot(arr);
        //if we are unable to find a pivot means array is not rotated
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>arr[pivot]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }

    }
    static int binarySearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivot(int[]arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid + 1]) {
                return mid + 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
        static int pivotwithDuplicates(int[] arr){
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid + 1]) {
                    return mid + 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
