import java.util.Scanner;

public class sachin {
            public static void main (String[] args) {
                System.out.println("GfG!");
                // armstrong number 1*1*1+5*5*5+3*3*3=153
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                System.out.println("Enter the number of inputs");
                int nel = sc.nextInt();

                int[] arr = new int[nel];

                for(int i=0 ; i<nel ;i++) {
                    System.out.println("enter the values for array");
                     arr[i] = sc.nextInt();
                }

                // Bubble sort - in this we compare first value with the remaining values and sort the array
////
                for(int kl =0 ;kl<nel ; kl++){
                    for(int jl=kl+1 ; jl < nel ;jl++){
                        if( arr[kl] > arr[jl] ){
                            int temper = arr[kl];
                            arr[kl] = arr[jl];
                            arr[jl] = temper ;
                        }
                    }
                }

                for(int jo =0 ;jo<nel ; jo++){
                    System.out.println(arr[jo]+" ");
                }


////




                //	int numlength = input.length();

                Boolean value = isBoolean(input);
                if(value == true){
                    System.out.println("Given number is an armstrong number");
                }
                else{
                    System.out.println("given number is not an armstrong number");
                }

                ////
            }


            public static boolean isBoolean(int input){
                int num = input;
                int sum=0;
                while(num > 0){
                    int n = num % 10;
                    sum = sum +n*n*n;
                    num = num/10;
                }

                if(sum == input){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

