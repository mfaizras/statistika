
public class M2 {

    public static void main(String[] args) {
        hitungPermutasi(10, 3);
        hitungKombinasi(10, 3);
    }

    public static Long hitungFaktorial(int n) {
        Long result = 1L;

        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static Long hitungPermutasi(int n, int r) {

        if (n <= 0 || r > n) {
            throw new IllegalArgumentException("r and n can't be zero");
        }

        Long result = hitungFaktorial(n) / hitungFaktorial(n - r);
        System.out.println(
                "Jumlah permutasi dari " + n + " objek yang diambil " + r + " pada satu waktu adalah " + result);

        return result;
    }

    public static Long hitungKombinasi(int n, int r) {

        if (r <= 0 || n <= 0 || r > n) {
            throw new IllegalArgumentException("r and n can't be zero");
        }

        Long result = hitungFaktorial(n) / (hitungFaktorial(n - r) * hitungFaktorial(r));
        System.out.println(
                "Jumlah kombinasi dari " + n + " objek yang diambil " + r + " pada satu waktu adalah " + result);

        return result;
    }
}
