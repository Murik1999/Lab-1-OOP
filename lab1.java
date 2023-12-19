import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Comparator;
public class Main
{
public static void main(String[] args)
{
int n = 0;
System.out.println("Введите число");
Scanner sc1 = new Scanner(System.in);
n = sc1.nextInt();
String[] mass = new String[n];
for (int i = 0 ; i < n; i ++){
System.out.println("введите " + (i + 1) + " строку");
Scanner sc2 = new Scanner(System.in);
mass[i] = sc2.next();

}
Arrays.sort(mass, Comparator.comparing(String::length));
int len = mass[0].length();
System.out.println(len + " " + mass[0]);

}
}