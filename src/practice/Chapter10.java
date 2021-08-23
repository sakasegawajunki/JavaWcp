package practice;

import java.sql.SQLException;

public class Chapter10 {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            Chapter10.validIndex(array, 2);
            Chapter10.validIndex(array, 3);


            System.out.println("validIndex�̌Ăяo���I��");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException���������܂���");

            e.printStackTrace();
        }


        try {
            Chapter10.throwSQLException();
        } catch (SQLException e) {
            System.out.println("SQLException���������܂���");

            e.printStackTrace();
        } finally {

            System.out.println("throwSQLException�̌Ăяo���I��");
        }

        System.out.println("main���\�b�h�I��");
    }


    public static void validIndex(int[] array, int index) {
        if (array.length <= index) {
            throw new IllegalArgumentException(index + " �̓T�C�Y�͈̔͊O�ł�");
        }
        System.out.println("�C���f�b�N�X " + index + " �̗v�f�� " + array[index] + " �ł�");
    }

    public static void throwSQLException() throws SQLException {

        throw new SQLException("SQL�G���[�ł�");
    }
}
