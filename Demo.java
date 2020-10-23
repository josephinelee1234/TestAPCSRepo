import java.util.Arrays;
public class Demo{
 public static void printLoop(int x){
  for (int i = x; i>0; i--){
    for (int j = 0; j<i; j++){
      System.out.print(x-i+1);
    }
   System.out.println();
  }
 }
 public static String arrToString(int[] arr){
   String ans = "";
   ans += "{";
   for(int i = 0; i<arr.length; i++){
     String aa = Integer.toString(arr[i]);
     ans += aa;
     if (i != arr.length-1){
       ans += ", ";
     }
   }
   ans += "}";
   return ans;
 }
 public static String arrayDeepToString(int[][] arr){
		if(arr.length == 0){
			return "{}";
		}
		String a = "{";
		for(int i = 0; i<arr.length-1; i++){
			a += arrToString(arr[i]) + ", ";
		}
		a += arrToString(arr[arr.length-1]) +"}";
		return a;
	}
  public static int[][] create2DArray(int rows, int cols, int maxValue){
		int[][] ar = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				ar[i][j] = (int) (Math.random() * (maxValue + 1));
			}
		}
		return ar;
	}
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
		int[][] ar = new int[rows][];
		for(int i=0; i<rows; i++){
			int c = (int)((cols+1) * Math.random());
			ar[i] = new int[c];
			for(int j=0; j<c; j++){
				ar[i][j] = (int) ((maxValue + 1) * Math.random());
			}
		}
		return ar;
	}
  public static void main(String[] args){
    if (args.length == 1){
      printLoop(Integer.parseInt(args[0]));
    }
  else{
   printLoop(5);
  }
  //int[][] a = create2DArray(5,4,4);
  //int[][] b = create2DArrayRandomized(6,4,10);
  //System.out.println(arrayDeepToString(a));
  //System.out.println(arrayDeepToString(b));
 }
}
