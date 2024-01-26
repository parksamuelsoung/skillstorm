import java.util.HashMap;

public class WednesdayPart1 {

   private static HashMap<String, String> alphabet;
   private static StringBuilder acronymnBuilder = new StringBuilder();
 
   static {
      alphabet = new HashMap<>();
      alphabet.put("a", "alpha");
      alphabet.put("b", "bravo");
      alphabet.put("c", "charlie");
      alphabet.put("d", "delta");
      alphabet.put("e", "echo");
      alphabet.put("f", "foxtrot");
      alphabet.put("g", "golf");
      alphabet.put("h", "hotel");
      alphabet.put("i", "india");
      alphabet.put("j", "juliett");
      alphabet.put("k", "kilo");
      alphabet.put("l", "lima");
      alphabet.put("m", "mike");
      alphabet.put("n", "november");
      alphabet.put("o", "oscar");
      alphabet.put("p", "papa");
      alphabet.put("q", "quebec");
      alphabet.put("r", "romeo");
      alphabet.put("s", "sierra");
      alphabet.put("t", "tango");
      alphabet.put("u", "uniform");
      alphabet.put("v", "victor");
      alphabet.put("w", "whiskey");
      alphabet.put("x", "x-ray");
      alphabet.put("y", "yankee");
      alphabet.put("z", "zulu");
   }
 
   public static String spellName(String name) {

      if (name.isEmpty()) {
         return acronymnBuilder.toString();
      }

      String firstProKey = name.substring(0, 1).toUpperCase();
      String rawValue = alphabet.get(name.substring(0, 1).toLowerCase());
      String proValue = rawValue.substring(0, 1).toUpperCase() + 
         rawValue.substring(1, rawValue.length());

      acronymnBuilder.append(String.format("%s as in %s%n", 
         firstProKey, proValue));
      
      name = name.replace(name.substring(0, 1), "");

      return spellName(name);
   }
   
   // Test w/ for loop.
   //  public static String spellName(String name) {

   //    StringBuilder nameAcronymn = new StringBuilder();
   //    String rawValue;

   //     for (int i = 0; i < name.length(); i++) {
   //       rawValue = alphabet.get(name.substring(i, i + 1).toLowerCase());

   //       nameAcronymn.append(String.format("%s as in %s%n", 
   //          name.substring(i, i + 1).toUpperCase(),
   //          rawValue.substring(0, 1).toUpperCase() +
   //             rawValue.substring(1, rawValue.length())
   //       ));
   //     }
   //     return nameAcronymn.toString();
   //  }
}