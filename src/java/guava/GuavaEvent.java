package guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEvent {
    private  static  final  String  Name = "Gper社区提问区";

    /**
     * 接受事件监听，Stirng 和Object 类型的
     * @param str
     */
    @Subscribe
    public void subscribe(String str){
        System.out.println(Name+"中" + str +"老师收到提问");
    }
}
