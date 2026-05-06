class L8Q5 extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {

        L8Q5 t1 = new L8Q5();
        L8Q5 t2 = new L8Q5();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}