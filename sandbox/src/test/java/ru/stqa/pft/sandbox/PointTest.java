package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pftsandbox.Point;

/**
 * Created by Ксюша on 29.01.2017.
 */
public class PointTest {

  @Test

  public  void testDistance() {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(6, 4);
    Assert.assertEquals(p1.distance(p2), 4.47213595499958);
  }
}
