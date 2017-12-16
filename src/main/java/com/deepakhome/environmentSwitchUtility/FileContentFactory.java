package com.deepakhome.environmentSwitchUtility;

import java.util.Random;
import java.util.UUID;

/**
 * Created by deepu on 16/12/17.
 */
public class FileContentFactory {



    public static  void modifyPropsFile(String url , boolean isDocker){

        if(isDocker) {
            String userName = writeDockerFileContent(); //Use this userName for point 2 and 3 below
        }

        /*
        1. Update url in the properties file to passed url
        2. If isDocker is true , there's a field in the properties file that needs the name of the container we specify in docker compose file.
        3. Also if isDocker is true , then in that case we also need to write the docker compose file , assigning random port
        and random unique containerName.

         We achieve point 2 and 3 , by calling getDockerFileContent which writes the docker config file and returns the name used in that file
         */


    }


    private static String writeDockerFileContent() {
        String dockerContainerName = System.getProperty("user.name")+ UUID.randomUUID();
        int portNumber = getRandomPort();

        //Write Docker File using above containerName and portNumber. Rest all is fixed text.
        /**
         * Sample Docker file :
         * Some line in docker file
         * Some other line
         * port Numbers = getRandomPortNumber
         * dockerContainerName;
         */

        return dockerContainerName;
    }

    private static int getRandomPort() {

        return (new Random()).nextInt(100) - 25 ; // Port to be between 24 and 99

    }
}
