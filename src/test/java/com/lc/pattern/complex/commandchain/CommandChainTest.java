package com.lc.pattern.complex.commandchain;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandChainTest {
    @Test
    public void testCommandChain() throws IOException {
        Invoker invoker = new Invoker();
        while(true){
            //UNIX下的默认提示符号
            System.out.print("#");
            //捕获输入
            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if(input.equals("quit") || input.equals("exit")){
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}