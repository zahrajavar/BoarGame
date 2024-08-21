package game;
/*enum Front {
    North, South, East, West
}
*/
 public interface IRobot {

        public void place(int x, int y, Front f);
        public void move();
        public void left();
        public void right();
        public void report();

}
