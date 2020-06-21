package List;


import List.ListHome.ListElement;
import List.ListActions.ListManage;
import List.Multiply.multiply;
import List.Filter.filter;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Filter;

public class Myclass {



    public static void main(String[] arg){

        String text = JOptionPane.showInputDialog("Enter the size of list");
          int N=Integer.parseInt(text);

        ListElement first=null;
          for(int i=0; i<N;i++){

              int value=new Random().nextInt(10);

               first=ListManage.insert(first, value);

          }

       Myclass2 myclass2=new Myclass2();


          myclass2.viewList(first);


            int result = multiply.multi(first);

         JOptionPane.showMessageDialog(null, "The result is "+result);
    }

}



class Myclass2{

    public void viewList(ListElement first){

        ListElement p=first;
        while(p!=null){
            System.out.print(p.getValue()+ " ");
            p=p.getNext();
        }

    }



}