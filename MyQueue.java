import main.MyQueueInterface;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MyQueue implements MyQueueInterface {

    private ArrayList<Empleado> queue;

    public MyQueue(){
        this.queue = new ArrayList<>(0);
    }

    @Override
    public void add(Object item) {
       //queue.add(item);
    }

    public void addEmpleado(Empleado item){
        queue.add(item);
    }

    @Override
    public Object peek() {
        if(queue.size()>0){
            return queue.get(0);
        }
        return null;
    }

    @Override
    public Empleado poll() {
        if(queue.size()>0){
            Empleado valueToReturn = queue.get(0);
            queue.remove(0) ;
            return valueToReturn;
        }
        return null;
    }

    public int size(){
        return queue.size();
    }
}