package com.lc.pattern.complex.commandchain;

public class Invoker {
    //执行命令
    public String exec(String commandStr) {
        //定义返回值
        String result = "";
        //首先解析命令
        CommandBO vo = new CommandBO(commandStr);
        //检查是否支持该命令
        Command command = null; // TODO 工厂中根据commandStr拿出对应的Command
        if (command != null) {
            result = command.execute(vo);
        } else {
            result = "无法执行命令，请检查命令格式！";
        }
        return result;
    }
}
