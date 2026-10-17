class Solution {
    public List<List<Integer>> generate(int numRows) {
        Stack<List<Integer>> stack = new Stack<>();
        stack.push(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> elements = new LinkedList<>();
            elements.add(0);
            elements.addAll(stack.peek());
            elements.add(0);

            List<Integer> triangle = new LinkedList<>(); 
            for (int j = 0; j < elements.size() - 1; j++) {
                triangle.add(elements.get(j) + elements.get(j + 1));
            }

            stack.push(triangle);
        }

        return stack
            .stream()
            .toList();
    }
}