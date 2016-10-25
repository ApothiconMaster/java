public class Kitten {
   int kittenAge;
   
   public Kitten(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }
   
   public void setAge( int age ) {
      kittenAge = age;
   }
   
   public int getAge( ) {
      System.out.println("Kitten's age is :" + kittenAge );
      return kittenAge;
   }
   
   public static void main(String []a) {
      /* Object creation */
      Kitten myKitten = new Kitten( "Rose" );
      
      /* Call class method to set kitten's age */
      myKitten.setAge( 2 );
      
      /* Call another class method to get kitten's age */
      myKitten.getAge( );
      
      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + my Kitten.kittenAge );
   }
}
