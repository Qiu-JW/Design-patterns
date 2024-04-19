package com.priniciples.LawOfDemeter;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Client {
    public static void main(String[] args) {
        Agent agent=new Agent();
        Fans fans = new Fans("粉丝一");
        Star star = new Star("Qiu");
        Company company=new Company("公司1");

        // 由经纪人 也就是Agent方法来链接 粉丝公司明星
        agent.setFans(fans);
        agent.setStar(star);
        agent.setCompany(company);

        agent.meeting();//和粉丝见面
        agent.business();//和媒体公司洽谈业务
    }
}
