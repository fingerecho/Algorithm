package leetcode;

import java.util.HashMap;

public class Solution_3 {

    public int lengthOfLongestSubstring(String s) {
    	/*HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
    	for(int i=0;i<s.length();i++){
    		hs.put(s.charAt(i),i);
    	}*/
    	
    	//int count=0;
    	
    	//while(!hs.isEmpty()){
    	//	System.out.println(hs.get(count)+" : "+count);
    	//	hs.remove(count++);
    	//}
    	int start=0,end=0;
    	int fu=0;
    	boolean isEnd=true;
    	int result =0;
    	out:for(int i=start;i<s.length();i++){
    		for(int j=i+1;j<s.length();j++){
    			boolean is=true;
    			/*if(fu==0){
	    			for(int k=0;k<j;k++){
	    				if(s.charAt(i)==s.charAt(k)){
	    					is=false;
	    					if(fu==1){
	    						fu=2;
	    					}
	    					continue med;
	    				}
	    			}
    			}
    			if(is&&fu==0){
    				start=j;
    				fu=1;
    			}
    			if(fu==1){
    				for(int k=j;k<s.length();k++){
    					if(s.charAt(i)==s.charAt(k)){
	    					isEnd=false;
	    					continue med;
	    				}
    				}
    				end=j;
    				result = end-start;
    			}
    		*/
    			System.out.println("-----------");
    			for(int l=i;l<=j;l++){
    				System.out.print(s.charAt(l));
    			}
    			System.out.println("\n-----------");
    			for(int k=i;k<=j;k++){
    				for(int z=i+1;z<=j;z++){
    					
    					if(k==z){
    						continue;
    					}
	    				if(s.charAt(k)==s.charAt(z)){
	    					is=false;
	    					//continue out;
	    				}
    				}
    			}
    			if(is){
    				if(result<j-i){
    					result=j-i;
    				}
    				System.out.println("����-----------����");
        			for(int l=i;l<=j;l++){
        				System.out.print(s.charAt(l));
        			}
        			System.out.println("\n����-----------����");
    			}
    		}
    	}
    	return result+1;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println((new Solution_3()).lengthOfLongestSubstring("abcabcbb"));
    	
	}

}