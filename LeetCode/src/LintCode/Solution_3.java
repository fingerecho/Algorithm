package LintCode;
public class Solution_3 {

    public static  String getTwo(int a){
        StringBuffer res = new StringBuffer();
        while(a>0){
            int s = a%2;
            res.append(String.valueOf(s));
            a=a/2;
        }
        return new String(res);
    }
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        //System.out.println((new Solution()).getTwo(7));
        String stra = getTwo(a);
        String strb = getTwo(b);
        System.out.println(stra);
        System.out.println(strb);
        int count=0;
        
        for(int i=0,j=0;;i++,j++){

            if(i<stra.length()&&j>=strb.length()){
                count++;
                continue;
            }
            if(j<strb.length()&&i>=stra.length()){
            count++;
            	continue;
            }
            if(i>=stra.length()&&j>=strb.length()){
                break;
            }
            if(stra.charAt(i)!=strb.charAt(j)){
                count++;
            }
        }
        return count;
    }
	public  static  void main(String [] args){
		//1000011
		//  11111‬
		System.out.println(Solution_3.bitSwapRequired(67,31));
	}
}
