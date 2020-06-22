package App.Leaf;

import App.AbstractNode;

public class leaf implements AbstractNode {

    private final int value;


    public leaf(int value) {

        this.value = value;
    }

    public double calculate(){
    return value;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }




}
