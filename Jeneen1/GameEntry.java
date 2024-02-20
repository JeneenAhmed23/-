public class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        A[4] = new GameEntry(400);

        GameEntry[] B = A.clone();
        A[4].score = 550;

        System.out.println("A[4] score value: " + A[4].score);
        System.out.println("B[4] score value: " + B[4].score);
    }
}
