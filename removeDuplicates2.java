// Stessa logica di removeDuplicates, solo che aggiungo un "contatore" che mantiene i duplicati solo una volta


public class removeDuplicates2 {
    public static int removeDupli(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int twice = 0;
        int k = 1; // Initialize the count of unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
                twice = 0;
            //TROVO UN DUPLICATO
            }else{
                if(twice == 0){
                    nums[k++] = nums[i];
                    twice++;
                }
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1,1, 2, 2, 2, 3, 4, 4, 4,5,5,6,7,7,7,8};
        int k = removeDupli(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements in the array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

