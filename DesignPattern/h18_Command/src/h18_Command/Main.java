package h18_Command;

import java.util.ArrayList;

public class Main {

}

/**
 * �˵���
 * @author gong
 *
 */
class Menu {

    private ArrayList<MenuItem> MenuItemsList = new ArrayList<MenuItem>();
    //��Ӳ˵���
    public void addMenuItem(MenuItem item){
        this.MenuItemsList.add(item);
    }
    //��ò˵���
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
 * �˵���
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
        System.out.println("MenuItem�е�"+this.itemName+"��ִ��");
        this.command.excute();
    }
}

/**
 * �����ϵͳ������
 * @author gong
 *
 */
class BoardScreen {

    public void open() {
        System.out.println("�����ϵͳ��������open()������");
    }
    public void create() {
        System.out.println("�����ϵͳ��������create()������");
    }
    public void edit() {
        System.out.println("�����ϵͳ��������edit()������");
    }

}

/**
 * ����
 * @author gong
 *
 */
interface ICommand {
    /**
     * ִ�з���
     */
    public void excute();
}

/**
 * ����ָ��
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
 * ��ָ��
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
 * �༭ָ��
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