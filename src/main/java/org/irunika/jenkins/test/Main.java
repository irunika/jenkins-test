package org.irunika.jenkins.test;

import org.wso2.msf4j.MicroservicesRunner;

public class Main {

    public static void main(String[] args) {

        new MicroservicesRunner().deploy(new TestService()).start();
    }
}
