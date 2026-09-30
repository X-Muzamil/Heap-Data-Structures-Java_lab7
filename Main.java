class Heap{
    int[] heap;
    int size;
    int capacity;
    
    
    Heap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }
    
    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap is overflow!");
            return;
        }
        
        heap[size] = value;
        size++;
        int current = size;
        shiftup(current);
    }
    
    public void shiftup(int data){
        int current = data;
        
        while(size != capacity){
            int parent = (current - 1)/2;
            
            if(heap[current] > heap[parent]){
                int temp = heap[current];
                heap[current] = heap[parent];
                heap[parent] = temp;
                
                temp = parent;
            }
        }
    }

    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i] + "->");
        }
    }
}

class Main{

    public static void main(String[] args) {
        Heap h = new Heap(7);
        h.insert(5);
        h.insert(15);
        h.insert(25);
        h.insert(35);
        h.insert(45);
        h.display();
    }
}