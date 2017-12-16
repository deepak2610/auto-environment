package JBehavToGherkinConverter;

import java.io.File;
import java.util.LinkedList;

/**
 * Created by deepu on 16/12/17.
 */


public class GherkinConverter {

    public static void main(String[] args) {

        //Almost Everything in main method. looks very bad.

        /**
         *
         * for (File currentFile : ParentDirectory)    Parent Directory : resources/stories
         *      convertToGherkin(currentFile);
         */
    }


    private static void convertToGherkin(File currentFile) {
        LinkedList<String> allLines = new LinkedList<String>();


        /**
         *add each line in file to a allLines list using an iterator.
         * Iterate through the list , and check few rules. Rules also checked in the same method
         * example .
         * if(thisLine.endsWith(":")) {
         *      allLines.remove(thisLine);
         *   }
         *   Remove the line from list , if the line is not allowed according to rle checks
         *   After each line goes through all the rules, all the remaining lines in the linkedList are written to the
         *   file using BufferendWriter , in a separate folder.
         *
         *
         * All this stuff is in this same method. It is around 70 lines of code.
         * 
         *
         *  How to break it to methods , what should be the classes, and their names ?
         *  How should I decide to use static / Instance variables here, if both work well
         */

    }


}

