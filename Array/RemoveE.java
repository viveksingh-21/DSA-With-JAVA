package Array;

public class RemoveE {
        public static int removeElement(int[] nums, int val) {
            int k = 0; // Number of elements that are not equal to val
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
    
            return k;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {3, 2, 2, 3};
            int val1 = 3;
            int k1 = removeElement(nums1, val1);
            // Expected output: 2, nums1 = [2, 2, _, _]
    
            int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
            int val2 = 2;
            int k2 = removeElement(nums2, val2);
            // Expected output: 5, nums2 = [0, 1, 4, 0, 3, _, _, _]
        }
    }
