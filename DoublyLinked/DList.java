
public class DList {
    DNode head, tail, travel,position;
    int count;
    void addFirst(int data){
        DNode newnode = new DNode(data);
        if(count==0){
            append(data);
        }else{
            newnode.Rlink = head;
            head.Llink = newnode;
            head = newnode;
        }
        count++;
    }
    void append(int data) {
        DNode newnode = new DNode(data);
        if (count == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.Rlink = newnode;
            newnode.Llink = tail;
            tail = newnode;
        }
        count++;
    }
    void addNext(int data,int target){
        position = search(target);
        if(position != null){
            if(position == tail){
                append(data);
            }else{
                DNode newnode = new DNode(data);
                newnode.Rlink = position.Rlink;
                newnode.Llink = position;
                position.Rlink.Llink = newnode;
                position.Rlink = newnode;
                count++;
            }      
        }
    }
    void addPrev(int data,int target){
        position = search(target);
        if(position != null){
            if(position == head){
                addFirst(data);
            }else{
                DNode newnode = new DNode(data);
                newnode.Rlink = position;
                newnode.Llink = position.Llink;
                position.Llink.Rlink = newnode;
                position.Llink = newnode;
                count++;
            }      
        }
    }  
    DNode search(int target) {
        travel = head;
        while (travel.info != target && travel != null) {
            travel = travel.Rlink;
        }
        return travel;
    }  
    void showAll() {
        travel = head;
        while (travel != null) {
            System.out.println(travel.info); //INFO(travel)
            travel = travel.Rlink;  //travel = LINK(travel)
        }
        System.out.println("----------------");
    }
}
