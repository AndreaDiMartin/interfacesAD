import main.MyStackInterface;
import java.util.ArrayList;

public class MyStackArrayList implements MyStackInterface {

    private ArrayList<Integer> stack;

    public MyStackArrayList() {
        this.stack = new ArrayList<>(0);
    }

    @Override
    public void push(int item) {
        stack.add(item);
    }

    @Override
    public Integer pop() {
        if (stack.size() > 0) {
            int valueToReturn = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return valueToReturn;
        }
        return null;
    }


    @Override
    public Integer peek() {
        if (stack.size() > 0) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }
}