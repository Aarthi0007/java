package javaassignment;

public class ascending
	{

	public static void main(String[] args)
	{
		int [] a = new int[] {4,6,3,8,1,10};
		int temp = 0;
		
        for (int i= 0;i<a.length;i++) {
        for (int j =i+1;j<a.length;j++) {
        	if(a[i]>a[j])
        	{      
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
       		}
    	}
 
        }	
        System.out.println();
        System.out.println("Element of array sorted in ascending order:");
        		for(int i=0;i<a.length;i++) 
        		{
        			System.out.println(a[i]+" ");
        			}
        		}

	

}
