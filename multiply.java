package List.Multiply;

import List.ListHome.ListElement;
import List.Filter.filter;

public class multiply {


    public static int multi(ListElement x){


        if(x.getNext()==null){
            if(filter.Odds(x.getValue())){

                return x.getValue();
            }
             else{
                 return 1;
            }
        }
         else{
             if(filter.Odds(x.getValue()))
                 return x.getValue()*multi(x.getNext());
            else
                return multi(x.getNext());
        }

    }



}
