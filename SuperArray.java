public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray( int size){
    this.data = data;
    this.size = size;
  }
  public SuperArray(){
    SuperArray superArray = new SuperArray(10);
  }

  public int size(){
    return superArray.length;
  }
  public boolean add(String element){
    superArray+= element;
  }
  public String get(int index){
    superArray.indexOf(index);
  }


}
