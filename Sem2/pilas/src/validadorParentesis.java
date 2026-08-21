public class validadorParentesis {
    public static boolean validar(String string) {
        byStaXx<Character> pila = new byStaXx<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
                }
            }

        return pila.isEmpty();
    }
}
