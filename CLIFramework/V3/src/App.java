import command.*;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
        // 생성자에서 Menu로 객체 생성해서 초기화
        menu = new Menu();
        // commands 리스트 생성하여 초기화
        commands = new Command[] {
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand(),
        };
    }

    public void executeCommand(int selectNo){
        Command command = commands[selectNo-1];
        command.execute();
    }

    public void run() {
        while(true){
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
