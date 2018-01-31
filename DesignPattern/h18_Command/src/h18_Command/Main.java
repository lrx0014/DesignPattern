package h18_Command;

import java.util.ArrayList;

public class Main {

}

/**
 * 菜单栏
 * @author gong
 *
 */
class Menu {

    private ArrayList<MenuItem> MenuItemsList = new ArrayList<MenuItem>();
    //添加菜单项
    public void addMenuItem(MenuItem item){
        this.MenuItemsList.add(item);
    }
    //获得菜单项
    public MenuItem getMenuItem(String itemName){
        for(int i=0;i<MenuItemsList.size();i++){
            if(MenuItemsList.get(i).getItemName().equals(itemName)){
                return MenuItemsList.get(i);
            }
        }
        return null;
    }

}

/**
 * 菜单项
 * @author gong
 *
 */
class MenuItem {
    private ICommand command;
    private String itemName;
    public MenuItem(String itemName,ICommand command) {
        this.command = command;
        this.itemName = itemName;
    }
    public ICommand getCommand() {
        return command;
    }
    public void setCommand(ICommand command) {
        this.command = command;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void click(){
        System.out.println("MenuItem中的"+this.itemName+"被执行");
        this.command.excute();
    }
}

/**
 * 公告板系统界面类
 * @author gong
 *
 */
class BoardScreen {

    public void open() {
        System.out.println("公告板系统界面类中open()被调用");
    }
    public void create() {
        System.out.println("公告板系统界面类中create()被调用");
    }
    public void edit() {
        System.out.println("公告板系统界面类中edit()被调用");
    }

}

/**
 * 命令
 * @author gong
 *
 */
interface ICommand {
    /**
     * 执行方法
     */
    public void excute();
}

/**
 * 创建指令
 * @author gong
 *
 */
class CreateCommand implements ICommand {

    private BoardScreen  BoardScreen;

    @Override
    public void excute() {
        BoardScreen.create();
    }

    public CreateCommand(BoardScreen boardScreen) {
        this.BoardScreen = boardScreen; 
    }
}

/**
 * 打开指令
 * @author gong
 *
 */
class OpenCommand implements ICommand {

    private BoardScreen  BoardScreen;

    @Override
    public void excute() {
        BoardScreen.open();
    }

    public OpenCommand(BoardScreen boardScreen) {
        this.BoardScreen = boardScreen; 
    }
}

/**
 * 编辑指令
 * @author gong
 *
 */
class EditCommand implements ICommand {

    private BoardScreen  BoardScreen;

    @Override
    public void excute() {
        BoardScreen.edit();
    }

    public EditCommand(BoardScreen boardScreen) {
        this.BoardScreen = boardScreen; 
    }
}