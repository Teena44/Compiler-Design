import syntaxtree.*;
import visitor.*;
import java.util.*;

public class P2 {

   // public static void main(String [] args) {
   //    try {
   //       Node root = new MiniJavaParser(System.in).Goal();
   //       System.out.println("Program parsed successfully");
	  //    GJDepthFirst v = new GJDepthFirst();
   //       _ret = root.accept(v,null);

   //       GJDepthFirst2 v2 = new GJDepthFirst2();
   //       root.accept(v,_ret);

   //    }
   //    catch (ParseException e) {
   //       System.out.println(e.toString());
   //    }
   // }

   // public class Main {
   

      public static void main(String [] args) {
         try {
            Node root = new MiniJavaParser(System.in).Goal();
            Object _ret = root.accept(new GJDepthFirst(),null);
            root.accept(new GJDepthFirst2(),_ret); // Your assignment part is invoked here.
            System.out.println("Program type checked successfully");
         }
         catch (ParseException e) {
            System.out.println(e.toString());
         }
      }
    
}
