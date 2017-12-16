package com.deepakhome.environmentSwitchUtility;


import javax.swing.*;

/**
 * Created by deepu on 16/12/17.
 */
public class FileMaker {


    //Kept all the global variables static , so they can be accessed by the static main method without instatiating the class.
    //No good reason to do /not do it this way.

    static String variable1;
    static String someOtherVariable;
    static boolean isDocker;
    static Environment env;


    public static void main(String[] args) {
        String dockerFlag = JOptionPane.showInputDialog("Docker ? Enter Y or N");   //Set isDocker based on this
        String environment = JOptionPane.showInputDialog("Enter Environment : (Sit / qa / dev /prod /uat)");

        setEnvironment(environment);
        String url = getEnvironmentURL(env);
        FileContentFactory.modifyPropsFile(url,isDocker);

        if(isDocker) {
            runDockerCompose();
        }

        else {
            runHubAndNode();
        }

    }

    private static void setEnvironment(String environment) {
        /** set global 'env' value based on passed environment
         *
         * for example :
         * if (environment = sit) env =Environment.SIT ;
         */
    }


    private static String getEnvironmentURL(Environment env) {
        /**
         * return a String url based on the env.
         *
         * example  :
         * Switch (env)
         *        case Environment.SIT return "someSitUrl.com";
         */

        return new String() ;// someStrToMakeThisMethodValid);
    }

    private static void runDockerCompose() {
        /**
         * Get system runtime and execute a command
         */
    }

    private static void runHubAndNode() {
        /**
         * Get system runtime and run couple of commands
         */
    }











}
