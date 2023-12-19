//È una ricerca degli elementi unici
//Faccio avanzare i fino a quando non trovo un elemento unico, quando lo trovo, pongo nums[k] uguale a quell'elemento ed aggiorno k
//L'array senza ripetizioni sarà quello fino a k

public class removeDuplicates {
    public static int removeDupli(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize the count of unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int k = removeDupli(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements in the array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

