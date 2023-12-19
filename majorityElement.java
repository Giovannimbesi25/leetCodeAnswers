// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

//Soluzione fantastica, non ci sarei mai arrivato senza un doppio ciclo for

public class majorityElement {

    public static int majorityValue(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        // Esempio di utilizzo
        int[] nums = {2, 2, 1, 1, 2, 2, 1};
        int result = majorityValue(nums);
        System.out.println("Il maggioritario elemento è: " + result);
    }
}
