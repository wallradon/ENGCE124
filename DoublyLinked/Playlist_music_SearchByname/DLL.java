public class DLL {
    DNode head, tail, chack;
    int count = 0;

    void add(information item) {
        DNode newnode = new DNode();
        newnode.info = item;
        if (count == 0) {
            head = newnode;
            tail = newnode;
            count++;
        } else {
            tail.Rlink = newnode;
            newnode.Llink = tail;
            tail = newnode;
            count++;
        } // end if

        System.out.println();

    }// end add

    void front_ins(information item, String ref) {
        DNode pos = SearchData(ref);
        DNode newnode = new DNode();
        newnode.info = item;
        if (pos != null) {
            if (ref.equals(head.info.name)) {
                newnode.Rlink = head;
                head.Llink = newnode;
                head = newnode;
                count++;
                System.out.println("insert sucuccd");
                show();
            } else {
                newnode.Rlink = pos;
                newnode.Llink = pos.Llink;
                pos.Llink = newnode;
                newnode.Llink.Rlink = newnode;
                count++;
                System.out.println("insert succeed");
                show();
            } // end if
        } else {
            System.out.println("insert Failed");
        } // end if
    }// end mathod

    void behind_ins(information item, String ref) {
        DNode pos = SearchData(ref);
        DNode newnode = new DNode();
        newnode.info = item;

        if (pos != null) {
            if (ref.equals(tail.info.name)) {
                /* behind head */
                tail.Rlink = newnode;
                newnode.Llink = tail;
                tail = newnode;
                count++;
            } else {
                newnode.Rlink = pos.Rlink;
                newnode.Llink = pos;
                pos.Rlink.Llink = newnode;
                pos.Rlink = newnode;
                count++;
            } // end if
            System.out.println("insert succeed");
        } // end if

    }// end mathod

    void remove(String pos) {
        // ลบหัว
        DNode ref = SearchData(pos);
        if (ref == null) {
            System.out.println("Don't have data ! ");
            return;
        }
        if (pos.equals(head.info.name)) {
            // ลบหัว
            if (count > 1) {
                head = ref.Rlink;
                head.Llink = null;
                count--;
            } else if (count == 1) {
                head = null;
                tail = null;
                count--;
            } // end if
        } else if (pos.equals(tail.info.name)) {
            // ลบท้าย
            tail = ref.Llink;
            tail.Rlink = null;
            count--;
        } else {
            ref.Llink.Rlink = ref.Rlink;
            ref.Rlink.Llink = ref.Llink;
            ref.Rlink = null;
            ref.Llink = null;
            count--;
        } // end if
    }// end mathod

    void show() {
        chack = head;
        int number = 0;

        if (chack == null) {
            System.out.println("Node don't have data");
            return;
        } // end if
        System.out.println();
        while (chack != null) {
            number++;
            System.out.println(number + ". Music name : " + chack.info.name);
            chack = chack.Rlink;
        } // end loop
        System.out.println();
    }// end mathod

    void showAll() {
        chack = head;
        int number = 0;

        if (chack == null) {
            System.out.println("Node don't have data");
            return;
        } // end if
        System.out.println();
        while (chack != null) {
            number++;
            System.out.println(
                    number + ". " +
                    "Name: " + chack.info.name + " | " +
                    "Artist: " + chack.info.artist + " | " +
                    "Album: " + chack.info.album + " | " +
                    "Length: " + chack.info.length
            ) ;
            chack = chack.Rlink;
        } // end loop
        System.out.println();
    }// end mathod

    DNode SearchData(String ref) {
        DNode node;
        node = head;
        if (node == null) {
            return null;
        } // end if
        for (int i = 0; i < count; i++) {
            if (ref.equals(node.info.name)) {
                return node;
            }
            node = node.Rlink;
        } // end for
        return null;
    } // end mathod

}// end class
