public class calcu {
    static boolean isDigit(char ch){ return ch >= '0' && ch <= '9'; } //check number
    static boolean isLetter(char ch){ return (ch >= 'A' && ch <= 'Z') //check operand
    || (ch >= 'a' && ch <= 'z'); }

    static int getVariableValue(char variable, char[] variableNames, int[] variableValues){
        for (int i = 0 ; i < variableNames.length ; i++) 
            if (variableNames[i] == variable) 
                return variableValues[i];
        throw new RuntimeException("do not find veriable" + variable);
    }

    int powInt(int base, int exponent){
        if (exponent < 0) throw new RuntimeException("ERROR pow ^ - ");
        int result = 1;
        while (exponent > 0){
            if ((exponent & 1) == 1) result *= base;
            base *= base;
            exponent >>= 1;
        }
        return result;
    }

    int evaluatePostfixWithVariables(String postfix, char[] variableNames, int[] variableValues){
        DStack stack = new DStack() ;

        for (int index = 0 ; index < postfix.length(); ){ 
            char token = postfix.charAt(index);

            // ข้ามช่องว่าง (รองรับตัวเลขหลายหลักคั่นด้วย space)
            if (token == ' ' || token == '\t'){ index++; continue; }

            if (isLetter(token)){
                token = Character.toLowerCase(token) ; /*แปลตัวใหญ่เป็นเล็ก */

                stack.push(getVariableValue(token, variableNames, variableValues));
                index++;
            } else if (isDigit(token)){
                // อ่านเลขหลายหลัก
                int endIndex = index;
                while (endIndex < postfix.length() && isDigit(postfix.charAt(endIndex))) 
                    endIndex++  ;
                int number = Integer.parseInt(postfix.substring(index, endIndex))   ;
                stack.push(number);
                index = endIndex;
            } else {
                /* เจอ operator pop 2 ตัว*/
                int rightOperand = stack.pop().info;
                int leftOperand  = stack.pop().info;
                
                int result;

                if      (token == '+') result = leftOperand + rightOperand;
                else if (token == '-') result = leftOperand - rightOperand;
                else if (token == '*') result = leftOperand * rightOperand;
                else if (token == '/'){
                    if (rightOperand == 0) throw new ArithmeticException("หารด้วยศูนย์");
                    result = leftOperand / rightOperand; // แบ่งจำนวนเต็ม
                }
                else if (token == '^') result = powInt(leftOperand, rightOperand);
                else throw new RuntimeException("operator ไม่รองรับ: " + token);

                stack.push(result);
                index++;
            }
        }
        return stack.pop().info;
    }

    
}