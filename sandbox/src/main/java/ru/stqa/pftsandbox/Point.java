package ru.stqa.pftsandbox;

import java.util.Map;

/**
 * Created by Ксюша on 29.01.2017.
 */
public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1){
   double a = Math.pow((this.x - p1.x),2);
   double b = Math.pow((this.y -p1.y),2);
   double c = Math.sqrt(a+b);
   return c;
  }
}
