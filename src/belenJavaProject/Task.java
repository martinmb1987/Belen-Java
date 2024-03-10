package belenJavaProject;

public class Task {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setMenu("Entrees");
        myRestaurant.setRoom("Kitchen");
        myRestaurant.setAddress("4000 Collins ave");
        System.out.println("The address is: "+myRestaurant.getAddress()+"\n"+
                "The room is:"+ myRestaurant.getRoom()+"\n"+ "The menu is: "+ myRestaurant.getMenu());

        Employee myEmployee = new Employee("Manager",3000);
        System.out.println(myEmployee.getInfo("The position is: ","The salary is: "));

    }

}
