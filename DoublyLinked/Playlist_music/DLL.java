public class DLL {
    DNode head, tail, chack;
    int count = 0;

    void add(String item) {
        DNode newnode = new DNode();
        newnode.info = item; // newnode data
        if (count == 0) { // if node don't have data
            head = newnode; // first data = newnode
            tail = newnode;
            count++;
        } else {
            tail.Rlink = newnode; // front node -> newnode
            newnode.Llink = tail; // frontNode <- newNode
            tail = newnode; // let newNode be last Node
            count++;
        } // end if

        System.out.println("Count = " + count);

    }// end add

    void front_ins(String item, int ref) {
        DNode pos = SearchData(ref);
        DNode newnode = new DNode();
        newnode.info = item;
        if (pos != null) {
            if (ref == 1) {
                newnode.Rlink = head;
                head.Llink = newnode;
                head = head.Llink;
                count++;
                System.out.println("insert sucuccd");
                show();  
            }else{
                newnode.Rlink = pos ;
                newnode.Llink = pos.Llink ;
                pos.Llink = newnode ;
                newnode.Llink.Rlink = newnode ;
                count++ ;
                System.out.println("insert sucuccd");
                show(); 
            } // end if
        } else {
            System.out.println("insert Failed");
        } // end if
    }// end mathod

    void behind_ins(String item, int ref) {
        DNode pos = SearchData(ref);
        DNode newnode = new DNode();
        newnode.info = item;
        if (pos != null) {
            if (ref == count && count == 1 || ref == count && count > 1) {
                /* behind head */
                tail.Rlink = newnode; // front node -> newnode
                newnode.Llink = tail; // frontNode <- newNode
                tail = newnode; // let newNode be last Node
                count++;
            } else {
                newnode.Rlink = pos.Rlink;
                newnode.Llink = pos;
                pos.Rlink.Llink = newnode;
                pos.Rlink = newnode;
                count++;
            }
        }

    }

    void remove(int pos) {
        // ลบหัว
        DNode ref = SearchData(pos);
        if (pos == 1) {
            if (count > 1) {
                head = ref.Rlink;
                head.Llink = null;
                count--;
            } else if (count == 1) {
                head = null;
                tail = null;
                count--;
            }
        } else if (pos == count) {
            // ลบท้าย
            tail = ref.Llink;
            tail.Rlink = null;
            count--;
        } else {
            System.out.println("Data = " + ref.info);
            ref.Llink.Rlink = ref.Rlink;
            ref.Rlink.Llink = ref.Llink;
            ref.Rlink = null;
            ref.Llink = null;
            count--;
        } // end if
    }

    void show() {
        chack = head;
        int number = 0;

        if (chack == null) {
            System.out.println("Node don't have data");
            return;
        }
        System.out.println("___________________________________");
        while (chack != null) {
            number++;
            System.out.println(number + "." + chack.info);
            chack = chack.Rlink;
        }
        System.out.println("___________________________________");
    }

    DNode SearchData(int ref) {
        DNode node;
        node = head;
        int pos = ref - 1;
        if (ref > count || ref < 1) {
            return null;
        } // end if
        for (int i = 0; i < pos; i++) {
            node = node.Rlink;
        } // end for
        return node;
    } // end mathod

}// end class
