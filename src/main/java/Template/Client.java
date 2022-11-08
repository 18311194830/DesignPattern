package Template;

public class Client {
    public static void main(String[] args) {
        GameAbstract cricket = new Cricket();
        cricket.play();
        GameAbstract football = new Football();
        football.play();
    }
}
