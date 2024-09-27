import java.util.Scanner;
public class Subarray {
    public static void maxSubArray(int[] nums){
        int[] subnums=new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                sum=nums[i]+sum;
            }
        }
        System.out.print("maximum sum of array "+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for (int i=0; i<size; i++){
            nums[i]=sc.nextInt();
        }
        maxSubArray(nums);

    }
    
}
