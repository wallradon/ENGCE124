package  queue ;


import java.util.Arrays;

public class ArrayCollection {
    inputdata[] arr ; //data 
    int count ; //index

    public ArrayCollection() {
        this(5);// min index
        System.out.println("HI am ready Collection created.");
    }

    public ArrayCollection(int x) {
        arr = new inputdata[x];
    }

  
    void add(inputdata item) {
        if (size() == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2); 
        }
        arr[count] = item ;
        count++ ;
    }

    
    void remove(String queue_id) {
        int index = search(queue_id);
        String name = arr[index].name;
        String number_table = arr[index].number_table;
        String date = arr[index].date;
        String time = arr[index].time;
        
        if (index < count) {
            arr[index] = arr[count - 1]; // ย้ายตัวท้ายมาแทนที่
            arr[count - 1] = null;       // เคลียร์ช่องเก่า
            count--;
        }
        for (int i = 0; i < count; i++) { //ลบ duplicate data
            if ( arr[i].name.equals(name)
                    && arr[i].number_table.equals(number_table)
                    && arr[i].date.equals(date)
                    && arr[i].time.equals(time)) { 
                arr[i] = arr[count - 1]; // ย้ายตัวท้ายมาแทนที่
                arr[count - 1] = null;       // เคลียร์ช่องเก่า
                count--;
            }
        }
    }

    int search(String queue_id) {
        for (int i = 0; i < count; i++) {
            if (arr[i].queue_id.equals(queue_id)) { //data this same variable 
                return i ;
            }
        }
        return count ; // can not search  
    }
    
    void show() {
        for (int i = 0 ; i < count; i++) {
            System.out.println("Queue: " + arr[i].queue_id
                    + ", Name: " + arr[i].name
                    + ", Table: " + arr[i].number_table
                    + ", Date: " + arr[i].date
                    + ", Time: " + arr[i].time ) ;
        }
    }

    int size() {return count;}
}
