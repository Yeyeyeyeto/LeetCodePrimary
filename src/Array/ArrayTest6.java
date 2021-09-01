package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther Eternal
 * @Date 2021/8/31
 * 两个数组的交集 II
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 2, 1}, nums2 = new int[] {2, 2};

        int[] num3 = intersect(nums1, nums2);
        for (int i : num3) {
            System.out.print(i + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int index = 0;
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[index++] = list.get(k);
        }

        return res;
    }
}
