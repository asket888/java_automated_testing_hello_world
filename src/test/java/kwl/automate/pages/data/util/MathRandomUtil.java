package kwl.automate.pages.data.util;

public class MathRandomUtil {

    // random integer number generator in range [b, a]
    public int getMathRandom(int a, int b) {

        return (int) (Math.random()*((a - b) + 1) + b);
    }
}
