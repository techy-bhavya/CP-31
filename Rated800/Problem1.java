//1903-A
import java.util.*;

public class Problem1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i] = sc.nextInt();
		    }
		    boolean sorted = true;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]>arr[i+1]){
		            sorted = false;
		            break;
		        }
		    }
		    if(k==1){
		        if(sorted){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else{
		        System.out.println("YES");
		    }
		}
		sc.close();
	}
}

