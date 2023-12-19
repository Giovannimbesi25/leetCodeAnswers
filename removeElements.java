import java.util.Arrays;

public class removeElements {
    public static int removeValue(int[] nums, int k){
    int count=0;

    for(int i=0;i<nums.length;i++){
        if(nums[i]!=k){
            nums[count]=nums[i];
            count++;
        }
    }
    return count;
    
}

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(removeValue(nums, k));
        System.out.println(Arrays.toString(nums));
    }
}


//  33233

