package lesson3;

public class Reverse {
    private String string;

    public Reverse(String string) {
        this.string = string;
    }

    private String reverse() {
        if (string.isBlank()) {
            return null;
        }
        MyStack<Character> stack = new MyStack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : string.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getDefaultString() {
        return string;
    }

    public String getReversedString() {
        return reverse();
    }
}
