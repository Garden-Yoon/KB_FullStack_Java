package ui;

import basic.Input;
import command.Command;

public class Menu {
    MenuItem[] menus;

    // 생성자는 배열의 크기를 전달받아 그 크기대로 생성
    // 메뉴들을 MenuItem 객체로 만들어서 관리해줌
    public Menu(int size) {
        // 메뉴의 개수를 받아와서 메뉴를 초기화해줌
        menus = new MenuItem[size];
    }

    // 메뉴 항목 주입 (DI)
    public void add(int ix, MenuItem item) {
        menus[ix] = item;
    }


    public void printMenu(){
        System.out.println("-------------------------------------------------------");
        // 배열로 일반화
        for (int i = 0; i < menus.length; i++) {
            // menus[i]는 MenuItem의 객체이므로 title만 가져와서 출력
            System.out.printf("%d.%s | " , i+1 , menus[i].getTitle());
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        // Index로 접근해야되기 때문에 -1을 해줌
        // menus에서 MenuItem 객체 하나를 접근해서 Command만 가져온다
        return menus[selectNo-1].getCommand();
    }
}