package practice;

public class StringTest {
    public static void main(String[] args) {
        char[]c={'I','f','t','e','k','h','a','r'};
        String C= "BELEN";
        System.out.println(C.toLowerCase());
        String myName= "maria belen";
        System.out.println(myName.toUpperCase());
        System.out.println(myName);
        String test= myName.toUpperCase();
        System.out.println("test "+test);

        char[] name=C.toCharArray();
        System.out.println(name.length);
        for(int o=0;o<name.length;o++){
            System.out.print(name[o]);
        }
        System.out.println();
        for(int i= name.length-1;i>=0;i--){
            System.out.print(name[i]);
        }
        System.out.println();
        System.out.println(C.toLowerCase().contains("b"));
        System.out.println(C.toLowerCase().startsWith("b"));
        System.out.println(C.toLowerCase().endsWith("n"));
        System.out.println(C.toLowerCase().indexOf("e"));
        System.out.println(C.charAt(0));

        String name1= "BELEN";
        StringBuilder newName = new StringBuilder();
        for(int i=name1.length()-1;i>=0;i--){
           newName.append(name1.charAt(i));
        }
        System.out.println(newName);

        String word = "   This needs to be trimmmed   ";
        System.out.println(word.trim());
        System.out.println("This".contentEquals(word));
        System.out.println(myName.equalsIgnoreCase("MAria BeLen"));
        String fruit1 ="apple ";
        String fruit2 ="banana ";
        String fruit3 ="orange ";
        String fruit4 ="kiwi ";
        System.out.println(fruit1.concat(fruit2));
        System.out.println(fruit1.replaceAll("apple","Guava"));
        
        String sentence = "My name is practice.Belen and I am so happy because my bf is the best";
        char [] letter = sentence.toCharArray();
        int count2 = 0;
        for(int i=1; i<= letter.length;i++){
            count2=+i;
        }
        System.out.println(count2);
        String[] words=sentence.split(" ");
        int count=0;
        for(int i=0;i<= words.length;i++){
            count=+i;
        }
        System.out.println(count);





    }

}
