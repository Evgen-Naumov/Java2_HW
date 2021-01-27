package Lesson2.hw2;

import java.lang.reflect.Array;

public class hw2 {
    public static void main(String[] args) {
        String[] arrSourse = {"1", "2", "3", "4", "5", "a", "f", "6", "r", "y", "f", "6", "10", "55"};
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arrSourse[(int) (Math.random() * 10 + (arrSourse.length - 10))];
            }
        }

        except(arr);
    }

    private static void except(String[][] arr) {
        if (!(arr.length == 4)) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    res = Integer.parseInt(arr[i][j]);
                    System.out.printf("Элемент массива [%d][%d] = %s прибавлем к %d", i, j, arr[i][j].toString(), sum);
                    System.out.println();

                    sum += res;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr[i][j].toString());
                } finally {
                    continue;
                }

            }

        }
        System.out.printf("Сумма всех возможных элементов массива = %d", sum);
    }

    public static class MyArraySizeException extends ArrayIndexOutOfBoundsException {
        public MyArraySizeException() {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static class MyArrayDataException extends NumberFormatException {
        public MyArrayDataException(int i, int j, String str) {
            System.out.printf("Элемент массива [%d][%d] = %s пропускаем, т.к. не является числом", i, j, str);
            System.out.println();
        }
    }

}


