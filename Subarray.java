import java.util.Scanner;
public class MaxMin {
    public static int Mini(int[] nums,int N){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<=N; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public static int Max(int[] nums,int N){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<=N; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] nums= new int[size];
        for(int i=0; i<=size;i++){
            nums[i]=sc.nextInt();
        }
        int N=nums.length;
        System.out.println("The maximum value is : "+ Max(nums, N));
        System.out.println("The minimum value is : "+ Mini(nums, N));
    }

    
}

