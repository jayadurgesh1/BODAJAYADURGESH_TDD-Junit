package com.epam_task;
import java.util.*;
public class App extends RemoveFirstTwoAs
{
    public static void main( String[] args )
    {
		Scanner s=new Scanner (System.in);
        System.out.println( "Enter String" );
        RemoveFirstTwoAs obj = new RemoveFirstTwoAs();
        String f=s.nextLine();
        System.out.println(obj.RemoveA(f));
    }
}
