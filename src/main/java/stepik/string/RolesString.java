package stepik.string;

public class RolesString {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(roles, textLines));
    }

    static String[] roles = {
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"
    };

    static String[] textLines = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i< roles.length; i++) {
            result.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    result.append(j + 1).append(")").append(textLines[j].replaceFirst(roles[i] + ":", "")).append("\n");
                }

            }
            result.append("\n");
        }

        return result.toString();
    }










    private static String printTextPerRoleOld(String[] roles, String[] textLines) {
        String result = "";
        int countLines = 0;
        int countLastLine = 0;
        for (int i = 0; i< roles.length; i++) {
            for (String text : textLines) {
                countLines++;
                if (text.indexOf(roles[i]) == 0) {
                    countLastLine++;
                    if (countLastLine == 1)
                        result += roles[i] + ":\n";
                    result += countLines + ")" + text.substring(roles[i].length() + 1) + "\n";

                }
            }
            countLines = 0;
            countLastLine = 0;

            if (i< roles.length-1) {
                result += "\n";;
            }
        }
        return result;
    }

}
