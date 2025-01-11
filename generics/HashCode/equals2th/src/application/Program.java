package generics.HashCode.equals2th.src.application;

import generics.HashCode.equals2th.src.entities.UserEntity;

public class Program {

    public static void main ( String[] args ) {

        testingSomeStuff ();

    }

    private static void testingSomeStuff () {

        UserEntity userEntity = new UserEntity( "Mr.Duck", "mrduck@email.com" );

        UserEntity userEntity2 = new UserEntity( "Mr.Goose", "mrgoose@email.com" );

        System.out.println( userEntity.getUsername().hashCode() ); // -1368314014

        System.out.println( userEntity2.getUsername().hashCode() ); // 534542224

        int value = userEntity.compareTo( userEntity2 );

        System.out.println( value );

    }

}
