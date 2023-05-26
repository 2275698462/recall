class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1���ṩָ���߳��������̳߳�
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service; //����ת�ͣ�ǿת

        //�����̳߳ص�����
        System.out.println(service.getClass());//����������ThreadPoolExecutor
        service1.setCorePoolSize(15);//�ı��̳߳صĴ�С

        //2��ִ��ָ�����̳߳ز�������Ҫ�ṩRunnable��Callable�ӿ�ʵ����Ķ���
        service.execute(new NumberThread());//�ʺ�ʹ����Runnable
        service.execute(new NumberThread1());//�ʺ�ʹ����Runnable

//        service.submit(Callable callable);//�ʺ�ʹ����Callable

        service.shutdown();//3���ر��̳߳�



    }
}