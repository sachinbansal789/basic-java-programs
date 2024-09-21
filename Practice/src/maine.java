import java.util.Scanner;

public class maine {
    public static void main(String[] args) {
        System.out.println("check for Armstrong number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        System.out.println("enter the value for pattern");
        int value = sc.nextInt();
        //
        int value1=value;
        for(int ik=1;ik<=value1;ik++){
            for(int j=1;j<=ik;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // buble sort - in this type of sorting we compare first value with 

        int[] arr = {23,21,12,14,29};
        int l = arr.length;
        for(int ion = 0 ; ion < l-1 ; ion++) {
            for(int jon =0 ; jon < l-1 ;jon++){
                if(arr[jon]<arr[jon+1]){
                    int temp2 = arr[jon];
                    arr[jon]=arr[jon+1];
                    arr[jon+1]=temp2;
                }
            }
        }

        for(int iun = 0 ; iun < l ; iun++){
            System.out.println(arr[iun] + " ");
        }

        // selection sort - ASCENDING ORDER, compare 1st value with every value an so on

        int[] arr1 = {265,21,12,4,2};

        for(int p=0 ; p < l-1  ; p++){
            for(int m =0+p ; m < l-1 ; m++){
                if(arr1[p]>arr1[m+1]){
                    int temp3 = arr1[p];
                    arr1[p]=arr1[m+1];
                    arr1[m+1]=temp3;
                }
            }
        }

        for(int iune = 0 ; iune < l ; iune++){
            System.out.print(arr1[iune] + " ");
        }




        boolean check = isArmstrong(value);
        if (check == true) {
            System.out.println("it is a Armstrong number");
        } else {
            System.out.println("it is not Armstrong number");
        }
        System.out.println("check for peterson number");
        boolean check1 = isPeterson(value);
        if (check1 == true) {
            System.out.println("it is a Peterson number");
        } else {
            System.out.println("it is not peterson number");
        }
        System.out.println("check for sunny number");
        boolean check2 = isSunny(value);
        if (check2 == true) {
            System.out.println("it is a Sunny number");
        } else {
            System.out.println("it is not Sunny number");
        }
        System.out.println("Reverse the number");
         int reverse = isReverse(value);
         System.out.println("reversed number is "+ reverse);

         /// pring a pattern
        //*
        //**
        //***
        //****
        //***
        //**

       // int jm;






    }
    public static boolean isArmstrong(int value){
        int temp = value ;
        int result = 0 ;
    //    String ge = String.valueOf(temp);
        int length = count(value);
        // 407 - 4*4*4 + 0*0*0 + 7*7*7

        while (length != 0){
            int un = temp%10;
            int prod = prode(un,value);
           result = result+prod ;
            temp = temp/10;
            length -- ;
        }
        if(result == value){
            return true;
        }
        else{
            return false;
        }
    }
    public static int prode(int un , int value){
        int product = 1;
        int uni = un;
        int temp3 = value;
        int countertmp= count(temp3);
        int productvalue=1;

        while(countertmp!=0){
           productvalue = productvalue*uni;
            countertmp -- ;
        }
        return productvalue;
    }
    public static int count(int temp3){
        int temp2 = temp3;
        int counter = 0;
        while(temp2!=0){
            temp2=temp2/10;
            counter++;

        }
        return counter;
    }
    public static boolean isPeterson(int value) {
        int tempvalue1 = value;
        int sum1 = 0;
        while (tempvalue1 > 0) {
            int remain = tempvalue1 % 10;
            int product = 1;
            for (int i = 0; i < remain; i++) {
                product = product * (remain - i);
            }
            sum1 = sum1 + product;
            tempvalue1 = tempvalue1 / 10;
        }
        if (sum1 == value) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSunny(int value) {
        int tempvalue2 = value ;
        int tempvalue3 = value +1 ;

        if(Math.sqrt(tempvalue3)%1==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int isReverse(int value){
        int temp4 = value ;
        String g = String.valueOf(temp4);
        int mk = g.length();
        int  npo=0;
        
        while(mk>0){
            int digit = temp4 % 10 ;
            npo = npo*10 + digit;
            mk--;
            temp4 = temp4/10;
        }
        return npo ;
    }




}


