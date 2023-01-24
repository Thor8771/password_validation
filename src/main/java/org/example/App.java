package org.example;

import org.example.pwd.password;
public class App 
{
    public static void main( String[] args )
    {
        password Password = new password();
        boolean s = false;
        while (!s) {
            Password.takingInput();
            s = Password.passwordchecker();
        }
    }
}
