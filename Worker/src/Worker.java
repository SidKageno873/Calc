public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            try {
                if (i == 33) {
                    throw new RuntimeException("Something went wrong");
                }
                callback.onDone("Task " + i + " is done");
            } catch (RuntimeException e) {
                errorCallback.onError("Task " + i + " failed: " + e.getMessage());
            }
        }
    }
}