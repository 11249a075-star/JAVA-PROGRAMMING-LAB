public class StringFunctionsDemo {
   public StringFunctionsDemo() {
   }

   public static void main(String[] var0) {
      String var1 = "Java Programming";
      String var2 = "java programming";
      String var3 = "Welcome to Java";
      System.out.println("Original String:" + var1);
      System.out.println("Length:" + var1.length());
      System.out.println("Character at index5:" + var1.charAt(5));
      System.out.println("Substring(5):" + var1.substring(5, 11));
      System.out.println("Concatenation:" + var1.concat("Language"));
      System.out.println("Equals:" + var1.equals(var2));
      System.out.println("Equals Ignoire Case:" + var1.equalsIgnoreCase(var2));
      System.out.println("CompareTo:" + var1.compareTo(var2));
      System.out.println("CompareTo Ignore Case:" + var1.compareToIgnoreCase(var2));
      System.out.println("Contains 'java':" + var1.contains("java"));
      System.out.println("Starts With 'java':" + var1.startsWith("java"));
      System.out.println("Ends with 'ming':" + var1.endsWith("ming"));
      System.out.println("Index of 'p':" + var1.indexOf(80));
      System.out.println("LAst Index of 'a':" + var1.lastIndexOf(97));
      System.out.println("Replace Java with python:" + var1.replace("java", "python"));
      System.out.println("ReplaceAll vowels:" + var1.replace("java", "python"));
      System.out.println("Upper Case:" + var1.toUpperCase());
      System.out.println("Lowercase:" + var1.toLowerCase());
      System.out.println("Trim:" + var3.trim() + "'");
      String var4 = "";
      System.out.println("Is Empty:" + var4.isEmpty());
      String[] var5 = var1.split(" ");
      System.out.println("Split:");

      for(String var9 : var5) {
         System.out.println(var9);
      }

      byte var13 = 100;
      String var14 = String.valueOf(var13);
      System.out.println("ValueOf():" + var14);
      char[] var15 = var1.toCharArray();
      System.out.println("Character Array:");

      for(char var12 : var15) {
         System.out.print(var12 + " ");
      }

      System.out.println();
      String var17 = String.join("-", "java", "python", "c++");
      System.out.println("join:" + var17);
      System.out.print("Repeat:");

      for(int var18 = 0; var18 < 3; ++var18) {
         System.out.print("Hii");
      }

      System.out.println();
   }
}
