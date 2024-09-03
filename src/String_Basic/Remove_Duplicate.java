package String_Basic;

    class RemoveDuplicate {
    public static void main(String[] args) {
        String input = "programming"; // Example input string
        boolean[] seen = new boolean[256]; // Array to track seen characters, assuming ASCII charset
        StringBuilder sb = new StringBuilder(); // To build the result string without duplicates

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // Get the character at the current position
            if (!seen[c]) { // Check if the character has not been added yet
                seen[c] = true; // Mark the character as seen
                sb.append(c); // Append the character to the result string
            }
        }

        // Convert StringBuilder to String and print the result
        String result = sb.toString();
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}

