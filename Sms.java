import java.util.*;
class Sms {
    static Scanner input=new Scanner(System.in);
    static Random r=new Random();
    static String uname ="rvd";
    static String upassword="67";
    static String[][] suppliers=new String [0][2];
    static String[] itemCategory =new String[0];
    static String[] itemCode =new String[0];
    static String[][] seletedSupplierList=new String[0][2];
    static String[] seletedCategoryList=new String[0];
    static String[] description=new String[0];
    static int[] index=new int[0];
    static double[] unitPrice=new double[0];
    static int[] qty=new int[0];
    static Thread t;


    public static void clearConsol() {
       final String os = System.getProperty("os.name");
	   try {
			if (os.equals("Linux")) {
			System.out.print("\033\143");
			}else if (os.equals("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
						System.out.print("\033[H\033[2J");
						System.out.flush();
					}
				} catch (final Exception e) {
						System.err.println(e.getMessage());
		}
    }

    public static String[] growItem() {
        String[] temp=new String[itemCode.length+1];
        for (int i = 0; i <itemCode.length; i++) {
            temp[i]=itemCode[i];
        }
        return temp;
    }

    public static String[] growitemCategory() {
        String[] temp=new String[itemCategory.length+1];
        for (int i = 0; i <itemCategory.length; i++) {
            temp[i]=itemCategory[i];
        }
        return temp;
    }
    public static int[] growIndex() {
        int[] temp=new int[index.length+1];
        for (int i = 0; i <index.length; i++) {
            temp[i]=index[i];
        }
        return temp;
    }
    public static int[] growQty() {
        int[]temp=new int[qty.length+1];
        for (int i = 0; i <qty.length; i++) {
            temp[i]=qty[i];
        }
        return temp;
    }
    public static double[] growUnitPrice() {
        double temp[]=new double[unitPrice.length+1];
        for (int i = 0; i <unitPrice.length; i++) {
            temp[i]=unitPrice[i];
        }
        return temp;
    }
    public static String[] growDescription() {
        String[] temp=new String[description.length+1];
        for (int i = 0; i <description.length; i++) {
            temp[i]=description[i];
        }
        return temp;
    }
    public static String[] growSeletedCategoryList() {
        String[] temp=new String[seletedCategoryList.length+1];
        for (int i = 0; i <seletedCategoryList.length; i++) {
            temp[i]=seletedCategoryList[i];
        }
        return temp;
    }
    public static String[][] growSeletedSupplierList() {
        String[][]temp=new String[seletedSupplierList.length+1][2];
        for (int i = 0; i <seletedSupplierList.length; i++) {
            for (int j = 0; j <seletedSupplierList[i].length; j++) {
                temp[i][j]=seletedSupplierList[i][j];
            }
        }
        return temp;
    }
    public static void lineAimation() {
        System.out.print("+");
        for (int i = 0; i < 39; i++) {
            try {
                Thread.sleep(2);
            } catch(Exception e) {}
            System.out.print("--");
        }
        System.out.println("+");
    }
    public static void lineAimation2() {
        for (int i = 0; i < 39; i++) {
            try {
                Thread.sleep(2);
            } catch(Exception e) {}
        }
    }
    public static void lineAnimation3() {
        for (int i = 0; i < 81; i++) {
            try {
                Thread.sleep(5);
            } catch(Exception e) {};
            System.out.print("\u2588");
        }
    }
    public static void options(String []ar) {
        for (int i = 0; i < ar.length; i++) {
            if((i%2==0) && (i!=0)) {
                System.out.println();
                System.out.println();
            }
            System.out.printf("["+(i+1)+"] %-50s",ar[i]);
        }
    }
    public static int getOption() {
        System.out.print("\n\n\n\n\n\nEnter An Option To Continue : ");
        return input.nextInt();

    }
    public static void welcomePage() {

        System.out.println("\n\n\n\n\n\n");
        lineAimation2();
        System.out.println("\t\t\t     ███████████████████████ \u2122");  lineAimation2();System.out.println("\t\t\t     █▄─▄██▄▄─▄█─▄▄▄▄█▄─▄▄─█");lineAimation2();System.out.println("\t\t\t     ██─██─██─██▄▄▄▄─██─▄█▀█");lineAimation2();System.out.println("\t\t\t     █▄▄▄█▄▄▄▄██▄▄▄▄▄█▄▄▄▄▄█");lineAimation2();System.out.println("\t\t\t     ███████████████████████"); lineAimation2();
     
        System.out.println("\n\n\t\t   Ｓｔｏｃｋ  Ｍａｎａｇｅｍｅｎｔ Ｓｙｓｔｅｍ\n\n\t\t\t           𝚅𝙴𝚁𝚂𝙸𝙾𝙽 𝟷.0\n\n\n\n\n");
        while (true) {
            System.out.print("\t\t\t    Press \"Y\" Key to Continue ");
            char ch = input.next().charAt(0);
            if(ch=='Y' || ch=='y') {
                clearConsol();
                break;
            }
        }
    }
    public static void exitPage() {
        String[] ar = {"\n\n\n\n\n\n\n\t\t\t\tＧ","Ｏ","Ｏ","Ｄ"," "," "," ","Ｂ","Ｙ","Ｅ"," ","！","！"};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            try {
                Thread.sleep(250);
            } catch(Exception e) {}
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t     🅡 🅥 🅓 67\u00A9");
    }
    public static void topicLoginpage() {
        lineAimation();
        System.out.printf("|%45s","Login Page");
        System.out.printf("%33s|\n"," ");
        lineAimation();
    }
    public static void loginPage() {
        System.out.println();
        while (true) {
            System.out.print("User Name : ");
            String name =input.next();
            if(name.equals(uname)) {
                break;
            } else {
                System.out.print("User Name is Invalid. Please Try Again!\n\n");
            }
        }
        while (true) {
            System.out.print("Password  : ");
            String password =input.next();
            if(password.equals(upassword)) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                String[] ar = {"\t\t\t\t  Loading",".",".","."};
				for (int i = 0; i < ar.length; i++) {
					System.out.print(ar[i]);
					try {
						Thread.sleep(250);
					} catch(Exception e) {}
				}
				System.out.println();
                lineAnimation3();
                break;
            } else {
                System.out.print("Password is Invalid. Please Try Again!\n\n");
            }
        }
    }
    public static void topicMainmenu() {
        clearConsol();
        lineAimation();
        System.out.printf("|%59s","WELCOME TO IJSE STOCK MANAGEMENT SYSTEM");
        System.out.printf("%19s|\n"," ");
        lineAimation();
    }
    public static int chooseOption() {
        System.out.print("Choose Option here ");
        return input.nextInt();
    }
    public static void mainmenuOption() {
        System.out.println();
        String[] ar = {"Change the Credentials","Supplier Manage","Stock Mange","Log Out","Exit the System"};
        options(ar);
    }
    public static void topicCredentialManage() {
        clearConsol();
        lineAimation();
        System.out.printf("|%49s","CREDENTIAL MANAGE");
        System.out.printf("%29s|\n"," ");
        lineAimation();
    }
    public static void credentialManage() {
        while (true) {
            while (true) {
                System.out.print("\nPlease enter the user name to verify it's you : ");
                String name=input.next();
                if(name.equals(uname)) {
                    System.out.println("Hey "+name+ " \u270B");
                    break;
                } else {
                    System.out.print("Invalid user name. Try Again!\n\n");
                }
            }
            while (true) {
                System.out.print("\nEnter your current password : ");
                String password =input.next();
                if(password.equals(upassword)) {
                    System.out.print("Enter your New Password     : ");
                    String newpassword=input.next();
                    upassword=newpassword;
                    System.out.println("\nPassword changed Successfully!");
                    System.out.print("Do you want to go home page (Y/N) : ");
                    char ch = input.next().charAt(0);
                    if(ch=='Y' || ch =='y')
                        break;
                } else {
                    System.out.print("Incorrect password . Please Try Again!\n\n");
                }
            }
            break;
        }
    }
    public static void topicSupplierManage() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","SUPPLIER MANAGE");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void supplierManageOption() {
        String[] ar = {"Add Supplier","Update Supplier","Delete Supplier","View Supplier","Search Supplier","Home Page"};
        options(ar);
    }
    public static void topicAddSupplier() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","ADD SUPLIER");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }

    public static String[][] increment(String[][] suppliers) {
        String[][]temp=new String[suppliers.length+1][2];
        for (int i = 0; i <suppliers.length; i++) {
            for (int j = 0; j <suppliers[i].length; j++) {
                temp[i][j]=suppliers[i][j];
            }
        }
        return temp;
    }
    public static void addSupplier() {
        while(true) {
            System.out.print("\nSupplier ID : ");
            suppliers=increment(suppliers);
            suppliers[suppliers.length-1][0]=input.next();

            String id="";
            for (int i = 0; i <suppliers.length; i++) {
                id=suppliers[i][0];
            }
            String id1=suppliers[suppliers.length-1][0];
            int count=0;
            for (int i = 0; i <suppliers.length; i++) {
                if(id1.equals(suppliers[i][0])) {
                    count++;
                }
            }
            while(count>1) {
                System.out.println("already exists. try another supplier id!");
                System.out.print("\nSupplier ID : ");
                suppliers[suppliers.length-1][0]=input.next();

                id="";
                for (int i = 0; i <suppliers.length; i++) {
                    id=suppliers[i][0];
                }

                id1=suppliers[suppliers.length-1][0];
                count=0;
                for (int i = 0; i <suppliers.length; i++) {
                    if(id1.equals(suppliers[i][0])) {
                        count++;
                    }
                }
            }
            System.out.print("Supplier Name : ");
            suppliers[suppliers.length-1][1]=input.next();

            System.out.print("\nAdd Successfully! Do you want to add another supplier (Y/N) ? ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicAddSupplier();
                addSupplier();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void topicUpdateSupplier() {
        clearConsol();
        lineAimation();
        System.out.printf("|%49s","UPDATE SUPLIER");
        System.out.printf("%29s|\n"," ");
        lineAimation();
    }
    public static void updateSupplier() {
        while(true) {
            System.out.print("\nSupplier ID  : ");
            String id=input.next();

            boolean flag=true;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    flag=false;
                    break;
                }
            }
            while(flag) {
                System.out.println("can't find supplier id. try again!");
                System.out.print("\nSupplier ID  : ");
                id=input.next();
                for (int i = 0; i <suppliers.length; i++) {
                    if(id.equals(suppliers[i][0])) {
                        flag=false;
                    }
                }
            }
            int place=0;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    place=i;
                    break;
                }
            }
            System.out.println("\nSupplier ID : "+suppliers[place][0]);
            System.out.println("Supplier Name : "+suppliers[place][1]);

            System.out.print("\nEnter the new supplier name : ");
            suppliers[place][1]=input.next();

            System.out.print("Updated Successfully! Do you want to update another supplier?(Y/N) ");

            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicUpdateSupplier();
                updateSupplier();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void topicDeleteSupplier() {
        clearConsol();
        lineAimation();
        System.out.printf("|%49s","DELETE SUPLIER");
        System.out.printf("%29s|\n"," ");
        lineAimation();
    }
    public static void deleteSupplier() {
        while(true) {
            System.out.print("\nSupplier ID : ");
            String id=input.next();

            boolean flag=true;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    flag=false;
                    break;
                }
            }
            while(flag) {
                System.out.println("can't find supplier id. try again!");
                System.out.print("\nSupplier ID : ");
                id=input.next();
                for (int i = 0; i <suppliers.length; i++) {
                    if(id.equals(suppliers[i][0])) {
                        flag=false;
                    }
                }
            }
            int place=0;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    place=i;
                }
            }
            String[][]temp=new String[suppliers.length-1][2];
            for (int i = 0,k=0; i <suppliers.length; i++) {
                if(place==i) {
                    continue;
                }
                for(int j=0; j<suppliers[i].length; j++) {
                    temp[k][j]=suppliers[i][j];
                }
                k++;
            }
            suppliers=temp;

            System.out.print("delete successfully! Do you want to delete another(Y/N)? ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicDeleteSupplier();
                deleteSupplier();
                break;
            } else if (ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void topicViewSupplier() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","VIEW SUPLIER");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void viewSupplier() {
        while(true) {
            System.out.println("+---------------+-----------------+");
            System.out.printf("|  %-11s  |  %-13s  |%n","SUPPLIER ID","SUPPLIER NAME");
            System.out.println("+---------------+-----------------+");

            for(int i=0; i<suppliers.length; i++) {
                System.out.printf("|  %-11s  |  %-13s  |%n",suppliers[i][0],suppliers[i][1]);
            }
           System.out.println("+---------------+-----------------+");
            System.out.print("\nDo you want to go supplier manage page(Y/N)? ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicSupplierManage();
                supplierManageOption();
                break;
            } else if(ch=='N'||ch=='n') {
                continue;
            }
        }
    }
    public static void topicSearchSupplier() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","SEARCH SUPLIER");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void searchSupplier() {
        while(true) {
            System.out.print("Supplier ID : ");
            String id=input.next();

            boolean flag=true;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    flag=false;
                    break;
                }
            }
            while(flag) {
                System.out.println("can't find supplier id.try again!");

                System.out.print("\nSupplier ID   : ");
                id=input.next();
                for (int i = 0; i <suppliers.length; i++) {
                    if(id.equals(suppliers[i][0])) {
                        flag=false;
                        break;
                    }
                }
            }
            int place=0;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    place=i;
                    break;
                }
            }
            System.out.println("Supplier Name : "+suppliers[place][1]);

            System.out.print("\nadded successfully! Do you want to add another find(Y/N)?");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicSearchSupplier();
                searchSupplier();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void supplierManage() {
        while(true) {
            topicSupplierManage();
            supplierManageOption();
            int smop=getOption();
            if(smop==1) {
                topicAddSupplier();
                addSupplier();
            }
            if(smop==2) {
                topicUpdateSupplier();
                updateSupplier();
            }
            if(smop==3) {
                topicDeleteSupplier();
                deleteSupplier();
            }
            if(smop==4) {
                topicViewSupplier();
                viewSupplier();
            }
            if(smop==5) {
                topicSearchSupplier();
                searchSupplier();
            }
            if(smop==6) {
                break;
            }
        }
    }
    public static void topicManageItemCatogory() {
        clearConsol();
        lineAimation();
        System.out.printf("|%48s","MANAGE ITEM CATEGORY");
        System.out.printf("%30s|\n"," ");
        lineAimation();
    }
    public static void manageItemCatogoryOption() {
        String[] ar = {"Add New Item Category","Delete Item Category","Update Item Category","Stock Management"};
        options(ar);
    }
    public static void topicAddItem() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","ADD ITEM");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void addItem() {
        while(true) {
            if(itemCategory.length==0) {
                System.out.println("OOPS! It seems that you don't have any item categories in the system.");

                System.out.print("Do you want to add a new item category (Y/N) ? ");
                char ch =input.next().charAt(0);
                if (ch=='Y'||ch=='y') {
                    clearConsol();
                    topicAddItemCategory();
                    addItemCategory();
                    break;
                } else if (ch=='N'||ch=='n') {
                    break;
                }
            }
            if(suppliers.length==0) {
                System.out.println("OOPS! It seems that you don't have any suppliers in the system");
                System.out.print("Do you want to add a new supplier (Y/N) ? ");
                char option=input.next().charAt(0);

                if(option=='Y'||option=='y') {
                    clearConsol();
                    topicAddSupplier();
                    addSupplier();
                    break;
                } else {
                    break;
                }
            }
            System.out.print("Item Code : ");
            itemCode=growItem();
            itemCode[itemCode.length-1]=input.next();
            String iCode=itemCode[itemCode.length-1];
            int count=0;

            for (int i = 0; i <itemCode.length; i++) {
                if(iCode.equals(itemCode[i])) {
                    count++;
                }
            }
            while(count>1) {
                System.out.println("already exists. try another Item code!");
                System.out.print("\nItem Code : ");

                itemCode[itemCode.length-1]=input.next();
                iCode=itemCode[itemCode.length-1];
                count=0;

                for (int i = 0; i <itemCode.length; i++) {
                    if(iCode.equals(itemCode[i])) {
                        count++;
                    }
                }
            }
            System.out.println("\nSupplier list : \n");
            System.out.println("+----+---------------+-----------------+");
            System.out.printf("| %-2s |  %-11s  |  %-13s  |%n","#","SUPPLIER ID","SUPPLIER NAME");
			System.out.println("+----+---------------+-----------------+");

            for (int i = 0; i <suppliers.length; i++) {
                System.out.printf("| %-2d |  %-11s  |  %-13s  |%n",(i+1),suppliers[i][0],suppliers[i][1]);
            }
			System.out.println("+----+---------------+-----------------+");

            System.out.print("\nEnter the supplier number : ");
            int sIndex=input.nextInt();
            seletedSupplierList=growSeletedSupplierList();
            seletedSupplierList[seletedSupplierList.length-1][0]=suppliers[sIndex-1][0];
            seletedSupplierList[seletedSupplierList.length-1][1]=suppliers[sIndex-1][1];

            System.out.println("\nItem Categories : \n");

            System.out.println("+----+-----------------+");
            System.out.printf("| %-2s |  %-13s  |%n","#","CATEGORY NAME");
			System.out.println("+----+-----------------+");

            for (int i = 0; i <itemCategory.length; i++) {
                System.out.printf("| %-2d |  %-13s  |%n",(i+1),itemCategory[i]);
            }
			System.out.println("+----+-----------------+");

            System.out.print("\nEnter the category number : ");
            int cIndex=input.nextInt();
            seletedCategoryList=growSeletedCategoryList();
            seletedCategoryList[seletedCategoryList.length-1]=itemCategory[cIndex-1];

            System.out.print("\nDescription   : ");
            description=growDescription();
            description[description.length-1]=input.next();

            System.out.print("Unit price    : ");
            unitPrice=growUnitPrice();
            unitPrice[unitPrice.length-1]=input.nextInt();

            System.out.print("Qty on hand   : ");
            qty=growQty();
            qty[qty.length-1]=input.nextInt();

            System.out.print("\nadded successfully! Do you want to add another Item (Y/N) ? ");
            char ch=input.next().charAt(0);
            if(ch=='Y'||ch=='y') {
                clearConsol();
                topicAddItem();
                addItem();
                break;
            } else {
                break;
            }
        }
    }
    public static void topicGetItemSupplierWise() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","SEARCH SUPPLIER");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void getItemSupplierWise() {
        while(true) {
            System.out.print("Supplier ID   : ");
            String id=input.next();

            boolean flag=true;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    flag=false;
                    break;
                }
            }
            while(flag) {
                System.out.println("can't find supplier id.try again!");

                System.out.print("\nSupplier ID   : ");
                id=input.next();
                for (int i = 0; i <suppliers.length; i++) {
                    if(id.equals(suppliers[i][0])) {
                        flag=false;
                        break;
                    }
                }
            }
            int place=0;
            for (int i = 0; i <suppliers.length; i++) {
                if(id.equals(suppliers[i][0])) {
                    place=i;
                    break;
                }
            }

            System.out.println("Supplier Name : "+suppliers[place][1]);


            for (int i = 0; i <seletedSupplierList.length; i++) {
                if(id.equals(seletedSupplierList[i][0])) {
                    index=growIndex();
                    index[index.length-1]=i;


                    System.out.println("+--------------+----------------+--------------+----------------+------------+");
                    System.out.printf("|  %-10s  |  %-12s  |  %-10s  |  %-12s  |  %-8s  |%n","Item Code","Description","Unit Price","Qty On Hand","Category");
                    System.out.println("+--------------+----------------+--------------+----------------+------------+");

                    for (int j = 0; j <suppliers.length; j++) {
                        if(suppliers[j][0].equals(id)) {
                            System.out.printf("|    %-6s    |   %-10s   |   %-7.1f    |      %-4d      |    %-5s   |%n",itemCode[j],description[j],unitPrice[j],qty[j],itemCategory[j]);
                        }
                    }   
                }
            }
					System.out.println("+--------------+----------------+--------------+----------------+------------+");

            System.out.print("added successfully! Do you want to add another category(Y/N)? ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicGetItemSupplierWise();
                getItemSupplierWise();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }

    public static void topicViewItem() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","View Item");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void viewItem() {
        while(true) {
            for (int i = 0; i <seletedSupplierList.length; i++) {

                System.out.println("\n"+seletedCategoryList[i]+" : \n");
                System.out.println("+--------+--------+----------------+-----------+-------+");
                System.out.printf("|  %-4s  |  %-4s  |  %-12s  |   %-5s   |  %-3S  |%n","SID","Code","Description","Price","QTY");
                System.out.println("+--------+--------+----------------+-----------+-------+");


                System.out.printf("|  %-4s  |  %-4s  |  %-12s  |  %-4.1f    |  %-3d  |%n",seletedSupplierList[i][0],itemCode[i],description[i],unitPrice[i],qty[i]);
                System.out.println("+--------+--------+----------------+-----------+-------+");

            }
            System.out.print("\nDo you want to go stock manage page (Y/N) ? ");
            char ch=input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                break;
            } else if(ch=='N'||ch=='n') {
                clearConsol();
                topicViewItem();
                viewItem();
                break;
            }
        }
    }

    public static void topicRankItemPerUnitPrice() {
        clearConsol();
        lineAimation();
        System.out.printf("|%46s","Rank Item Per Unit Price");
        System.out.printf("%32s|\n"," ");
        lineAimation();
    }
    public static void rankItemPerUnitPrice() {
        while(true) {
            double[] copyUnitPrice=Arrays.copyOf(unitPrice,unitPrice.length);
            int []index=new int[unitPrice.length];
            double temp=0;

            for (int i = 0; i < copyUnitPrice.length; i++) {
                for (int j = 0; j < copyUnitPrice.length-1; j++) {
                    if(copyUnitPrice[j]>copyUnitPrice[j+1]) {
                        temp=copyUnitPrice[j];
                        copyUnitPrice[j]=copyUnitPrice[j+1];
                        copyUnitPrice[j+1]=temp;
                    }
                }
            }
            int l=0;
            for (int i = 0; i < index.length; i++) {
                for (int j = 0; j < index.length; j++) {
                    if(copyUnitPrice[i]==unitPrice[j]) {
                        index[l++]=j;
                        break;

                    }
                }
            }
            System.out.println("\n");

            System.out.println("+--------+--------+----------+-----------+-------+----------+");
            System.out.printf("|  %-4s  |  %-4s  |  %-6s  |   %-5s   |  %-3s  |  %-6s  | %n","SID","Code","Desc","Price","QTY","Cat");
            System.out.println("+--------+--------+----------+-----------+-------+----------+");
            for(int i=0; i<index.length; i++) {
                System.out.printf("|  %-4s  |  %-4s  |  %-6s  |   %-5.1f   |  %-3d  |  %-6s  |%n",seletedSupplierList[index[i]][0],itemCode[index[i]],description[index[i]],unitPrice[index[i]],qty[index[i]],seletedCategoryList[index[i]]);
            }
            System.out.println("+--------+--------+----------+-----------+-------+----------+");
            System.out.print("\nDo you want to go stock manage page(Y/N)?");
            char ch=input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                break;
            } else if(ch=='N'||ch=='n') {
                clearConsol();
                topicRankItemPerUnitPrice();
                rankItemPerUnitPrice();
                break;
            }
        }
    }

    public static void stockManage() {
        while(true) {
            topicStockManage();
            stockManageOption();
            int stmop=getOption();
            if(stmop==1) {
                manageItemCategories();
            }
            if(stmop==2) {
                topicAddItem();
                addItem();
            }
            if(stmop==3) {
                topicGetItemSupplierWise();
                getItemSupplierWise();
            }
            if(stmop==4) {
                topicViewItem();
                viewItem();
            }
            if(stmop==5) {
                topicRankItemPerUnitPrice();
                rankItemPerUnitPrice();
            }

            if(stmop==6) {
                break;
            }
        }
    }
    public static void topicAddItemCategory() {
        clearConsol();
        lineAimation();
        System.out.printf("|%50s","ADD ITEM CATEGORY");
        System.out.printf("%28s|\n"," ");
        lineAimation();
    }
    public static void addItemCategory() {
        while(true) {
            System.out.print("\nEnter the item category : ");
            itemCategory=growitemCategory();
            itemCategory[itemCategory.length-1]=input.next();

            String uniqueCategory=itemCategory[itemCategory.length-1];
            int count=0;
            for (int i = 0; i <itemCategory.length; i++) {

                if(uniqueCategory.equals(itemCategory[i])) {
                    count++;
                }
            }
            while(count>1) {
                System.out.println("Item catogory can't be duplicate.try again!");
                System.out.print("\nEnter the item category : ");

                itemCategory[itemCategory.length-1]=input.next();

                uniqueCategory=itemCategory[itemCategory.length-1];
                count=0;
                for (int i = 0; i <itemCategory.length; i++) {

                    if(uniqueCategory.equals(itemCategory[i])) {
                        count++;
                    }
                }
            }

            System.out.print("added successfully! Do you want to add another category(Y/N)? ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicAddItemCategory();
                addItemCategory();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void topicDeleteItemCategory() {
        clearConsol();
        lineAimation();
        System.out.printf("|%50s","DELETE ITEM CATEGORY");
        System.out.printf("%28s|\n"," ");
        lineAimation();
    }
    public static void deleteItemCategory() {
        while(true) {
            System.out.print("\nEnter the  item category you want to delete : ");
            String deleteCategory=input.next();

            boolean flag=true;
            for (int i = 0; i <itemCategory.length; i++) {
                if(deleteCategory.equals(itemCategory[i])) {
                    flag=false;
                }
            }
            while(flag) {
                System.out.println("can't find item category.try again!");
                System.out.print("\nEnter the  item category you want to delete : ");
                deleteCategory=input.next();

                for (int i = 0; i <itemCategory.length; i++) {
                    if(deleteCategory.equals(itemCategory[i])) {
                        flag=false;
                    }
                }
            }
            String[]temp=new String[itemCategory.length-1];
            for (int i = 0,j=0; i <itemCategory.length; i++) {
                if(deleteCategory.equals(itemCategory[i])) {
                    continue;
                }
                temp[j++]=itemCategory[i];
            }

            itemCategory=temp;
            System.out.print("deleted successfully! Do you want to delete another(Y/N)?");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicDeleteItemCategory();
                deleteItemCategory();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void topicUpdateItemCategory() {
        clearConsol();
        lineAimation();
        System.out.printf("|%50s","Update ITEM CATEGORY");
        System.out.printf("%28s|\n"," ");
        lineAimation();
    }
    public static void updateItemCategory() {
        while(true) {
            System.out.print("\nEnter the  item category you want to update : ");
            String updateCategory=input.next();

            int place=0;
            boolean flag=true;
            for (int i = 0; i <itemCategory.length; i++) {
                if(updateCategory.equals(itemCategory[i])) {
                    flag=false;
                    break;
                }
            }
            while(flag) {
                System.out.println("can't find item category. try again!");
                System.out.print("\nEnter the  item category you want to update : ");
                updateCategory=input.next();

                for (int i = 0; i <itemCategory.length; i++) {
                    if(updateCategory.equals(itemCategory[i])) {
                        flag=false;
                        break;
                    }
                }
            }
            for (int i = 0; i <itemCategory.length; i++) {
                if(updateCategory.equals(itemCategory[i])) {
                    place=i;
                }
            }
            System.out.print("Enter the updated item category : ");
            itemCategory[place]=input.next();

            System.out.print("\nUpdated Successfully! Do you want to update another supplier?(Y/N) ");
            char ch =input.next().charAt(0);
            if (ch=='Y'||ch=='y') {
                clearConsol();
                topicUpdateItemCategory();
                updateItemCategory();
                break;
            } else if(ch=='N'||ch=='n') {
                break;
            }
        }
    }
    public static void manageItemCategories() {
        while(true) {
            clearConsol();
            topicManageItemCatogory();
            manageItemCatogoryOption();
            int micop=getOption();
            if(micop==1) {
                topicAddItemCategory();
                addItemCategory();
            }
            if(micop==2) {
                topicDeleteItemCategory();
                deleteItemCategory();
            }
            if(micop==3) {
                topicUpdateItemCategory();
                updateItemCategory();
            }
            if(micop==4) {
                break;
            }
        }
    }
    public static void topicStockManage() {
        clearConsol();
        lineAimation();
        System.out.printf("|%43s","STOCK MANAGE");
        System.out.printf("%35s|\n"," ");
        lineAimation();
    }
    public static void stockManageOption() {
        String[] ar = {"Manage Item Categories","Add Item","Get Item Supplier wise","View Item","Rank Item Per Unit Price","Home Page"};
        options(ar);
    }
    public static void main (String args[]) {

        welcomePage();
        topicLoginpage();
        loginPage();
        while(true) {
            topicMainmenu();
            mainmenuOption();
            int op=getOption();
            if(op==1) {
                topicCredentialManage();
                credentialManage();
            }
            if(op==2) {
                supplierManage();
            }
            if(op==3) {
                stockManage();
            }
            if(op==4) {
                clearConsol();
                topicLoginpage();
                loginPage();
            }
            if(op==5) {
                clearConsol();
                exitPage();
                break;
            }
        }
    }
}
