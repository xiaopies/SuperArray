public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int initialCapacity){
    if (initialCapacity<0){
      throw new IllegalArgumentException("Initial Capacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (data.length <= size){
      resize();
    }
    data[size]= element;
    size ++;
    return true;
  }
  public String get(int index){
    if (index<0 || index>= size()){
      throw new IndexOutOfBoundsException("index " + index + " is out of range");
    }
    return data[index];
  }
  public String set(int index, String element){
    if (index<0 || index>= size()){
      throw new IndexOutOfBoundsException("index " + index + " is out of range");
    }
    String a = get(index);
    data[index] = element;
    return a;
  }
  private void resize(){
    String[] a = new String[data.length * 2];
    for (int i = 0; i<size; i++){
      a[i] = data[i];
    }
    data = a;
  }
  public void clear(){
    String[] a = new String[data.length];
    data = a;
  }
  public boolean isEmpty(){
    for (int i = 0; i < data.length; i++){
      if (data[i] != null){
        return false;
      }
    }

    return true;
  }
  public String toString(){
    if (size == 0){
      return "[]";
    }
    String x= "[";
    int i = 0;
    while (i<size){
      if (data[i] != null){
        x+= data[i];
        if (i< size -1){
          x += ", ";
        }
        i++;
      }
    }
    x += "]";
    return x;
  }
  public boolean contains(String s){
    return (indexOf(s) != -1);
  }

  public void add(int index, String element){
    if (index<0 || index>= size()){
      throw new IndexOutOfBoundsException("index " + index + " is out of range");
    }
    if (data[data.length-1] != null){
      resize();
    }
    for (int i = data.length-1; i>index ; i--){
      if (data[i-1] != null){
        data[i] = data[i-1];
      }
    }
    data[index] = element;
    size++;
  }
  public String remove(int index){
    if (index<0 || index>= size()){
      throw new IndexOutOfBoundsException("index " + index + " is out of range");
    }

    String a = data[index];
    for (int i = index; i < size-1; i++){
      data[i] = data[i+1];
    }
    size --;
    return a;
  }
  public int indexOf(String s){
    for (int i = 0; i<data.length; i++){
      if (data[i] != null){
        if (data[i].equals(s)){
          return i;
        }
      }
    }
    return -1;
  }
  public String[] toArray(){
    String[] a = new String[size];
    int i = 0;
    while(i<size){
      if (data[i] != null){
        a[i] = data[i];
      }
    }
    return a;
  }
  public int lastIndexOf(String value){
    for (int i = size; i >=0; i--){
      if ((get(i) != null) && (get(i).equals(value))){
        return i;
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other){
    return (toString().equals(other.toString()) );
  }


}
