import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
//square Packages icon on left side of repl.it, org.hamcrest:hamcrest version 2.2, Add package
//now in ./target/dependency is hamcrest-2.2.jar
// import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.fail;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;
import java.io.FileNotFoundException;

@RunWith(Parameterized.class)
public class SumValuesTest
{
  @Parameters(name = "{index}: {0}")
  public static Collection<Object[]> data()
  {
    return Arrays.asList(new Object[][] {         
    {"task2.txt", new String[] {"1,2,5,-2", "10,20,0,7", "3,2", "2", "0", "1,2", "", "3"}, false},
    {"lstin0.txt", null, true},
    {"empty.txt", new String[] {}, false}
    });
  }
  private String infile;
  private boolean isExcept;
  private String[] check;
  public SumValuesTest(String infile, String[] check, boolean isExcept)
  {
    this.infile = infile;
    this.check = check;
    this.isExcept = isExcept;
  }

  @Test
  public void test() throws FileNotFoundException, IOException
  {
    try {
    String[] res = SumValues.input(infile);
    // assertThat(this.check, equalTo(res));
    assertArrayEquals(this.check, res);
    }
    finally {
        
    }
  }
}
