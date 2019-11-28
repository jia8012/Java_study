package 图书管理系统;

public class TeacherUser extends User {
    @Override
    public void menu() { //菜单
        System.out.println("1. 上架图书");
        System.out.println("2. 下架图书");
        System.out.println("3. 现有图书");
    }

    @Override
    public void operation(int select) {  //菜单的选择
        switch (select) {
            case 1:
                //addBook();  //上架
                break;
            case 2:
                //removeBook();  //下架
                break;
            case 3:
                //listBook();
                break;
        }
    }
}
