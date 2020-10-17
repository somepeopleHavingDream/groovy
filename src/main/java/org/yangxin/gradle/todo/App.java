package org.yangxin.gradle.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author yangxin
 * 2020/10/15 20:47
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            logger.info(i + ". please input todo item name: ");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            logger.info("todoItem: [{}]", todoItem);
        }
    }
}
