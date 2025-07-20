package  My_Project ;

import java.util.Arrays;

public class Set {

    inputdata[] arr;
    int count;

    public Set() {
        this(5);
        System.out.println("Set created.");
    }//end function

    public Set(int x) {
        arr = new inputdata[x];
    }//end function

    

    int add(inputdata item) {
        int i = search(item);

        if (i == 0) {//dupilcate data
            return i ; //can not add data
        }//end if
        if (size() == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }//end if

        arr[count] = item;
        count++;

        return i ;

    }//end function

    void remove(String queue_id) {
        for (int i = 0; i < count; i++) {
            if (arr[i].queue_id.equals(queue_id)) {
                arr[i] = arr[count - 1]; // สลับตัวท้ายมาแทน
                count--;
                return;
            } //end if
        } //end for
    }//end function

    int search(inputdata x) {
        for (int i = 0; i < count; i++) {
            if (arr[i].name.equals(x.name) && arr[i].number_table.equals(x.number_table) && arr[i].date.equals(x.date) && arr[i].time.equals(x.time)) {

                System.out.println("Duplicate bookin");
                return 0 ;  //กรอกซ้ำ

            }//end if

            if (!arr[i].name.equals(x.name) && arr[i].number_table.equals(x.number_table) && arr[i].date.equals(x.date) && arr[i].time.equals(x.time)) {

                System.out.println("Double booking");
                return 2 ;  //โต๊ะซ้ำ แต่เก็บ
            }//end if
            
        }//end for
        return 1 ; //ไม่ซ้ำ
    }//end function

    int size() {
        return count;
    }//end function

    void show() {
        for (int i = 0; i < count; i++) {
            System.out.println("Queue ID: " + arr[i].queue_id
                    + ", Name: " + arr[i].name
                    + ", Table: " + arr[i].number_table
                    + ", Date: " + arr[i].date
                    + ", Time: " + arr[i].time);
        }//end for
    }//end function

    inputdata getLast() { //ค่าล่าสุดใน set
        if (count == 0) {
            return null;
        }//end if
        return arr[count - 1];
    }//end inputdata getLast
}//end class
