import java.util.*;

public class Problem3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    boolean threeConsEmpty = false;
		    int countEmpty = 0;
		    
		    for(int i=0;i<n;i++){
		        if(i+2<n && s.charAt(i)=='.' && s.charAt(i+1)=='.' && 
		        s.charAt(i+2)=='.'){
		            threeConsEmpty=true;
		        }
		        if(s.charAt(i)=='.'){
		            countEmpty++;
		        }
		    }
		    if(threeConsEmpty){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(countEmpty);
		    }
		}
		sc.close();
	}
}