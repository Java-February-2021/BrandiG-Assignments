public class FizzBuzz {
    public String fizzbuzz(int i) {

        if (i % 3 == 0){
            return "Fizz";
    
        } else if (i % 5 == 0 ){
            return "Buzz";
        
        } else if (i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        
        } else   
            
            return String.valueOf(i);
    }
}

public void fizzBuzzCount(){
    for (int i = 0; i <= 100; i++){
        String result = fizzBuzz(i);
        System.out.println("Number " + i + " - " + " Result: " + result);
    }
}
}
