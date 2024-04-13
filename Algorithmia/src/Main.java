import resources.DataStructures;
import resources.Solution;

import java.lang.reflect.Array;

import resources.ListNode;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.containsNearbyDuplicate(new int[]{1,2,3,3,2}, 3));
        System.out.println(solution.containsNearbyDuplicate(new int[]{99,99}, 2));
    }

}