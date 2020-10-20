package com.cube.rjava.controller;

import org.rosuda.JRI.Rengine;

/**
 * Author: 滕飞
 * Created: 2019-10-31 15:24
 * Description:
 */
public class MainController {

    public static void main(String[] args) {
        Rengine re = new Rengine(new String[] {"--vanilla"},false,null);

        if (!re.waitForR()) {
            System.out.println("Cannot load R");
            return;
        }
        System.out.println(re.eval("apple <- c('red','green',\"blue\")"));
        System.out.println(re.eval("class(apple)"));
    }
}
