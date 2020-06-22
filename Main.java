package App;


import App.Action.AddNode;
import App.ComplexNode.DevideNode;
import App.Leaf.leaf;




public class Main {

    private static AbstractNode generateFirst() {
        return new AddNode(
                new DevideNode(new leaf(5), new leaf(1)),
                new DevideNode(new leaf(0), new AddNode(new leaf(15),new leaf(2))));



    }

    private static AbstractNode generateSecond() {
        return new DevideNode(
                new AddNode(new leaf(5), new leaf(2)),
                new AddNode(new leaf(7), new leaf(3)));

    }

    public static void main(String[] arg){

        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();

        System.out.println("Output of the Tree");
        System.out.println();
        View(first);
        System.out.println();
        View(second);
        System.out.println();
        System.out.println("The first Value is: " + first.calculate());
       System.out.println("The second Value is: " + second.calculate());



    }

    static void View(AbstractNode tree){
        if(tree!=null){
            System.out.println(tree);
        }
      else{
            System.out.println("Tree is empty");
        }
    }



}
