public class Demo{
 public static void printLoop(int x){
  for (int i = x; i>0; i--){
    for (int j = 0; j<i; j++){
      System.out.print(x-i+1);
    }
   System.out.println();
  }
 }
 public String arrToString(int[] arr){
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
  public static void main(String[] args){
    if (args.length == 1){
      printLoop(Integer.parseInt(args[0]));
    }
  else{
   printLoop(5);
  }
 }
}
