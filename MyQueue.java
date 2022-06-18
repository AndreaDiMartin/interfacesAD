import main.MyQueueInterface;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MyQueue implements MyQueueInterface {

    private ArrayList<Integer> queue;

    public MyQueue(){
        this.queue = new ArrayList<>(0);
    }

    @Override
    public void add(int item) {
       queue.add(item);
    }

    @Override
    public Integer peek() {
        if(queue.size()>0){
            return queue.get(0);
        }
        return null;
    }

    @Override
    public Integer poll() {
        if(queue.size()>0){
            int valueToReturn = queue.get(0);
            queue.remove(0) ;
            return valueToReturn;
        }
        return null;
    }
}