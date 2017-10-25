package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yqh on 2016/10/9.
 */
public class FunctionClass {
    private int firstNum;
    public FunctionClass(int firstNum)
    {
        this.firstNum = firstNum;
    }
    public void doSomething()
    {
        System.out.println(firstNum);
    }
}
