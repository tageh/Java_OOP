package kompendium;

interface MyList<T>{
    int size();
    void add(T data);
    T get(int pos);
    T remove(T data);
    void printList();
}

class GenericLikedListDemo<T> implements MyList<T>{
    Node first;
    Node last;

    public T get(int pos) {
       Node current = first; 

       for(int i = 0; i < pos; i++){
           current = current.next;
       }

       return current.data;
    }

    public int size(){    
        if(first==null){
            return 0;
        }

        int count = 0;

        Node current = first;
        
        while(current != null){
            count +=1;
            current = current.next;
        }

        return count;
    }

    public void add(T data){
        Node newNode = new Node(data);

        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }

    public void printList(){
        if(first==null){
            System.out.println("List is empty");
        }

        Node current = first;
        
        while(current != null){
            T data = current.data;
            System.out.println(data);
            current = current.next;
        }
    }

    public T remove(T data){
       if(first.data.equals(data)){
           Node current = first;
           first = current.next;
           current = null;
       }else{
           Node current = first.next;
           Node prev = first;

           while(current != null){
               if(current.data.equals(data)){
                   prev.next = current.next;
                   current = null;
               }
               prev = current;
               current = current.next;
           }
       } 
       return data;
    }

    class Node{
        
        Node next = null;
        T data;
        
        Node(T data){
            this.data = data;
        }


    }
}
