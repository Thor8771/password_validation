package org.example.pwd;
import java.util.Scanner;
public class password {
        int f = 0;
        String str;
        int spchar = 0;
        int num = 0;
        int upper = 0;
        int whitespace = 0;
        String name;
        Scanner sc = new Scanner(System.in);

        public password() {
            System.out.println("enter the name");
            name = sc.nextLine();
        }

        public void takingInput() {

            System.out.println("enter your password");
            str = sc.nextLine();
        }
        public boolean passwordchecker() {

            char[] arr = str.toCharArray();
            spchar = 0;
            num = 0;
            upper = 0;
            whitespace = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '!' || arr[i] == '@' || arr[i] == '#' || arr[i] == '$' || arr[i] == '%' || arr[i] == '&'
                        || arr[i] == '*') {
                    spchar++;
                } else if (arr[i] == '0' || arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4'
                        || arr[i] == '5' || arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
                    num++;
                }

                else if (arr[i] == ' ') {
                    whitespace++;
                } else if (arr[i] == Character.toUpperCase(arr[i])) {
                    upper++;
                } else {
                    continue;
                }
            }
            int q = patternmatching(name, str);
            System.out.println(q);
            if (q == 1) {
                System.out.println("your password is matching by your name");
                return false;
            }

            else if (spchar >= 2 && num >= 2 && arr.length >= 7 && upper >= 2) {
                System.out.println("Very Strong password");

                return true;
            } else if (spchar >= 2 && num >= 2 && arr.length >= 7) {
                System.out.println("  Strong password");

                return true;
            }
            else {
                System.out.println("Weak password");
                values(spchar, num, upper);
            }

            return false;
        }

        public void values(int spchar, int num, int upper) {
            int spchar1 = spchar;
            int num1 = num;
            int upper1 = upper;
            if (num1 < 2 && spchar1 < 2 && upper1 < 2) {
                System.out.println("please enter minimum two upper case letter,two special char and two numbers");
            } else if (num1 < 2 && spchar1 < 2) {
                System.out.println("please enter minimum two specialchar and two number values");
            } else if (num1 < 2 && upper1 < 2) {
                System.out.println("please enter minimum two upper case letter and two number values");
            } else if (upper1 < 2 && spchar1 < 2) {
                System.out.println("please enter minimum two upper case letter and special char ");
            } else if (num1 < 2) {
                System.out.println("please write minimum two numbers");
            } else if (spchar1 < 2) {
                System.out.println("please enter minimum two specialchar");
            } else if (upper1 < 2) {
                System.out.println("please enter minimum two upper case letter");
            } else {
                System.out.println("special characters:" + spchar1);
                System.out.println("numbers:" + num1);
                System.out.println("upper case:" + upper1);
            }
        }

        public int patternmatching(String name, String str) {
            String name1 = name;
            String str1 = str;
            f = 0;
            char[] arr2 = str1.toCharArray();
            char[] arr1 = name1.toCharArray();
            int m = arr2.length;
            int n = arr1.length;
            for (int i = 0; i <= m - n; i++) {
                int j;
                for (j = 0; j < n; j++) {
                    if (arr2[i + j] != arr1[j]) {
                        break;
                    }
                }
                if (j == n) {
                    f = 1;
                }
            }
            if (f == 1) {
                return 1;
            } else {
                return 0;
            }
        }
     
    }
