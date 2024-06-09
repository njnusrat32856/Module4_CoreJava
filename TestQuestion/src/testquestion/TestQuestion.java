
package testquestion;

public class TestQuestion {

    public static void main(String[] args) {
        
        int[] pokemon1 = {4, 5, -1, 0, 0};
        int[] pokemon2 = {2, 27, 7, 12, 0};

        int[] mergedLineup = mergeLineup(pokemon1, pokemon2);

        System.out.println("Merged Lineup: " + java.util.Arrays.toString(mergedLineup));
    }
    public static int[] mergeLineup(int[] pokemon1, int[] pokemon2) {
        int n = pokemon1.length;
        int[] mergedHp = new int[n];

        for (int i = 0; i < n; i++) {
            int hp1 = pokemon1[i] == 0 ? 0 : pokemon1[i];
            int hp2 = pokemon2[n - 1 - i] == 0 ? 0 : pokemon2[n - 1 - i];
            mergedHp[i] = hp1 + hp2;
        }

        return mergedHp;
    }
}
