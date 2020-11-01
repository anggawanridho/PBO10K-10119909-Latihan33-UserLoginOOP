package user_login_oop;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan33 {

    private static String usName, passWord;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scanner.nextLine();
        User user1 = new User();
        user1.pengecekkanLogin(usName,passWord);
    }
}
