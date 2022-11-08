package Template;

public class Cricket extends GameAbstract{
    @Override
    void initialize() {
        System.out.println("=================游戏初始化==================");
        System.out.println("初始化游戏数据");
        System.out.println("等待确认");
        System.out.println("加载游戏资源");
    }

    @Override
    void startPlay() {
        System.out.println("=================开始游戏==================");
        System.out.println("比赛双方准备就绪……");
        System.out.println("比分为：1:0");
        System.out.println("比分为：1:1");
        System.out.println("比分为：2:1");
        System.out.println("比分为：2:2");
        System.out.println("比分为：3:2");
        System.out.println("时间到");

    }

    @Override
    void endPlay() {
        System.out.println("=================游戏结束==================");
        System.out.println("victory! 赢了");
    }
}
