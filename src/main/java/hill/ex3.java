package hill;


public class ex3 {

    public static int triangle(int num) {
	if (num <= 1) {
	    return num;
	} else {
	    return (num*(num+1))/2;
	}
    }

    public static int lazy(int num) {
	return (((num * num) + num + 2)/2);
    }

    
    public static void main(String[] args) {
	if (args == null || args.length == 0) {
	    System.out.println("Enter something buddy");
	    System.exit(1);
	} 
	else if (!args[0].equals("triangle") && !args[0].equals("lazy")) {
		System.exit(1);
	}
	else if (Integer.parseInt(args[1]) < 0) {
		System.exit(2);
	}

	else {
	    try {
		String arg1 = args[0];
		int x = 0;
		if (arg1.equals("triangle")){
			x = triangle(Integer.parseInt(args[1]));
			System.out.println("Tri(" + Integer.parseInt(args[1]) + ") is: " + x);
		}
		else if (arg1.equals("lazy")){
			x = lazy(Integer.parseInt(args[1]));
			System.out.println("Lazy(" + Integer.parseInt(args[1]) + ") is: " + x);
		}
	    } catch (NumberFormatException ex) {
		System.out.println("Enter an integer buddy");
		System.exit(1);
	    }
	}

    }
}
