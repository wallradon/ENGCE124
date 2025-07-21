package  queue ;


import java.util.Random;

public class inputdata {

    String queue_id;
    String name;
    String number_table;
    String date;
    String time;

    private static int nextQueueNumber = 1;

    public inputdata() {
        this("unknown", "0", "dd/mm/yyyy", "hh:mm");
    }

    public inputdata(String name, String number_table, String date, String time) {
        this.queue_id = generateQueueID(number_table);
        this.name = name;
        this.number_table = number_table;
        this.date = date;
        this.time = time;
    }

    private static String generateQueueID( String number_table ) {
        int tableNum = Integer.parseInt(number_table) ; // แปลงจาก String เป็น int
        String id = String.format("#Q%03d%02d", nextQueueNumber, tableNum );
        nextQueueNumber++;
        return id;
    }
}
