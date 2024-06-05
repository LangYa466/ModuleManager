package cn.langya.module.impl;

import cn.langya.module.Module;

/**
 * @author LangYa
 * @since 2024/6/5 下午8:04
 */

public class TestModule extends Module {

    @Override
    public void onEnable() {
        System.out.println("Enable");
    }

    @Override
    public void onDisable() {
        System.out.println("Disable");
    }

}
