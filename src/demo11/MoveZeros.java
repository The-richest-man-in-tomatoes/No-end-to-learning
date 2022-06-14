package demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveZeros {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
/**
 * golang 解法
 *
 * func moveZeroes(nums []int)  {
 *     l, r, n := 0, 0, len(nums)
 *     for r < n {
 *         if nums[r] != 0 {
 *             nums[l], nums[r] = nums[r], nums[l]
 *             l++
 *         }
 *         r++
 *     }
 *
 * }
 */


}
