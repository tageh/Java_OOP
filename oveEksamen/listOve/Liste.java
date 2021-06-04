//FIO list which is generic

class Liste<T>{
    class Node{
        Node next = null;
        T data;

        Node(T data){
            this.data = data;
        }
    }
    
    Node first;
    Node last;

    void add(T data){
        Node newNode = new Node(data); 
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }

    int sizeList(){
        if(first == null){
            return 0;
        }

        int count = 0;

        Node current = first;
        while(current != null){
            count+=1;
            current = current.next;
        }
        return count;
    }

    T get(int pos){
        Node current = first;
        
        for(int i = 0; i<pos; i++){
            current = current.next;
        }
        return current.data;
    }

    T remove(){
        if(first == null){
            return null;
        }

        T object = first.data;

        if(first.next != null){
            first = first.next;
        }else{
            first = null;
            last = null;
        }

        return object;
    }

    void printList(){
        if(first == null){
            System.out.println("The list is empty");
        }

        Node current = first;

        while(current != null){
            T data = current.data;
            System.out.println(data);

            current = current.next;
        }
    }
}
