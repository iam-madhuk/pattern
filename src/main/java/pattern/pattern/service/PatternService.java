package pattern.pattern.service;

import org.springframework.stereotype.Service;

@Service
public class PatternService {
    public String getPattern(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            result.append(generateCharacterPattern(c)).append("\n\n");
        }
        return "<pre>" + result + "</pre>"; // Format for browser display
    }

    private String generateCharacterPattern(char c) {
        int size = 7;
        StringBuilder pattern = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (shouldPrintCharacter(c, i, j, size)) {
                    pattern.append(c);
                } else {
                    pattern.append(" ");
                }
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }

    private boolean shouldPrintCharacter(char c, int i, int j, int size) {
        switch (c) {
            case 'A': return i == 0 || i == size / 2 || j == 0 || j == size - 1;
            case 'B': return j == 0 || i == 0 || i == size - 1 || i == size / 2 || j == size - 1 && i % (size / 2) != 0;
            case 'C': return i == 0 || i == size - 1 || j == 0;
            case 'D': return j == 0 || j == size - 2 && i > 0 && i < size - 1 || i == 0 && j < size - 1 || i == size - 1 && j < size - 1;
            case 'E': return i == 0 || i == size - 1 || i == size / 2 || j == 0;
            case 'F': return i == 0 || i == size / 2 || j == 0;
            case 'G': return i == 0 || i == size - 1 || j == 0 || (i == size / 2 && j > size / 2) || (j == size - 1 && i >= size / 2);
            case 'H': return j == 0 || j == size - 1 || i == size / 2;
            case 'I': return i == 0 || i == size - 1 || j == size / 2;
            case 'J': return i == 0 || j == size / 2 || (i == size - 1 && j < size / 2);
            case 'K': return j == 0 || i + j == size / 2 || i - j == size / 2;
            case 'L': return j == 0 || i == size - 1;
            case 'M': return j == 0 || j == size - 1 || (i == j && i <= size / 2) || (i + j == size - 1 && i <= size / 2);
            case 'N': return j == 0 || j == size - 1 || i == j;
            case 'O': return i == 0 || i == size - 1 || j == 0 || j == size - 1;
            case 'P': return i == 0 || j == 0 || (i == size / 2 && j < size - 1) || (j == size - 1 && i < size / 2);
            case 'Q': return i == 0 || i == size - 2 || j == 0 || j == size - 2 || (i == size - 1 && j == size - 1);
            case 'R': return i == 0 || j == 0 || (i == size / 2 && j < size - 1) || (j == size - 1 && i < size / 2) || (i - j == size / 2);
            case 'S': return i == 0 || i == size - 1 || i == size / 2 || (j == 0 && i < size / 2) || (j == size - 1 && i > size / 2);
            case 'T': return i == 0 || j == size / 2;
            case 'U': return j == 0 || j == size - 1 || i == size - 1;
            case 'V': return j == i || j == size - i - 1;
            case 'W': return j == 0 || j == size - 1 || (i == j && i >= size / 2) || (i + j == size - 1 && i >= size / 2);
            case 'X': return i == j || i + j == size - 1;
            case 'Y': return i == j && i <= size / 2 || i + j == size - 1 && i <= size / 2 || j == size / 2 && i > size / 2;
            case 'Z': return i == 0 || i == size - 1 || i + j == size - 1;
            default: return false;
        }
    }
}
