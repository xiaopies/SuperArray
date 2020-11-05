public class Testers{
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
    words.add(3, "Xiaoshen");
    System.out.println(words.toString());
    System.out.println(words.indexOf("Xiaoshen"));
    words.remove(3);
    System.out.println(words.toString());
    System.out.println(words.indexOf("Xiaoshen"));
    String[] work; new SuperArray();
    for (int i = 0; i<4; I++){
      
    }





  }
}
