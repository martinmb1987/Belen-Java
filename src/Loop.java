public class Loop {
    public static void main(String[] args) {
//        for(int maria = 100; maria>=90; maria--) {
//           System.out.print("["+maria+"]");
//           System.out.println("Belen");
//        }
//        for (int test=0; test<=200;){
//            if(test==0){
//                System.out.println("["+1+"] "+"Pants");
//            }
//            else{
//            System.out.println("["+test+"] "+"Pants");
//            }
//            test+=13;
//        }
//
//        for (int i=10; i>0;i--){
//            System.out.print(i+"\t");
//        }
//
        //Nested loops
//        for(int i=1; i<=5; i++){
//            System.out.println("When i is: "+i);
//            System.out.println("........................");
//            for(int j=1; j<=5; j++){
//                System.out.println("This is inner loop: "+j);
//            }
//        }
        for (int f=1; f<9;f++){
            System.out.print("For "+f+" it prints:");
            for (int g=0;g<5;g++){
                System.out.print(g);
            }
            System.out.println();
        }
        for(int b=1; b<17; b++){
            System.out.println("10 * "+b+": "+b*10);
        }

        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("% ");
            }
            System.out.println();
        }
        int c =0;
        while(c<1){
            System.out.println(c);
            c++;
        }
        do{
            System.out.println("Hi");
            c++;
        }
        while(c<3);

    }
}
