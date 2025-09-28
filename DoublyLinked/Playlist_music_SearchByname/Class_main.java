public class Class_main {
    public static void main(String[] args) {
        SelectMode mode = new SelectMode() ;
        mode.select() ;
    }//end main
}//end class
 

// public class Class_main {
//     public static void main(String[] args) {
//         DLL D = new DLL();

//         //  Test 1: Add เพลงลงท้ายรายการ
//         System.out.println("=== Test 1: Add ===");
//         D.add(new information("SongA", "ArtistA", "AlbumA", "3:20"));
//         D.add(new information("SongB", "ArtistB", "AlbumB", "4:10"));
//         D.showAll();

//         // Test 2: Insert เพลงก่อนชื่อที่กำหนด หน้าเพลงที่ สุดท้าย
//         System.out.println("=== Test 2: Insert Before SongB ===");
//         D.front_ins(new information("SongX", "ArtistX", "AlbumX", "2:30"), "SongB");
//         D.showAll();

//         // Test 3: Insert เพลงหลังชื่อที่กำหนด หลังเพลงแรก
//         System.out.println("=== Test 3: Insert After SongA ===");
//         D.behind_ins(new information("SongY", "ArtistY", "AlbumY", "5:00"), "SongA");
//         D.showAll();

//         // Test 4: Remove เพลงที่หัว
//         System.out.println("=== Test 4: Remove SongA ===");
//         D.remove("SongA");
//         D.showAll();

//         // Test 5: Remove เพลงที่ไม่มีในลิสต์
//         System.out.println("=== Test 5: Remove SongZ (not exist) ===");
//         D.remove("SongZ");
//         D.showAll();

//         // Test 6: ลบทุกเพลงจนลิสต์ว่าง
//         System.out.println("=== Test 6: Remove all ===");
//         D.remove("SongX");
//         D.remove("SongY");
//         D.remove("SongB");
//         D.showAll(); // ควรขึ้น "Node don't have data"
//     }
// }
