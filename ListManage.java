package List.ListActions;

import List.ListHome.ListElement;

public class ListManage {


    public static ListElement insert(ListElement first, int value){

        if(first==null)
            return new ListElement(value);
       else
        {
           ListElement p=new ListElement(value);
            p.setNext(first);
        return p;
        }


    }

}
