package chapter9.ex11;

import java.util.Arrays;

public class ClassAnonym {
    public String changeCharacters(String string) {
        Character[] chars = new Character[string.toCharArray().length];
        for (int i = 0; i < string.toCharArray().length; i++) {
            for (int j = i + 2; j <= i + 2; j++) {
                if (j >= string.toCharArray().length && chars[i] == null) {
                    chars[i] = string.toCharArray()[i];
                    break;
                }
                if (chars[i] == null) {
                    chars[i] = string.toCharArray()[j];
                    chars[j] = string.toCharArray()[i];
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        return string;
    }
}
