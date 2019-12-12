/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    //Constantes
    public static final int N1 = '7';
    public static final int N2 = 0100;
    public static final int N3 = 88;
    public static final int N4 = 0x0062;
    public static final int N5 = 126;
    public static final int N6 = 0251;
    public static final int N7 = 'Ω';
    public static final int N8 = 1161;
    public static final int N9 = 0x058D;
    public static final int N10 = '٨';
    public static final int N11 = 8359;
    public static final int N12 = 0x20AC;
    public static final int N13 = '㉇';
    public static final int N14 = 13357;
    public static final int N15 = 0xE2C6;

    public void launchApp() {
        System.out.println("  # Octal     Decimal       Unicode   Símbolo");
        System.out.println("=== ========= ============= ========= =======");
        calcular(1, N1);
        calcular(2, N2);
        calcular(3, N3);
        calcular(4, N4);
        calcular(5, N5);
        calcular(6, N6);
        calcular(7, N7);
        calcular(8, N8);
        calcular(9, N9);
        calcular(10, N10);
        calcular(11, N11);
        calcular(12, N12);
        calcular(13, N13);
        calcular(14, N14);
        calcular(15, N15);

    }

    public static void calcular(int linea, int n) {
        //Conversiones
        System.out.printf(" %2d ", linea);
        String octa = "\'\\" + Integer.toOctalString(n) + "'";
        System.out.printf("%-10s", octa);
        System.out.printf("(char)%-8d", n);
        String hex = String.format("\'\\" + "u".toLowerCase() + String.format(
                "%04d", Integer.parseInt(Integer.toHexString(n),16)) + "'");
        System.out.printf("%-10s", hex);
        char c = (char) n;
        System.out.printf("\'%c\'%n", c);
    }

}
