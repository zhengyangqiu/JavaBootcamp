package com.java.oop.expressProject.view;

import java.util.Scanner;

public class Views {

    private Scanner input= new Scanner(System.in);


    //welcome

    public void welcome(){
        System.out.println("welcome to the zhengyang's parcel system");

    }

    //end

    public void bye(){
        System.out.println("see you soon");
    }


    /**
     * choose id
     * @return
     */
    public int menu(){
        System.out.println("Welcome, please choose the option ");
        System.out.println("1.admin");
        System.out.println("2.user");
        System.out.println("0.exit");
        //better than nextint because less bug to get user data input
        String text = input.nextLine(); // choose nextline is better than nextint
        int num=-1;
        try{
            num=Integer.parseInt(text);
        }catch (NumberFormatException e){


        }
        if (num<0 || num>2){
            System.out.println("input mistake,please check");
            return menu();
        }
        return num;

    }
    public int cMenu(){
        System.out.println("Welcome, please choose the option");
        System.out.println("1.enter parcel");
        System.out.println("2.change parcel");
        System.out.println("3.delete parcel");
        System.out.println("4.find all parcel");
        System.out.println("4.exit");


        String text = input.nextLine(); // choose nextline is better than nextint
        int num=-1;
        try{
            num=Integer.parseInt(text);
        }catch (NumberFormatException e){


        }
        if (num<0 || num>4){
            System.out.println("input mistake,please check");
            return cMenu();
        }
        return num;




    }


    public int uMenu(){

        System.out.println("please get parcel");
        System.out.println("please input parcel code");
        String code = input.nextLine();

        int num=-1;
        try{
            num=Integer.parseInt(code);
        }catch (NumberFormatException e){


        }
        if (num<100000 || num>999999){
            System.out.println("input mistake,please check");
            return uMenu();
        }
        return num;





    }


}
