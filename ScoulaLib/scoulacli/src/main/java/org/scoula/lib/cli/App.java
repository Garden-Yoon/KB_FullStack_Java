package org.scoula.lib.cli;

import org.scoula.lib.cli.command.Command;
import org.scoula.lib.cli.command.ExitCommand;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;


public abstract class App {
    Menu menu;

    public App() {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);

        menu.add(new MenuItem("종료", new ExitCommand()));
    }

    public void createMenu(Menu menu) {
    }


    public void run() {
        init();

        while(true){
            try{
                menu.printMenu();
                Command command = menu.getSelect(); // 예외 발생할 수 있음
                command.execute();
            } catch (Exception e){
                e.printStackTrace();
                System.out.println();

            }

        }
    }
}
