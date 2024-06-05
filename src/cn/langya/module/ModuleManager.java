package cn.langya.module;

import cn.langya.module.impl.TestModule;

import java.util.HashMap;

/**
 * @author LangYa
 * @since 2024/6/5 下午8:01
 */

public class ModuleManager {
    private static final HashMap<Module,String> modules = new HashMap<>();

    public static void init() {
        modules.put(new TestModule(),"测试模块");
    }

    public static HashMap<Module,String> getModules() {
        return modules;
    }

}
