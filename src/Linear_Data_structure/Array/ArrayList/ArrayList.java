package Linear_Data_structure.Array.ArrayList;



public class ArrayList<T> {
    private int size;
    private int capacity=3;

    private T[] array;

    public ArrayList(){
        this.array= (T[]) new Object[capacity];
    }
    public ArrayList(int capacity){
        this.capacity=capacity;
        this.array=(T[])new Object[capacity];
    }
    public void add(T data){
        if(size>=capacity){
            grow();
        }
        array[size]= data;
        size++;

    }
    public void insert(int index,T data){
            if(size>=capacity){
                grow();
            }
            for(int i=size;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=data;
            size++;
    }
    public void delete(T data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                for(int j=0;j<(size-i-1);j++){
                    array[i+j]=array[i+j+1];
                }
                array[size-1]=null;
                size--;
                if(size<=(int)capacity/3){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(T data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity =capacity*2;
        T[]newArray=(T[])new Object[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        capacity=newCapacity;
        array=newArray;
    }
    private void shrink(){
        int newCapacity =capacity/2;
        T[]newArray=(T[])new Object [newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        capacity=newCapacity;
        array=newArray;
    }
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public String toString(){
//        if(isEmpty()){
//            throw new NoSuchElementException();
//        }
        String v="";
        for(int i=0;i<size;i++){
            v+=array[i]+",";
        }
        if(!v.isEmpty()) {
            v = "[" + v.substring(0, v.length() - 1) + "]";
        }else {
            v="[]";
        }
        return v;
    }
}
