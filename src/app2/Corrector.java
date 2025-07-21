package app2;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (String str : strs) {
            // Просте виправлення: заміна 'b' на 'o', 'ib' на 'io' тощо.
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            if (str.contains("ib")) {
                str = str.replace("ib", "io");
            }

            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }

        return stringBuilder.toString();
    }
}
