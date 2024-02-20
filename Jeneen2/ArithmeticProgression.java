public class ArithmeticProgression extends Progression {
         protected long increment;

         /** Constructs progression 0, 1, 2, ... */
         public ArithmeticProgression( ) { this(1, 0); } // start at 0 with increment of 1

         /** Constructs progression 0, stepsize, 2*stepsize, ... */
         public ArithmeticProgression(long stepsize) { this(stepsize, 0); } // start at 0

         /** Constructs arithmetic progression with arbitrary start and increment. */
         public ArithmeticProgression(long stepsize, long start) {  super(start);
         increment = stepsize;
         }
             /** Adds the arithmetic increment to the current value. */
             protected void advance( ) {  current += increment;
         }
    public void Arithmetic(){
            long start = 0;
            long increment = 128;
            long maxValue = 9223372036854775807L;

            long count = (maxValue - start) / increment;
            System.out.println(count);
        }

    }


