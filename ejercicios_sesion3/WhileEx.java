class WhileEx{
   public static void main(String args[]){
      var b = false;
      var i = 1;
      do{
         i++ ;
      } while (b = !b);
      System.out.println( i );
   }
}
