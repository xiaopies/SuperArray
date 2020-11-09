public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i<s.size(); i++){
      if (s.get(i) != null){
        for (int j = i+1; j<s.size(); j++){
          if (s.get(i).equals(s.get(j))){
            s.remove(j);
            j--;
          }
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray x = new SuperArray();
    for (int i = 0; i<a.size(); i++){
      for (int j =0; j< b.size(); j++){
        if (a.get(i).equals(b.get(j))) {
          x.add(a.get(i));
        }
      }
    }
    removeDuplicates(x);
    return x;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray ords = new SuperArray();
    ords.add("kani");   ords.add("uni");     ords.add("ebi");     ords.add("una");
    ords.add("una");    ords.add("ebi");     ords.add("kani");    ords.add("una");
    ords.add("una");    ords.add("ebi");     ords.add("toro");
    SuperArray rds = new SuperArray();
    rds.add("kani");   rds.add("uni");     rds.add("ebi");     rds.add("una");
    rds.add("una");    rds.add("ebi");     rds.add("kani");    rds.add("una");
    rds.add("una");    rds.add("ebi");     
    System.out.println(findOverlap(ords, rds));

  }
}
