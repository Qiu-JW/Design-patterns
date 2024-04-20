package com.priniciples.opening_and_closing;

public class Client {
    public static void main(String[] args) {
        // 搜狗输入发对象
        SougouInput input = new SougouInput();
        // 用户1的皮肤对象
        User1Skin user1Skin = new User1Skin();
        // 用户2的皮肤对象
        User2Skin user2Skin = new User2Skin();

    //    当我们要显示使用皮肤的时候，只要调用搜狗输入法对象的方法
    //    使用用户一的输入法对象
        input.setSkin(user1Skin);
        //显示用户一皮肤
        input.display();

        System.out.printf("接下来是用户2的皮肤\n");
    //     显示用户2的皮肤
        input.setSkin(user2Skin);
        input.display();

    }
}
