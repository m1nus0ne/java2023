package org.example;

import de.vandermeer.asciitable.AsciiTable;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var name = scn.nextLine();
        System.out.printf("Hello %s!\n", name);

        AsciiTable at = new AsciiTable();
        at.addRule();
        for (int i = 0; i <= 90; i += 5) {
            var d = Math.toRadians(i);
            at.addRow(i, Math.cos(d), Math.sin(d));
            at.addRule();
        }
        var out = at.render();
        System.out.print(out);
    }
}