public class better4loop 
{
    public static void main(String a[])
    {
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 9;

     //   for(int i= 0;i<nums.length;++i)
    
       //     {
       //          System.out.println(nums[i]);
        //    }


       // Enhanced loop demonstration
        
        for(int n : nums)
        {
            System.out.println(n);
        }
    }  
    
        
            
        

    
}