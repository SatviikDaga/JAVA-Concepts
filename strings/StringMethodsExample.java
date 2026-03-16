public class StringMethodsExample {

    public static void main(String[] args) {

        String name = "Bro Code";

        int length = name.length();
        char firstLetter = name.charAt(0);
        int index = name.indexOf("r");

        name = name.toUpperCase();
        name = name.replace("o","a");

        System.out.println("Length: " + length);
        System.out.println("First Letter: " + firstLetter);
        System.out.println("Index of r: " + index);

        if(name.contains(" ")){
            System.out.println("Contains space");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Invalid name");
        } else{
            System.out.println("Hello " + name);
        }
    }
}
