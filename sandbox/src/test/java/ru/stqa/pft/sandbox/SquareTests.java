package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pftsandbox.Square;

/**
 * Created by Ксюша on 29.01.2017.
 */
public class SquareTests {

  @Test

  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}
