public class Tester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }

    System.out.println(words.toString());
    System.out.println(words.contains("uni"));
    System.out.println(words.contains("unit"));


  }
}
