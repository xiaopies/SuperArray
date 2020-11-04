public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(int size){
    data = new String[10];
    size = 0;
  }
  public SuperArray(){
    data = new String[10] ;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (data.length <= size){
      return false;
    }
    else{
      data[size]= element;
      size ++;
    }
    return true;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String a = get(index);
    data[index] = element;
    return a;
  }




}
