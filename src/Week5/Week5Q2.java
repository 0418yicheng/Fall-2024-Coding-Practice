package Week5;

public class Week5Q2 {
    public static void main(String[] args) {
        Point robot1 = new Point(0, 0);
        Point robot2 = new Point(3, 4);
        Point target1 = new Point(1, 1);
        Point target2 = new Point(0, 1);
        Point target3 = new Point(1, 3);

        System.out.println(getAimAngle(robot1, target1));
        System.out.println(getAimAngle(robot1, target2));
        System.out.println(getAimAngle(robot2, target2));
        System.out.println(getAimAngle(robot2, target3));

        /*
         * Expected Outputs:
         * 45
         * 90
         * -135
         * -153.4
         */
    }

    public static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    // Return the angle the robot needs to aim to in degrees.
    public static double getAimAngle(Point robotPos, Point targetPos) {
        double xLen = targetPos.x - robotPos.x;
        double yLen = targetPos.y - robotPos.y;
        return Math.toDegrees(Math.atan2(yLen, xLen));

    }
}
