import java.util.Stack;
/*https://www.geeksforgeeks.org/dsa/convert-infix-expression-to-postfix-expression/ */
public class InfixToPostfix {
    
    // ฟังก์ชันเช็คลำดับความสำคัญ (precedence) ของ operator
    static int prec(char c) {
        if (c == '^') return 3;                  // ยกกำลังสูงสุด
        else if (c == '/' || c == '*') return 2; // คูณ/หาร รองลงมา
        else if (c == '+' || c == '-') return 1; // บวก/ลบ ต่ำสุด
        else return -1;                          // ไม่ใช่ operator
    }

    // ฟังก์ชันหลัก แปลง Infix → Postfix
    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();   // เก็บ operator และวงเล็บ
        StringBuilder res = new StringBuilder(); // เก็บผลลัพธ์ postfix

        // วนอ่านทีละตัวอักษรจาก infix
        for (char c : s.toCharArray()) {
            
            // 1) ถ้าเป็น operand (ตัวเลขหรือตัวอักษร) → ต่อท้ายผลลัพธ์ทันที
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } 
            
            // 2) ถ้าเจอ '(' → push ลง stack
            else if (c == '(') {
                st.push(c);
            } 
            
            // 3) ถ้าเจอ ')' → pop จาก stack ต่อท้าย res จนกว่าจะเจอ '('
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop(); // ลบ '(' ทิ้ง ไม่เอามาใส่ใน res
            } 
            
            // 4) ถ้าเจอ operator เช่น + - * /
            else {
                // ถ้า top ของ stack มี operator ที่ precedence >= c
                // → pop ออกมาต่อท้าย res
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    res.append(st.pop());
                }
                // push operator ปัจจุบันลง stack
                st.push(c);
            }
        }

        // หลังจากอ่านหมดแล้ว pop ที่เหลือใน stack ออกมา
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // คืนค่าเป็น String
        return res.toString();
    }

    // main ทดสอบ
    public static void main(String[] args) {
        String exp = "a+b*c";
        System.out.println("InFix = " + exp);
        System.out.println("PostFix = " + infixToPostfix(exp));
    }
}
