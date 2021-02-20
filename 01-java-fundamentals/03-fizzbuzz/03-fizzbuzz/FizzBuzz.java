public class FizzBuzz {
    public void fizzBuzzTest() {
        for (int i = 1; i <= 100; i++) {
            String result = fizzBuzz(i);
            System.out.println("Number" + i + "-" + "Result:" + result);
        }
    } 

    public String fizzBuzz(int i) {
           
            if (i % 3 == 0){
                return "Fizz";
        
            } else if (i % 5 == 0 ){
               return "Buzz";
            
            } else if (i % 3 == 0 && i % 5 == 0){
               return "FizzBuzz";
            
            } else   
                return Integer.toString(i);
    }
}

