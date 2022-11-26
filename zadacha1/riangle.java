public class Triangle {

    public int triangleF(int n) {

        if (n == 1)
            return 1;
        else
            return (n + triangleF(n - 1));

    }
}
