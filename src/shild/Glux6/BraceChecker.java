 package shild.Glux6;
public class BraceChecker {
    Stack stack=new Stack();

        private String text;{
            text="asd[asd{dsa}as)";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                switch (c) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(c);
                        break;
                    case ')':
                    case '}':
                    case ']':
                        if (!text.isEmpty()) {
                            char popChar = (char) stack.pop();
                            if ((c == '}' && popChar != '{') || (c == ']' && popChar != '[') || (c == ')' && popChar != '('))
                                System.out.println(" Error char " + c + " at : " + i);
                        } else {
                            System.out.println(" Error char " + c + " at : " + i);
                        }
                        break;
                    default:
                        break;
                }
            }
            if (!text.isEmpty())
                System.out.println("Error :");
        }
}
