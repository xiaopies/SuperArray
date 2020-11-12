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
    words.add(3, "Xiaoshen");
    System.out.println(words.toString());
    System.out.println(words.indexOf("Xiaoshen"));
    words.remove(3);
    System.out.println(words.toString());

    System.out.println(words.lastIndexOf("uni"));

    SuperArray ords = new SuperArray();
    ords.add("kani");   ords.add("uni");     ords.add("ebi");     ords.add("una");
    ords.add("una");    ords.add("ebi");     ords.add("kani");    ords.add("una");
    ords.add("una");    ords.add("ebi");     ords.add("toro");
    SuperArray rds = new SuperArray();
    rds.add("kani");   rds.add("uni");     rds.add("ebi");     rds.add("una");
    rds.add("una");    rds.add("ebi");     rds.add("kani");    rds.add("una");
    rds.add("una");    rds.add("ebi");
    System.out.println(ords.toString());
    rds.add("toro");
    System.out.println(rds.toString());
    System.out.println(ords.equals(rds));

    try{
      SuperArray tea = new SuperArray(-2);
    }
    catch( IllegalArgumentException e ){
      System.out.println("don't use negative");
    }

    try{
      ords.get(14);
    }
    catch( IndexOutOfBoundsException e ){
      System.out.println("must be between 0 and " + ords.size() );
    }
    try{
      ords.set(14, "hohoho");
    }
    catch( IndexOutOfBoundsException e ){
      System.out.println("must be between 0 and " + ords.size() );
    }










  }
}
