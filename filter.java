package List.Filter;

import List.ListHome.ListElement;

public class filter {

public static boolean Odds(int x){

    boolean result=false;


    if(x%3==0 && x!=0)
        result=true;

    return result;
}



}
