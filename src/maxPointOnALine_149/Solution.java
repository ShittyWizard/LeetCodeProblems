package maxPointOnALine_149;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

public class Solution {
    public int maxPoints(Point[] points) {
        int temp = 0, numberOfMaxPoints = 0;
        double angleK;
        for (Point point1 : points) {
            for (Point point2 : points) {
                if (!point1.equals(point2)) {
                    angleK = getAngleK(point1, point2);
                    System.out.println("point1.x = " + point1.x + " point1.y = " + point1.y);
                    System.out.println("point2.x = " + point2.x + " point2.y = " + point2.y);
                    System.out.println("angleK = " + angleK);
                    for (Point pointForChecking : points) {
                        if (!pointForChecking.equals(point1) && !pointForChecking.equals(point2)
                                && angleK == getAngleK(pointForChecking, point1)) {
                            System.out.println("pointForChecking.x = " + pointForChecking.x + " pointForChecking.y = " + pointForChecking.y);
                            temp++;
                        }
                    }
                    if (temp > numberOfMaxPoints) {
                        numberOfMaxPoints = temp;
                    }
                    temp = 0;
                }
            }
        }
        if (points.length >= 2) {
            numberOfMaxPoints += 2;
        }
        System.out.println("numberOfMaxPoints = " + numberOfMaxPoints);
        return numberOfMaxPoints;
    }

    public double getAngleK(Point point1, Point point2) {
        if (point1.x != point2.x) {
            return (point2.y - point1.y) / (point2.x - point1.x) * 1.;
        } else {
            return Double.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 2);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(4, 1);
        Point point5 = new Point(2, 3);
        Point point6 = new Point(1, 4);
        Point[] points = {point1, point2, point3, point4, point5, point6};
        solution.maxPoints(points);
    }
}
