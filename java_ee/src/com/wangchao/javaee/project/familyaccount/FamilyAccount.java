package com.wangchao.javaee.project.familyaccount;

/**
 * 项目一：家庭收支记账软件
 */
public class FamilyAccount {
    public static void main(String[] args) {
        String details = "收支\t账户金额\t收支金额\t说  明\n";
        int balance = 10000;//初始账户金额
        int amount;//收支金额
        String desc;//收支说明

        boolean loopFlag = true;
        do {
            //界面
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退   出\n");
            System.out.print("                   请选择(1-4)：");

            //获取界面选择
            char key = Utility.readMenuSelection();

            //执行
            switch (key) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    amount = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    desc = Utility.readString();
                    balance += amount;
                    details += "收入\t" + balance + "\t" + amount + "\t" + desc + "\n";
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    amount = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    desc = Utility.readString();
                    balance -= amount;
                    details += "支出\t" + balance + "\t" + amount + "\t" + desc + "\n";
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char yn = Utility.readConfirmSelection();
                    if (yn == 'Y') {
                        System.out.println("感谢使用家庭收支登记软件！");
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }
}
