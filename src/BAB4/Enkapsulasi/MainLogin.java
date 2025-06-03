/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;
import java.util.Scanner;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class MainLogin {
    public static void main(String[] args) {
        Login loginSystem = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = loginSystem.CekLogin(username, password);

        if (isAuthenticated) {
            System.out.println("Login berhasil. Selamat datang, " + loginSystem.nama + "!");
        } else {
            System.out.println("Login gagal. Silakan periksa kembali username dan password Anda.");
        } 
    }
}

