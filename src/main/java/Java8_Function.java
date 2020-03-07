/*
 * Copyright (c) 2020. YD
 */

import java.io.File;
import java.io.FileFilter;

/**
 * <h3>JAVA_Project</h3>
 *
 * @author : YangDa
 * @date : 2020-03-07
 **/
public class Java8_Function {


    public static void main(String[] args) {
        File[] hiddenFiles = new File("D:\\").listFiles(File::isHidden);

        File[] hiddenFiles2 = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
    }



}
