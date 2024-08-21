package game;

    public enum Front {
        North(1), East(2), South(3), West(4);

         private Integer i;
         private Front(int value) {
            this.i=value;
        }

        public Integer value(){
            return i;
        }

        public Front rotateLeft(){
            return values()[(ordinal()-1)%4];
        }
        public Front rotateRight()
        {
            return values()[(ordinal()+1)%4];
        }

    }

