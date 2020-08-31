package com.vihas;


import java.util.Scanner;

class Time {
    static int[][] timetable = new int[7][9];

    void PSYsection1() {
        timetable[1][8] = 11;
        timetable[3][8] = 11;
        timetable[5][3] = 11;
        timetable[3][1] = 11;
    }

    void PSYsection2() {
        timetable[1][8] = 12;
        timetable[3][8] = 12;
        timetable[5][3] = 12;
        timetable[3][1] = 12;
    }

    void PSYsection3() {
        timetable[1][2] = 13;
        timetable[3][4] = 13;
        timetable[5][6] = 13;
        timetable[3][1] = 13;
    }


    void TDsection1() {
        timetable[1][3] = 21;
        timetable[2][3] = 21;
        timetable[6][3] = 21;
        timetable[4][8] = 21;
    }

    void TDsection2() {
        timetable[1][3] = 22;
        timetable[2][3] = 22;
        timetable[6][3] = 22;
        timetable[3][3] = 22;
    }

    void TDsection3() {
        timetable[1][4] = 23;
        timetable[2][3] = 23;
        timetable[3][3] = 23;
        timetable[6][3] = 23;
    }


    void CVsection1() {
        timetable[1][6] = 31;
        timetable[3][6] = 31;
        timetable[5][7] = 31;
        timetable[1][1] = 31;
    }

    void CVsection2() {
        timetable[1][6] = 32;
        timetable[3][6] = 32;
        timetable[5][7] = 32;
        timetable[1][1] = 32;
    }

    void CVsection3() {
        timetable[1][6] = 33;
        timetable[3][6] = 33;
        timetable[5][7] = 33;
        timetable[1][1] = 33;
    }


    void POMsection1() {
        timetable[2][8] = 41;
        timetable[4][1] = 41;
        timetable[4][7] = 41;
        timetable[2][7] = 41;
    }

    void POMsection2() {
        timetable[3][7] = 42;
        timetable[4][1] = 42;
        timetable[4][7] = 42;
        timetable[2][7] = 42;
    }

    void POMsection3() {
        timetable[3][8] = 43;
        timetable[4][1] = 43;
        timetable[4][7] = 43;
        timetable[2][7] = 43;
    }

    void POEsection1() {
        timetable[2][1] = 51;
        timetable[3][4] = 51;
        timetable[3][7] = 51;
        timetable[5][1] = 51;
    }

    void POEsection2() {
        timetable[2][1] = 52;
        timetable[4][6] = 52;
        timetable[5][8] = 52;
        timetable[5][1] = 52;
    }

    void POEsection3() {
        timetable[2][1] = 53;
        timetable[3][7] = 53;
        timetable[4][6] = 53;
        timetable[5][1] = 53;
    }


    void OOPsection1() {
        timetable[2][2] = 61;
        timetable[4][4] = 61;
        timetable[6][2] = 61;
        timetable[6][1] = 61;
    }

    void OOPsection2() {
        timetable[2][2] = 62;
        timetable[4][4] = 62;
        timetable[6][2] = 62;
        timetable[6][1] = 62;
    }

    void OOPsection3() {
        timetable[2][2] = 63;
        timetable[4][4] = 63;
        timetable[6][2] = 63;
        timetable[6][1] = 63;
    }

    void SPMsection1() {
        timetable[2][4] = 71;
        timetable[4][2] = 71;
        timetable[6][6] = 71;
        timetable[6][8] = 71;
    }

    void SPMsection2() {
        timetable[2][4] = 72;
        timetable[4][2] = 72;
        timetable[6][6] = 72;
        timetable[6][8] = 72;
    }

    void SPMsection3() {
        timetable[2][4] = 73;
        timetable[4][2] = 73;
        timetable[6][6] = 73;
        timetable[6][8] = 73;
    }
}

class Check {

    static int i, j, test;
    static int a1 = 0;
    static int a2 = 0;
    static int a3 = 0;
    static int a4 = 0;
    static int a5 = 0;
    static int a6 = 0;
    static int a7 = 0;

