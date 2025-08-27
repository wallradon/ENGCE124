package  queue ;

import java.util.Arrays;

public class ArrayList {

    inputdata[] arr;
    int count;

    public ArrayList() {
        this(5);
        System.out.println("List created.") ;
    }

    public ArrayList(int x) {
        arr = new inputdata[x] ;
    }

    void add(inputdata item) {
        if (size() == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2) ;
        }
        arr[count] = item ; //วางข้อมูลใหม่ในindex สุดท้าย
        count++ ;//ขยายindex
    }

    int search(String queue_id) {
        inputdata temp = new inputdata() ;      
        temp.queue_id = queue_id ;

        if (count == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + 1) ; // เพิ่มที่
        }//end if

        arr[count] = temp ; // วาง ที่ตำแหน่งสุดท้าย

        int i = 0 ;
        while (!arr[i].queue_id.equals(queue_id)) {//loop หา queue_id ที่ต้องการหา
            i++ ;
        }//end while

        if (i == count) {
            return -1 ; // ไม่พบ
        } else {
            return i ; // พบที่ตำแหน่ง i
        }//end if
    }//end method

    void insert(int k, inputdata item) {
        if (k < 0 || k > count) {//เช็คว่าค่ามากกว่า index 
            System.out.println("Invalid insert position");
            return ;
        }//end if

        if (count == arr.length) { //ขยาย
            arr = Arrays.copyOf(arr, arr.length * 2);
        }//end if

        int j = count ;
        while (j > k) {
            arr[j] = arr[j - 1] ; //เอา index 2 ไปใส่ index 1 , index 3 to 2
            j--;
        }//end loop

        arr[k] = item ;
        count++ ;
    }

    void delete(String queue_id) {
        int index = search(queue_id) ;  

        if (index == -1) {
            System.out.println("Queue ID not found: " + queue_id);
            return ; //exit method
        }

        for (int j = index; j < count - 1; j++) {
            arr[j] = arr[j + 1] ; //เอา index 2 ไปใส่ index 1 , index 3 to 2
        }

        arr[count - 1] = null;  // ล้างข้อมูลตัวสุดท้าย
        count-- ; //ลดจำนวน index
        
    }

    int size() {
        return count;
    }

    void show() {
        for (int i = 0; i < count; i++) {
            System.out.println("Queue: " + arr[i].queue_id
                    + ", Name: " + arr[i].name
                    + ", Table: " + arr[i].number_table
                    + ", Date: " + arr[i].date
                    + ", Time: " + arr[i].time);
        }//end for
    }//end void show

    public inputdata searchDuplicate(String queue_id, String name, String number_table, String date, String time) {
        for (int i = 0; i < count; i++) {
            if ( arr[i].queue_id.equals(queue_id) && arr[i].name.equals(name) && arr[i].number_table.equals(number_table)
                    && arr[i].date.equals(date)
                    && arr[i].time.equals(time)) {
                return null ; // พบข้อมูลชุดเดียวกัน
            }else if (arr[i].number_table.equals(number_table)
                    && arr[i].date.equals(date)
                    && arr[i].time.equals(time)) {
                return arr[i]; // พบจองซ้ำ
            }//end if
        }
        return null ;
    }

}

