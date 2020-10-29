package org.zhangzhuo.sta;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/24
 */
public class XiaoMing implements Hope{
    public void mal() {
        System.out.println("我是小明,进入执行阶段");
    }

    static class Proxy implements Hope{
        private XiaoMing xiaoMing;

        public Proxy(XiaoMing xiaoMing){
            this.xiaoMing = xiaoMing;
        }

        public void mal() {
            System.out.println("开始");
            xiaoMing.mal();
            System.out.println("结束");
        }
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new XiaoMing());
        proxy.mal();
    }
}
