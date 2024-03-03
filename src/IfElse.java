public class IfElse {
    public static void main(String[] args) {
        int age;
        age = 6;
        String name = "Tawfiq";
        if (!(age >= 9)) {
            System.out.println("hi there");
        }
        if ((name == "maria") || (name == "Tawfiq")) {
            System.out.println("Today is a cloudy day");
        } else {
            System.out.println("The correct name is: " + name);
        }

//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter age: ");

//        int age1 = Integer.parseInt(myObj.nextLine());  // Read user input


        String name1 = "Belen";
        char letter = 'c';
        if (name1 == "Belen") {
            System.out.println("This is correct: Name is " + name1);
            if (name1.contains(String.valueOf(letter))) {
                System.out.println("The name contains the word " + letter);
            } else {
                System.out.println("The name does not contain " + letter);
            }

        } else if (name1 != "Alan" || name1 == "Rick") {
            System.out.println("This is correct: Name is " + name1);
        } else {
            System.out.println("None of the names match");
        }

        int age3 = 70;
        char gender = 'F';
        if (age3 > 60 && gender == 'M') {
            System.out.println("The person is older than: " + age3);
            System.out.println("This person is of gender: " + gender);
        } else {
            System.out.println("This person is a male");
        }
        String carType = "Toyota";
        String carModel = "Camry";
        String carTrim = "SE";
        int carYear = 2021;

        char carCondition = 'N';
        if (carType == "Toyota") {
            System.out.println("Yes this is correct: Car type is indeed " + carType);
            if (carModel == "Camry" && carTrim == "SE") {
                System.out.println("Yes this the car model: " + carModel + "\n" + "Yes this is right car trim: " + carTrim);
            }
            if (carYear == 2029 && carCondition == 'N') {
                System.out.println("Yes this correct");
            }

        }
        String house= "bedroom";
        String furniture= "sofa";
        int roomNumber= 3;
        if (house != "bedrooms"){
            System.out.println("This is my house");
            if (roomNumber==3){
                System.out.println("I have "+roomNumber +" rooms ");
            }
        }
        else if (house != "bedrooms") {
            if (furniture == "sofa") {
                System.out.println("The house has: "+furniture);
            }
        }
        String drink="coke";
        String drink2 ="Water";
        char letter1 ='c';
        if (drink.equals("coke")){
            System.out.println("Coke is bad");
            if(drink.contains(String.valueOf(letter1))){
                System.out.println(drink +" contains the letter "+ letter1  );
                System.out.println("The number of letter is not " + drink.length());
            }
        }
        else if (drink2!="Water") {
            System.out.println(drink2 +" is good for health");
        }
        else{
            System.out.println("Coke is good");
        }
    }


}