    static boolean check(int timetable[][]) {
        for (i = 1; i < 7; i++) {
            for (j = 1; j < 9; j++) {
                test = timetable[i][j] / 10;
                if (test == 1)
                    a1++;
                else if (test == 2)
                    a2++;
                else if (test == 3)
                    a3++;
                else if (test == 4)
                    a4++;
                else if (test == 5)
                    a5++;
                else if (test == 6)
                    a6++;
                else if (test == 7)
                    a7++;
            }
        }
        if (a1 == 4 && a2 == 4 && a3 == 4 && a4 == 4 && a5 == 4 && a6 == 4 && a7 == 4)
            return (true);
        else {
            System.out.println("The chosen timetable does not match with your academic requirement,Please restart your session again ");
            return (false);
        }
    }


    static void display(int arr1[][]) {
        System.out.println("      1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t ");
        int x, y;
        String[] days = {"", "MON  ", "TUE  ", "WED  ", "THU  ", "FRI  ", "SAT  "};
        for (x = 1; x < 7; x++) {
            System.out.print(days[x]);
            for (y = 1; y < 9; y++) {
                //System.out.print(arr1[x][y] + "\t");
                switch (arr1[x][y]) {
                    case 11: {
                        System.out.print("PSY1 ");
                        break;
                    }
                    case 12: {
                        System.out.print("PSY2 ");
                        break;
                    }
                    case 13: {
                        System.out.print("PSY3 ");
                        break;
                    }
                    case 21: {
                        System.out.print("TD1 ");
                        break;
                    }
                    case 22: {
                        System.out.print("TD2 ");
                        break;
                    }
                    case 23: {
                        System.out.print("TD3 ");
                        break;
                    }
                    case 31: {
                        System.out.print("CV1 ");
                        break;
                    }
                    case 32: {
                        System.out.print("CV2 ");
                        break;
                    }
                    case 33: {
                        System.out.print("CV3 ");
                        break;
                    }
                    case 41: {
                        System.out.print("POM1 ");
                        break;
                    }
                    case 42: {
                        System.out.print("POM2 ");
                        break;
                    }
                    case 43: {
                        System.out.print("POM3 ");
                        break;
                    }
                    case 51: {
                        System.out.print("POE1 ");
                        break;
                    }
                    case 52: {
                        System.out.print("POE2 ");
                        break;
                    }
                    case 53: {
                        System.out.print("POE3 ");
                        break;
                    }
                    case 61: {
                        System.out.print("OOP1 ");
                        break;
                    }
                    case 62: {
                        System.out.print("OOP2 ");
                        break;
                    }
                    case 63: {
                        System.out.print("OOP3 ");
                        break;
                    }
                    case 71: {
                        System.out.print("SPM1 ");
                        break;
                    }
                    case 72: {
                        System.out.print("SPM2 ");
                        break;
                    }
                    case 73: {
                        System.out.print("SPM3 ");
                        break;
                    }
                    case 0: {
                        System.out.print("FRE ");
                        break;
                    }
                    default: {
                        System.out.print("ERROR");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}

class Main {

    public static void main(String[] args) {
        Time proj = new Time();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the section for Psychology:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.PSYsection1();
                break;
            }
            case 2: {
                proj.PSYsection2();
                break;
            }
            case 3: {
                proj.PSYsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);

            }
        }
        System.out.println("please enter the section for Thermodynamics:");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.TDsection1();
                break;
            }
            case 2: {
                proj.TDsection2();
                break;
            }
            case 3: {
                proj.TDsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        System.out.println("please enter the section for Complex variables");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.CVsection1();
                break;
            }
            case 2: {
                proj.CVsection2();
                break;
            }
            case 3: {
                proj.CVsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        System.out.println("please enter the section for Principles of Management:");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.POMsection1();
                break;
            }
            case 2: {
                proj.POMsection2();
                break;
            }
            case 3: {
                proj.POMsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        System.out.println("please enter the section for Principles of Economics");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.POEsection1();
                break;
            }
            case 2: {
                proj.POEsection2();
                break;
            }
            case 3: {
                proj.POEsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        System.out.println("please enter the section for Java");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.OOPsection1();
                break;
            }
            case 2: {
                proj.OOPsection2();
                break;
            }
            case 3: {
                proj.OOPsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        System.out.println("please enter the section for Structures and Properties of Materials");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                proj.SPMsection1();
                break;
            }
            case 2: {
                proj.SPMsection2();
                break;
            }
            case 3: {
                proj.SPMsection3();
                break;
            }
            default: {
                System.out.println("You have entered the wrong input please start the process again");
                System.exit(0);
            }
        }
        if (Check.check(proj.timetable))
            Check.display(proj.timetable);
        else
            System.out.println("Boohoo");
    }
