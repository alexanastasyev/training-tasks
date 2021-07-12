package generate_parentheses;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        List<String> parentheses = new Solution().generateParenthesis(10);
        long endTime = System.currentTimeMillis();

        for (String item : parentheses) {
            System.out.println(item);
        }

        System.out.println("\nTotal count: " + parentheses.size());
        System.out.println("Execution time: " + (endTime - beginTime) + " ms");
    }
}
