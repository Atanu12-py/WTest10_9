package org.wtest;

import org.springframework.stereotype.Component;

//@Component
public class GetMap {
    public String str;

    public GetMap(){
        System.out.println("This is weekly test");
    }

    public GetMap(String msg){
        str=msg;
        System.out.println(str);
    }
}
