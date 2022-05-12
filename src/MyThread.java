public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Я поток " + getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.println("Поток " + getName() + " завершён!");
        }
    }
}