import org.testng.annotations.Test;

public class DemoTestNGClass {

@Test
    public void sum(){
        int a=5;
        int b=7;
        int sum = a+b;
        System.out.println("sum of the input provided -"+sum);
    }

}
