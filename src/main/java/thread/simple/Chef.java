package thread.simple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Chef {
    private ExecutorService pool = Executors.newFixedThreadPool(5);
    private Waiter waiter;
}
