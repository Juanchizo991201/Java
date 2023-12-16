package resources;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // If there are no prices or only one price, there's no profit.
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < minPrice) {
                minPrice = currentPrice; // Update the minimum price if a lower price is found.
            } else {
                int potentialProfit = currentPrice - minPrice;
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit; // Update the max profit if a higher profit is found.
                }
            }
        }
        return maxProfit;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // If we encounter an invalid character or mismatched parenthesis, return false
            }
        }
        return stack.isEmpty();
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int i = 0;
        boolean isPrefix = true;
        while (isPrefix) {
            if (strs.length == 0) {
                isPrefix = false;
            } else if (strs[0].isEmpty()) {
                isPrefix = false;
            } else if (i >= strs[0].length()) {
                isPrefix = false;
            } else {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length()) {
                        isPrefix = false;
                        break;
                    } else if (strs[j].charAt(i) != c) {
                        isPrefix = false;
                        break;
                    }
                }
                if (isPrefix) {
                    prefix.append(c);
                }
            }
            i++;
        }
        return prefix.toString();
    }

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int currentNum = nums[i];
            int nextNum = nums[i + 1];
            if (currentNum == nextNum) {
                return true;
            }
        }
        return false;//
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] firstSubArray = Arrays.copyOf(nums1, m);
        int[] secondSubArray = Arrays.copyOf(nums2, n);

        int[] finalArray = new int[m + n];

        System.arraycopy(firstSubArray, 0, finalArray, 0, m);
        System.arraycopy(secondSubArray, 0, finalArray, m, n);

        Arrays.sort(finalArray);
        nums1 = nums2 = finalArray;

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        s = s.replaceAll("_", "");
        System.out.println(s);

        StringBuilder reversed = new StringBuilder(s).reverse();
        String reversedString = reversed.toString();
        System.out.println(reversedString);

        return s.equalsIgnoreCase(reversedString);
    }

    public boolean isAnagram(String s, String t) {

        char[] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        char[] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);

        String sString = new String(sCharArray);
        String tString = new String(tCharArray);
        return sString.equalsIgnoreCase(tString);
    }

    public int removeElement(int[] nums, int val) {

        nums = Arrays.stream(nums).filter(i -> i != val).toArray();
        System.out.println(Arrays.toString(nums));

        return nums.length;
    }

    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1; // Target not found
    }

    public void rotate(int[] nums, int k) {
        Queue<Integer> numsQueue = new LinkedList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            numsQueue.add(nums[i]);
        }

        for (int i = 0; i < k; i++) {
            numsQueue.add(numsQueue.remove());
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = numsQueue.remove();
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = IntStream.range(0, (nums1.length + nums2.length)).map(i -> i < nums1.length ? nums1[i] : nums2[i - nums1.length]).toArray();

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            int middleIndex = mergedArray.length / 2;
            int middleIndexMinusOne = middleIndex - 1;
            return (double) (mergedArray[middleIndex] + mergedArray[middleIndexMinusOne]) / 2;
        } else {
            int middleIndex = mergedArray.length / 2;
            return mergedArray[middleIndex];
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode mergedList = new ListNode(0);
        ListNode currentNode = mergedList;

        while (true) {
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < lists.length; i++) {
                ListNode currentListNode = lists[i];
                if (currentListNode != null && currentListNode.val < minValue) {
                    minIndex = i;
                    minValue = currentListNode.val;
                }
            }

            if (minIndex == -1) {
                break;
            }

            currentNode.next = lists[minIndex]; 
            currentNode = currentNode.next;
            lists[minIndex] = lists[minIndex].next;
        }

        return mergedList.next;
    }

    public int removeDuplicates(int[] nums) {

        // Un set es una colección de elementos que no permite valores duplicados,
        // por ende, cuando se intenta agregar un valor que ya existe, no se agrega.

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }

        List<Integer> sortedList = new ArrayList<>(uniqueSet);
        Collections.sort(sortedList);

        for (int i = 0; i < uniqueSet.size(); i++) {
            nums[i] = (int) sortedList.get(i);
        }

        return uniqueSet.size();
    }

    public List<Integer> majorityElement(int[] nums) {

        Map<String, String> dictionaryOfElements = new HashMap<>();

        for (int num : nums) {
            String key = String.valueOf(num);
            if (dictionaryOfElements.containsKey(key)) {
                String value = dictionaryOfElements.get(key);
                int valueInt = Integer.parseInt(value);
                valueInt++;
                dictionaryOfElements.put(key, String.valueOf(valueInt));
            } else {
                dictionaryOfElements.put(key, "1");
            }
        }

        List<Integer> majorityElements = new ArrayList<>();
        for (Map.Entry<String, String> entry : dictionaryOfElements.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            int valueInt = Integer.parseInt(value);
            if (valueInt > (nums.length / 3)) {
                majorityElements.add(Integer.parseInt(key));
            }
        }
        return majorityElements;
    }

    public int divide(int dividend, int divisor) {

        if (Integer.MIN_VALUE < dividend || dividend > Integer.MAX_VALUE || Integer.MIN_VALUE < divisor || divisor > Integer.MAX_VALUE) {
            return dividend / divisor;
        }

        return 0;
    }

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int firstIndex = i;
                int lastIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target) {
                        lastIndex = j;
                    }
                }
                return new int[]{firstIndex, lastIndex};
            }
        }

        return new int[]{-1,-1};
    }
}