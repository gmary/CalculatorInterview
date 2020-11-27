import static org.junit.Assert.*;
import com.neoxam.Calculator;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.internal.TextListener;

class Main {
  
  public static void main(String[] args) {
    JUnitCore junitCore = new JUnitCore();
		junitCore.addListener(new TextListener(System.out));
		junitCore.run(Tests.class);
  }

  public static class Tests {

    @Test
    public void should_return_0_when_numbers_is_an_empty_string() {
      Calculator cal = new Calculator();
      assertEquals(cal.add(""), 0);
    }

  }
  
}