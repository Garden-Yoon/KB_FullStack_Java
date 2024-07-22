package org.scoula.todo.command;

import org.scoula.lib.cli.command.Command;
import org.scoula.lib.cli.ui.Input;
import org.scoula.todo.dao.TodoDao;
import org.scoula.todo.dao.TodoListDao;

// 메뉴 5. 삭제 Command 클래스
public class DeleteTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        // 사용자에게 삭제할 todo의 아이디 입력받기
        int id = Input.getInt("삭제할 Todo ID : ");
        dao.delete(id);
        System.out.println();
    }
}
