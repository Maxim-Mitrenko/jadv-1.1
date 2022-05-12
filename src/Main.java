public class Main {

    public static void main(String[] args) {
	    ThreadGroup threadGroup = new ThreadGroup("TreadGroup");
        new MyThread(threadGroup, "1").start();
        new MyThread(threadGroup, "2").start();
        new MyThread(threadGroup, "3").start();
        new MyThread(threadGroup, "4").start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadGroup.interrupt();
    }
}
