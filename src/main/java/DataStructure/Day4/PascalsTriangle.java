package DataStructure.Day4;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    row.add(1);
                } else {
                    int temp = (j < pascalTriangle.get(i - 1).size()) ? pascalTriangle.get(i - 1).get(j) : 0;
                    row.add(temp + pascalTriangle.get(i - 1).get(j - 1));
                }
            }
            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
}
