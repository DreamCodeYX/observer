package guava;

import com.google.common.eventbus.Subscribe;

public class Student {
    private  static  final  String  Name = "Gper社区提问区";
    @Subscribe
    public void subscribe(String str){
        System.out.println(Name  +  "发起提问");
    }
}
