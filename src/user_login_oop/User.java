package user_login_oop;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */
public class User {
    private String username = "RizkiAdam";
    private String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun (String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) {
            return statusAkun =true;
        }
        else {
            return statusAkun = false;
        }
    }

    private void hasilLogin (boolean status, String parUserName) {
        status = statusAkun;
        if (status) {
            System.out.printf("%n******HALO %s******%n",parUserName.toUpperCase());
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin (String parUserName, String parPassword) {
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun,parUserName);
    }
}
