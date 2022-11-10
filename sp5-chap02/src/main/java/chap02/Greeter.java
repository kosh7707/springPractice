package chap02;

public class Greeter {
    private String format;
    public String greet(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format) {
        this.format = format; // "%s, 안녕하세요!" 가 될 예정
    }
}
