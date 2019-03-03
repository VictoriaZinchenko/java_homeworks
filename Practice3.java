package com.groupqa1;
public class Practice3 {
    public static void main(String[] args) {
        // Triangle number 1
        int triangleLength = 10;
        int counter = 0;
        while (counter < triangleLength) {
            int star = counter;
            while (star >= 1) {
                System.out.print('*');
                star--;

            }
            counter++;
            System.out.println();
        }
        while (triangleLength >= 1) {
            int star1 = triangleLength;
            while (star1 >= 1) {
                System.out.print('*');
                star1--;
            }
            triangleLength--;
            System.out.println();

        }
        //  Triangle number 2
        int triangleLength2 = 10;
        int counter2 = 0;
        while (counter2 <= triangleLength2) {
            counter2++;
            int empty = counter2;
            int star2 = triangleLength2 - empty;
            while (empty > 0) {
                System.out.print(' ');
                empty--;
            }
            while (star2 > 0) {
                System.out.print('*');
                star2--;
            }
            System.out.println();
        }
        //  Triangle number 3
        int triangleLength3= 10;
        int counter3 = 0;
        int star3 = 0;
        while (counter3 <= triangleLength3) {
            while (star3 < triangleLength3 - counter3) {
                System.out.print(' ');
                star3++;
            }
            star3 = counter3;
            while (star3 > 0) {
                System.out.print('*');
                star3--;
            }
            counter3++;
            System.out.println();
        }

        //  Triangle number 4
        int triangleLength41= 10;
        int counter41 = 0;
        int star41 = 0;
        while (counter41 <= triangleLength41) {
            while (star41 < triangleLength41 - counter41) {
                System.out.print(' ');
                star41++;
            }
            star41 = counter41;
            while (star41 > 0) {
                System.out.print('*');
                star41--;
            }
            counter41++;
            System.out.println();
        }
        int triangleLength42 = 10;
        int counter42 = 0;
        while (counter42 <= triangleLength42) {
            counter42++;
            int empty4 = counter42;
            int star42 = triangleLength42 - empty4;
            while (empty4 > 0) {
                System.out.print(' ');
                empty4--;
            }
            while (star42 > 0) {
                System.out.print('*');
                star42--;
            }
            System.out.println();
        }
        //  Triangle number 5
        int triangleLength51 = 10;
        int counter51 = 0;
        int counter52 =0;
        int  triangleLength52 = 10;
        while(counter51 < triangleLength51){
            int star51 = 0;
            while (star51 < triangleLength51 - counter51) {
                System.out.print(' ');
                star51++;
            }
            int empty51 = 0;
            while (empty51 < counter51*2 + 1) {
                System.out.print('*');
                empty51++;
            }
            System.out.println();
            counter51++;
        }

        while(counter52 < triangleLength52){
            int star52 = 0;
            while (star52 < triangleLength52 - counter52) {
                System.out.print(' ');
                star52++;
            }
            int empty52 = 0;
            while (empty52 < counter52*2 + 1) {
                System.out.print('*');
                empty52++;
            }
            System.out.println();
            counter52++;
        }
    }

}



