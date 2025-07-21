package  queue ;


import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        ArrayCollection act = new ArrayCollection(); //Collection
        Set ast = new Set(); //Set
        ArrayList arl = new ArrayList(); //list main
        ArrayList list_temp = new ArrayList(); //list list_temp
        Scanner input = new Scanner(System.in); // Scanner

        Boolean exit_pg = true;

        while (exit_pg == true) {
            System.out.print("Command (add, cancel, exit, see) : ");
            String cmd = input.nextLine();

            if (cmd.equalsIgnoreCase("add")) { //add
                System.out.print("Enter name : ");
                String name = input.nextLine();
                name = name.trim();

                System.out.print("Enter Table Number : ");
                String Num_table = input.nextLine();
                Num_table = Num_table.trim();

                System.out.print("Enter Reservation Date (29/07/2025): ");
                String date = input.nextLine();
                date = date.trim();

                System.out.print("Enter Time : (17.00, 18.00) : ");
                String times = input.nextLine();
                times = times.trim();

                inputdata data = new inputdata(name, Num_table, date, times);

                act.add(data); // Collection 

                int addedStatus = ast.add(data); //  Set
                System.out.println() ;
                
                if (addedStatus >= 1) {
                    inputdata latest = ast.getLast() ; //ข้อมูลล่าสุดใน set 
                    if (latest != null) {
                        if( addedStatus == 1 ) {//normal data
                            arl.add(latest);   //list 
                        }    
                        if( addedStatus == 2) { //doubel data
                            list_temp.add(latest) ;//list_temp
                        }//end if
                    }//end if
                }//end if

            } else if (cmd.equalsIgnoreCase("cancel")) {

                System.out.print("Enter Queue : ");
                String num_queue = input.nextLine();
                    
                //หา index in main list
                int index = arl.search(num_queue) ; //return index data in list
                
                if (index != -1) {
                    inputdata temp = arl.arr[index] ;//เก็บค่าที่จะลบไว้ก่อน
                    
                    //ลบค่าใน list
                    arl.delete(num_queue);
                    
                    //หาคิวซ้ำ ส่ง number_table, date, time จาก inputdata temp ให้ ast.searchDuplicate
                    inputdata duplicate  = list_temp.searchDuplicate( temp.queue_id, temp.name, temp.number_table, temp.date, temp.time);
                    
                    
                    if ( duplicate  != null ) { //ถ้าเจอซ้ำ
                        arl.insert(index, duplicate );        // แทรกในตำแหน่งเดิม
                        list_temp.delete(duplicate.queue_id) ;
                    }//endif
                    ast.remove(num_queue); //remove data set 
                    act.remove(num_queue); //remove data coll 
                }else{
                        ast.remove(num_queue); //remove data set 
                        act.remove(num_queue); //remove data coll  
                }//end if
                System.out.println();
            } else if (cmd.equalsIgnoreCase("See")) {
                System.out.println("------------------------------------------------");
                System.out.println();
                System.out.println("data in List");
                arl.show();
                System.out.println();
                System.out.println("data in List_Temp");
                list_temp.show(); //show duoble booling
                System.out.println();
                System.out.println("data in set:");
                ast.show() ;//show set
                System.out.println();
                System.out.println("data in Collection") ;
                act.show();//show collection
                System.out.println();
                System.out.println("------------------------------------------------");
            } else if (cmd.equalsIgnoreCase("exit")) {
                System.out.println("Exit Program");
                input.close();// close input
                exit_pg = false; // exit while loop
            }//end if

        }//end While
    }//end main

}
