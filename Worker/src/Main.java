public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = error -> System.err.println("ERROR: " + error);

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}