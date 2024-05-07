public class SortedInsertedPosition {
    public static void main(String[] args) {
        int[] arr = {12,45,56,89};
        int targ = 45;
        public  int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;

            while (start <= end) {
                int mid = start + (end-start)/2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) end = mid-1;
                else start = mid+1;
            }

            return start;
        }

        searchInsert(arr,targ);

    }
}

