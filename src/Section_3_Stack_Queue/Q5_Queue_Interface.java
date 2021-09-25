package Section_3_Stack_Queue;
import java.lang.reflect.Method;

public class Q5_Queue_Interface {
    public static void main(String[] args) {
        // method list
        Method[] methodList = Queue.class.getMethods();
        // print information of method
        for (Method m : methodList) {
            System.out.printf("%s(", m.getName());
            Class<?>[] paramTypes = m.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.printf("%s", paramType.getName());
            }
            System.out.printf(") : %s\n", m.getReturnType().getSimpleName());
        }
    }
}

// Finish these methods
interface Queue {
    public void enqueue(int n);
    public Integer dequeue();
    public Integer front();
    public Integer read();
    public boolean isEmpty();
    public boolean isFull();
}
