package view;



/**
 * Created by cuan on 9/21/15.
 */
public abstract class TestWorlds {
    public static char[][] getSmallMap(){
        char[][]result = {
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},};
        return result;
    }
    public static char[][] getSmallObjectMap(){
        char[][]result = {
                {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','K','W'},
                {'W','0','E','0','0','0','0','0','E','0','0','0','0','E','0','0','W','C','C','W'},
                {'W','0','E','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','C','W'},
                {'W','0','E','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','C','W'},
                {'W','0','E','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','C','W'},
                {'W','0','E','C','0','0','0','0','0','0','0','0','0','0','0','0','W','D','W','W'},
                {'W','0','E','0','0','0','0','0','0','0','0','0','B','0','0','0','0','0','0','W'},
                {'W','0','E','0','0','0','E','0','0','0','0','0','0','0','0','0','E','0','0','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','E','0','0','0','0','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','D'},
                {'W','W','W','W','W','0','0','E','E','C','0','0','0','0','0','0','C','0','0','W'},
                {'W','K','0','0','W','C','0','E','E','0','0','0','0','0','E','0','0','0','0','W'},
                {'W','C','0','0','C','C','0','0','0','0','0','C','0','0','0','0','0','0','C','W'},
                {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},};
        return result;
    }
    public static char[][] getFullMap(){
        char[][]result = {


                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'},


        };
        return result;
    }

    public static char[][] getFullObjectMap(){
        char[][]result = {


                {'V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V'},
                {'V','0','0','0','V','0','0','0','0','E','0','0','E','0','0','0','0','V','K','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','C','C','V'},
                {'V','0','C','0','V','0','0','0','0','0','0','0','V','V','V','0','0','V','K','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','V','0','0','V','V','V','0','0','V','0','V','0','0','V','K','V','0','0','0','E','0','0','0','0','E','0','0','0','0','E','0','0','V','0','E','V'},
                {'V','0','C','0','V','0','0','V','0','V','0','0','V','V','V','0','0','V','K','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','V','0','E','V','V','V','0','0','0','0','0','0','0','V','0','V','0','0','0','0','0','0','V','V','V','V','V','0','V','V','V','V','V','0','0','V'},
                {'V','0','C','0','V','0','0','0','0','0','0','0','0','0','0','0','0','V','0','V','0','E','0','0','0','0','V','0','0','0','0','0','0','0','0','0','V','V','0','V'},
                {'V','0','0','0','V','0','0','0','0','0','0','0','0','0','E','0','0','V','0','V','0','0','0','0','0','0','V','C','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','V','0','0','0','0','0','E','0','0','0','0','0','0','V','0','V','0','0','0','0','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','E','0','V','0','0','V','V','V','0','0','V','V','V','0','0','V','0','V','0','0','0','V','V','V','V','V','V','V','V','V','V','V','V','V','V','0','0','V'},
                {'V','0','0','0','V','0','0','V','0','V','0','0','V','0','V','0','0','V','0','V','0','0','0','V','B','V','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','V','0','0','V','V','V','0','0','V','V','V','0','0','V','0','V','0','E','0','V','0','V','0','0','0','0','0','0','0','0','V','V','V','0','0','V'},
                {'V','0','E','0','V','0','0','0','0','0','0','0','0','0','0','0','0','V','0','V','V','0','V','V','E','V','0','0','0','0','0','0','0','0','V','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','0','E','0','0','0','E','0','0','V','0','V','0','0','V','0','0','V','0','0','0','0','0','0','0','0','V','0','V','0','0','V'},
                {'V','0','0','0','V','0','0','V','0','E','0','V','E','0','0','V','0','V','X','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','C','C','V'},
                {'V','0','C','0','V','V','0','0','0','V','0','0','0','V','E','0','0','V','K','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','V','0','0','V','0','0','0','V','0','0','0','V','0','V','K','V','0','0','0','E','0','0','0','0','E','0','0','0','0','E','0','0','V','0','E','V'},
                {'V','0','C','0','V','V','0','0','0','V','0','0','0','V','0','0','0','V','K','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','V','0','E','V','0','0','0','V','0','0','0','V','0','V','0','V','0','0','0','0','0','0','V','V','V','V','V','0','V','V','V','V','V','0','0','V'},
                {'V','0','C','0','V','V','0','0','0','V','0','0','0','V','0','0','0','V','0','V','0','E','0','0','0','0','V','0','0','0','0','0','0','0','0','0','V','V','0','V'},
                {'V','0','0','0','V','0','0','V','0','0','0','V','0','0','E','V','0','V','0','V','0','0','0','0','0','0','V','C','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','V','V','0','0','0','V','E','0','0','V','0','0','0','V','0','V','0','0','0','0','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','E','0','V','0','0','V','0','0','0','V','0','0','0','V','0','V','0','V','0','0','0','V','V','V','V','V','V','V','V','V','V','V','V','V','V','0','0','V'},
                {'V','0','0','0','V','V','0','0','0','V','0','0','0','V','0','0','0','V','0','V','0','0','0','V','B','V','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','V','0','0','V','E','0','0','V','0','0','0','V','0','V','0','V','0','E','0','V','0','V','0','0','0','0','0','0','0','0','V','V','V','0','0','V'},
                {'V','0','E','0','V','V','0','0','0','V','0','0','0','V','0','0','0','V','0','V','V','0','V','V','E','V','0','0','0','0','0','0','0','0','V','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','V','0','0','E','V','0','0','E','V','0','V','0','V','0','0','V','0','0','V','0','0','0','0','0','0','0','0','V','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','V','V','V','V','V','V','V','0','V','0','V','0','0','V','0','E','V','0','V','V','V','V','V','V','0','V','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','V','0','V','0','0','0','0','V','0','0','V','0','V','0','E','V','0','0','V','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','V','C','V','0','0','0','0','V','0','0','V','0','0','0','0','V','0','E','V','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','V','V','V','0','E','0','0','V','0','0','V','0','V','E','0','V','0','0','0','0','0','E','0','0','0','E','0','0','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V','0','V','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','V','0','V','0','0','V','C','0','0','C','0','0','0','C','0','0','0','C','0','V','0','0','V'},
                {'V','0','0','0','0','V','V','V','V','V','V','0','0','0','V','0','E','V','D','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','0','V'},
                {'V','0','0','0','0','V','C','0','0','0','0','0','0','0','V','0','0','C','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','V','C','0','0','0','0','0','0','0','V','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','V','V','V','V','V','V','V','V','V','V','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','V','0','0','0','0','0','V','C','0','C','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','E','0','V','0','0','0','0','0','V','0','0','0','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','V','0','0','0','0','0','V','0','C','0','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','0','0','0','0','0','0','0','0','0','0','D','C','0','C','0','0','D','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','V'},
                {'V','V','V','V','V','V','V','V','D','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V','V'},
                {'W','0','0','0','0','0','0','0','0','K','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','M','M','M','M','M','M','M','M','M','M','M','M','M','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','0','0','0','0','0','E','0','0','0','0','0','C','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','0','0','0','0','0','0','0','0','0','0','0','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','M','M','M','M','M','M','M','M','M','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','0','0','0','E','0','0','0','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','0','0','0','0','C','0','0','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','M','M','M','M','M','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','0','0','0','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','W','W','W','W','W','W','W','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','0','0','0','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','S','S','S','S','S','S','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','M','M','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','M','M','M','M','M','S','W','C','0','0','0','0','0','0','0','M','0','D','0','D','0','D','X','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','M','V','V','V','M','S','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','M','K','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','M','V','K','V','M','S','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','M','K','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','M','V','0','V','M','S','W','C','0','0','0','0','0','0','0','M','0','M','E','M','0','M','K','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','M','M','Y','M','M','S','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','M','0','M','E','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','C','W','S','S','S','Y','S','S','S','W','C','0','0','0','0','0','0','0','M','C','M','0','M','C','M','0','M','0','M','0','M','E','M'},
                {'W','0','0','0','0','0','0','C','W','W','W','W','0','W','W','W','W','C','0','0','0','0','0','0','0','M','0','M','0','M','0','M','0','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','M','0','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','M','0','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','M','0','M','0','M','0','M','C','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','0','0','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','M','0','0','C','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','E','M','M','M','M','M','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','0','0','0','0','0','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','0','0','0','0','0','0','0','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','M','M','M','M','M','M','M','M','M','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','0','0','0','C','0','0','0','0','0','C','M','0','M'},
                {'W','0','K','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','0','0','E','0','0','0','0','0','0','0','0','M','0','M'},
                {'W','0','0','0','0','0','0','0','Z','Z','Z','0','0','0','0','0','0','0','0','0','0','0','0','0','0','M','M','M','M','M','M','M','M','M','M','M','M','M','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','D','0','0','0','0','0','0','0','0','0','0','0','0','0','M'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','K','M','0','0','0','0','0','0','0','0','0','0','0','0','0','M'},
                {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','M','M','M','M','M','M','M','M','M','M','M','M','M','M','M'},

        };
        return result;
    }



    public static char[][] getMazeTiles(){
        char[][]result = {
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'},
                {'g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g','g'}};
        return result;
    }
    public static char[][] getMazeObjects(){
        char[][]result = {
                {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','C','W','E','0','E','0','E','0','0','W','W','W','W','W','W','W','W','W','W','W','W','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W','C','C','W','W','W','W','W','W','W','0','W','W','W','W','W','W','W','W','W','W','W','W','W'},
                {'W','0','0','0','0','0','0','0','T','0','0','0','0','0','0','0','W','0','0','W','W','W','W','W','W','W','0','W','W','0','0','0','0','0','0','W','W','W','W','W'},
                {'W','0','0','0','0','K','0','T','0','0','0','0','0','0','0','0','W','0','0','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','T','0','0','0','0','0','0','0','0','W','0','0','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','T','T','T','0','0','T','0','0','0','0','0','W','D','W','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','B','0','0','0','0','0','0','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','E','0','T','T','T','0','0','0','0','0','0','0','0','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','0','0','K','0','0','0','0','0','0','0','0','0','W','W','W','W','W','W','W','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','D','0','0','0','W','W','0','W','0','0','W','C','C','C','C','C','W'},
                {'W','W','W','0','0','K','0','0','0','0','0','0','0','0','D','0','0','0','0','W','0','W','W','W','W','W','0','W','W','0','W','0','W','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W','0','W','W','W','W','W','0','W','W','0','W','0','W','W','C','C','C','C','C','W'},
                {'W','0','0','0','0','0','0','0','0','0','0','C','0','0','0','0','0','0','0','0','0','W','W','W','W','W','0','0','0','0','W','0','W','W','C','C','C','C','C','W'},
                {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','0','W','W','W','W','W','W','W','W'}};
        return result;
    }













}
