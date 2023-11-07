public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Удаляем из строки все символы, не являющиеся буквами и цифрами
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
        // Преобразуем строку в нижний регистр
        cleanStr = cleanStr.toLowerCase();
        // Создаем StringBuilder из очищенной строки
        StringBuilder reversed = new StringBuilder(cleanStr).reverse();
        // Сравниваем исходную очищенную строку с ее перевернутой версией
        return cleanStr.equals(reversed.toString());
    }

    public static void main(String[] args) {
        // Пример использования метода isPalindrome
        System.out.println(isPalindrome("Madam, I'm Adam!")); // Вывод: true
        System.out.println(isPalindrome("race a car")); // Вывод: false
    }
}
