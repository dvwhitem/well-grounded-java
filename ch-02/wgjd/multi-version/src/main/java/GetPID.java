package main.java;

import java.lang.management.ManagementFactory;

public class GetPID {

    public static long getPid() {
        System.out.print("Java version... ");
        System.out.println(System.getProperty("java.version"));

        final String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        final int index = jvmName.indexOf('@');
        if(index < 1) {
            return 0;
        }

        try {
            return Long.parseLong(jvmName.substring(0, index));
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }
}
